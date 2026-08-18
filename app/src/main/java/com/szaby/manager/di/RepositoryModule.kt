package com.szaby.manager.di

import com.szaby.manager.data.platform.Filesystem
import com.szaby.manager.data.platform.NetworkInfo
import com.szaby.manager.domain.repository.*
import com.szaby.manager.domain.worker.WorkerRepository
import com.szaby.manager.network.api.MorpheAPI
import com.szaby.manager.util.AppDataResolver
import org.koin.core.module.dsl.createdAtStart
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val repositoryModule = module {
    singleOf(::MorpheAPI)
    singleOf(::Filesystem) {
        createdAtStart()
    }
    singleOf(::NetworkInfo)
    singleOf(::ManagerUpdateRepository)
    singleOf(::PatchSelectionRepository)
    singleOf(::PatchOptionsRepository)
    singleOf(::BlocklistRepository)
    singleOf(::PatchBundleRepository)
    singleOf(::WorkerRepository)
    singleOf(::InstalledAppRepository)
    singleOf(::OriginalApkRepository)
    singleOf(::StorageStatsRepository)
    singleOf(::AppDataResolver)
}
