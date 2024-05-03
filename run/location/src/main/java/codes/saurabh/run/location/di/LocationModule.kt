package codes.saurabh.run.location.di

import codes.saurabh.run.domain.LocationObserver
import codes.saurabh.run.location.AndroidLocationObserver
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val locationModule = module {
    singleOf(::AndroidLocationObserver).bind<LocationObserver>()
}