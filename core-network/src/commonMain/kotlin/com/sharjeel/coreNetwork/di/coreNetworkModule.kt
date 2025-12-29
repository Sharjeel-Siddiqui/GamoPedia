package com.sharjeel.coreNetwork.di

import com.sharjeel.coreNetwork.apiService.ApiService
import com.sharjeel.coreNetwork.client.KtorClient
import org.koin.dsl.module


fun getCoreNetworkModule() = module {
    single { ApiService(httpClient = KtorClient.getInstance()) }
}