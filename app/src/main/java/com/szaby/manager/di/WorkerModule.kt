package com.szaby.manager.di

import com.szaby.manager.patcher.worker.PatcherWorker
import com.szaby.manager.worker.AutoPatchWorker
import com.szaby.manager.worker.UpdateCheckWorker
import org.koin.androidx.workmanager.dsl.workerOf
import org.koin.dsl.module

val workerModule = module {
    workerOf(::PatcherWorker)
    workerOf(::UpdateCheckWorker)
    workerOf(::AutoPatchWorker)
}
