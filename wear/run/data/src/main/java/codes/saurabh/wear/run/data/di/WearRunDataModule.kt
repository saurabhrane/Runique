package codes.saurabh.wear.run.data.di

import codes.saurabh.wear.run.data.HealthServicesExerciseTracker
import codes.saurabh.wear.run.data.WatchToPhoneConnector
import codes.saurabh.wear.run.domain.ExerciseTracker
import codes.saurabh.wear.run.domain.PhoneConnector
import codes.saurabh.wear.run.domain.RunningTracker
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val wearRunDataModule = module {
    singleOf(::HealthServicesExerciseTracker).bind<ExerciseTracker>()
    singleOf(::WatchToPhoneConnector).bind<PhoneConnector>()
    singleOf(::RunningTracker)
    single {
        get<RunningTracker>().elapsedTime
    }
}