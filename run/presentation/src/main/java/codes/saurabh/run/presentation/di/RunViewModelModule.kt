package codes.saurabh.run.presentation.di

import codes.saurabh.run.domain.RunningTracker
import codes.saurabh.run.presentation.active_run.ActiveRunViewModel
import codes.saurabh.run.presentation.run_overview.RunOverviewViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val runPresentationModule = module {
    singleOf(::RunningTracker)
    viewModelOf(::RunOverviewViewModel)
    viewModelOf(::ActiveRunViewModel)
}