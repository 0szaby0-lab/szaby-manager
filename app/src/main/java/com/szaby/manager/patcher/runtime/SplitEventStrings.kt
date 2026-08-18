package com.szaby.manager.patcher.runtime

import android.content.Context
import com.szaby.manager.R
import com.szaby.manager.patcher.split.SplitPreparationEvent

internal fun SplitPreparationEvent.toLocalizedString(context: Context): String = when (this) {
    is SplitPreparationEvent.Extracting -> context.getString(R.string.patcher_split_step_extracting)
    is SplitPreparationEvent.Merging -> context.getString(R.string.patcher_split_step_merging, apkName)
    is SplitPreparationEvent.Writing -> context.getString(R.string.patcher_split_step_writing)
    is SplitPreparationEvent.Finalizing -> context.getString(R.string.patcher_split_step_finalizing)
}
