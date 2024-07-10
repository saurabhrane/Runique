package codes.saurabh.analytics.data.di

import codes.saurabh.analytics.domain.AnalyticsRepository
import codes.saurabh.core.database.RunDatabase
import codes.saurabh.analytics.data.RoomAnalyticsRepository
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val analyticsModule = module {
    singleOf(::RoomAnalyticsRepository).bind<AnalyticsRepository>()
    single {
        get<RunDatabase>().analyticsDao
    }
}