package codes.saurabh.run.data.di

import codes.saurabh.core.domain.run.SyncRunScheduler
import codes.saurabh.run.data.CreateRunWorker
import codes.saurabh.run.data.DeleteRunWorker
import codes.saurabh.run.data.FetchRunsWorker
import codes.saurabh.run.data.SyncRunWorkerScheduler
import org.koin.androidx.workmanager.dsl.workerOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val runDataModule = module {
    workerOf(::CreateRunWorker)
    workerOf(::FetchRunsWorker)
    workerOf(::DeleteRunWorker)

    singleOf(::SyncRunWorkerScheduler).bind<SyncRunScheduler>()
    singleOf(::PhoneToWatchConnector).bind<WatchConnector>()
}