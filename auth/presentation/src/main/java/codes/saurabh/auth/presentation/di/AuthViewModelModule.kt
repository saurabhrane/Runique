package codes.saurabh.auth.presentation.di

import codes.saurabh.auth.presentation.login.LoginViewModel
import codes.saurabh.auth.presentation.register.RegisterViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val authViewModelModule = module {
    viewModelOf(::RegisterViewModel)
    viewModelOf(::LoginViewModel)
}