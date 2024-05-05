package codes.saurabh.run.network.di

import codes.saurabh.core.domain.run.RemoteRunDataSource
import codes.saurabh.run.network.KtorRemoteRunDataSource
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val networkModule = module {
    singleOf(::KtorRemoteRunDataSource).bind<RemoteRunDataSource>()
}