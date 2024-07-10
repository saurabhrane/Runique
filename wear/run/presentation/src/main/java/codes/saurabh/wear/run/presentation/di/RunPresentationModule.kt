package codes.saurabh.wear.run.presentation.di

import codes.saurabh.wear.run.presentation.TrackerViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val wearRunPresentationModule = module {
    viewModelOf(::TrackerViewModel)
}