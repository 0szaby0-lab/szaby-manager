package com.szaby.manager.ui.model.navigation

import android.os.Parcelable
import com.szaby.manager.domain.batch.BatchTarget
import com.szaby.manager.ui.model.SelectedApp
import com.szaby.manager.util.Options
import com.szaby.manager.util.PatchSelection
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import kotlinx.serialization.Serializable

interface ComplexParameter<T : Parcelable>

@Serializable
object HomeScreen

@Serializable
object Settings

@Serializable
data object BatchPatcher : ComplexParameter<BatchPatcher.ViewModelParams> {
    @Parcelize
    data class ViewModelParams(
        val targets: List<BatchTarget>,
        val useMount: Boolean
    ) : Parcelable
}

@Serializable
data object Patcher : ComplexParameter<Patcher.ViewModelParams> {
    @Parcelize
    data class ViewModelParams(
        val selectedApp: SelectedApp,
        val selectedPatches: PatchSelection,
        val options: @RawValue Options
    ) : Parcelable
}
