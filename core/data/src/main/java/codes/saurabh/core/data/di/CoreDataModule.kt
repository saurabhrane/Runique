package codes.saurabh.core.data.di

import codes.saurabh.core.data.auth.EncryptedSessionStorage
import codes.saurabh.core.data.networking.HttpClientFactory
import codes.saurabh.core.domain.SessionStorage
import codes.saurabh.core.data.run.OfflineFirstRunRepository
import codes.saurabh.core.domain.run.RunRepository
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val coreDataModule = module {
    single {
        HttpClientFactory(get()).build()
    }
    singleOf(::EncryptedSessionStorage).bind<SessionStorage>()
    singleOf(::OfflineFirstRunRepository).bind<RunRepository>()
}