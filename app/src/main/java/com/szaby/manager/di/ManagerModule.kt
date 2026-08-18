package com.szaby.manager.di

import com.szaby.manager.domain.apk.ApkSignatureCache
import com.szaby.manager.domain.apk.LocalApkSources
import com.szaby.manager.domain.batch.BatchPatchCoordinator
import com.szaby.manager.domain.batch.BatchPlanResolver
import com.szaby.manager.domain.bundles.AppVersionCatalog
import com.szaby.manager.domain.installer.InstallerManager
import com.szaby.manager.domain.installer.RootInstaller
import com.szaby.manager.domain.installer.SessionInstaller
import com.szaby.manager.domain.manager.*
import com.szaby.manager.util.AppCoroutineScope
import com.szaby.manager.util.PM
import com.szaby.manager.util.UpdateNotificationManager
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val managerModule = module {
    singleOf(::KeystoreManager)
    singleOf(::ApkSignatureCache)
    singleOf(::PM)
    singleOf(::RootInstaller)
    singleOf(::SessionInstaller)
    singleOf(::InstallerManager)
    singleOf(::PatchOptionsPreferencesManager)
    singleOf(::AppIconManager)
    singleOf(::UpdateNotificationManager)
    singleOf(::DownloadUrlResolver)
    singleOf(::AppVersionCatalog)
    singleOf(::LocalApkSources)
    singleOf(::HomeAppButtonPreferences)
    singleOf(::AppCoroutineScope)
    singleOf(::BatchPlanResolver)
    singleOf(::BatchPatchCoordinator)
}
