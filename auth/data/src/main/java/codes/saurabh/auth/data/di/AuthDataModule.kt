package codes.saurabh.auth.data.di

import codes.saurabh.auth.data.EmailPatternValidator
import codes.saurabh.auth.domain.AuthRepository
import codes.saurabh.auth.domain.PatternValidator
import codes.saurabh.auth.domain.UserDataValidator
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val authDataModule = module {
    single<PatternValidator> {
        EmailPatternValidator
    }
    singleOf(::UserDataValidator)
    singleOf(::AuthRepositoryImpl).bind<AuthRepository>()
}