package com.szaby.manager.data.room

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.szaby.manager.data.room.apk.ApkSignature
import com.szaby.manager.data.room.apk.ApkSignatureDao
import com.szaby.manager.data.room.apps.installed.AppliedPatch
import com.szaby.manager.data.room.apps.installed.InstalledApp
import com.szaby.manager.data.room.apps.installed.InstalledAppDao
import com.szaby.manager.data.room.apps.original.OriginalApk
import com.szaby.manager.data.room.apps.original.OriginalApkDao
import com.szaby.manager.data.room.bundles.PatchBundleDao
import com.szaby.manager.data.room.bundles.PatchBundleEntity
import com.szaby.manager.data.room.options.Option
import com.szaby.manager.data.room.options.OptionDao
import com.szaby.manager.data.room.options.OptionGroup
import com.szaby.manager.data.room.selection.PatchSelection
import com.szaby.manager.data.room.selection.SeenPatch
import com.szaby.manager.data.room.selection.SelectedPatch
import com.szaby.manager.data.room.selection.SelectionDao
import kotlin.random.Random

@Database(
    entities = [
        PatchBundleEntity::class,
        PatchSelection::class,
        SelectedPatch::class,
        SeenPatch::class,
        InstalledApp::class,
        AppliedPatch::class,
        OptionGroup::class,
        Option::class,
        OriginalApk::class,
        ApkSignature::class
    ],
    version = 15
)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun patchBundleDao(): PatchBundleDao
    abstract fun selectionDao(): SelectionDao
    abstract fun installedAppDao(): InstalledAppDao
    abstract fun optionDao(): OptionDao
    abstract fun originalApkDao(): OriginalApkDao
    abstract fun apkSignatureDao(): ApkSignatureDao

    companion object {
        fun generateUid() = Random.nextInt()
    }
}
