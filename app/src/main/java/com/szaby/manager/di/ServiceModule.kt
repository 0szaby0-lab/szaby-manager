package com.szaby.manager.di

import com.szaby.manager.network.service.AssetDownloader
import com.szaby.manager.network.service.HttpService
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val serviceModule = module {
    singleOf(::HttpService)
    singleOf(::AssetDownloader)
}