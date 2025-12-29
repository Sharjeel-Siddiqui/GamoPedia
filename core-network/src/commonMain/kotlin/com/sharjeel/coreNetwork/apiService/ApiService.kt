package com.sharjeel.coreNetwork.apiService

import com.sharjeel.coreNetwork.model.game.GameResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.parameter

class ApiService(val httpClient: HttpClient) {

    suspend fun getGames(): Result<GameResponse> {
        return try {
            val response = httpClient.get("api/games") {
                url {
                    parameter(
                        "key", "4c858db1a805470fbee40d7075172ee7"
                    ) //we can pass token over here instead could be stored in DataStore !
                }
            }.body<GameResponse>()
            Result.success(response)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}