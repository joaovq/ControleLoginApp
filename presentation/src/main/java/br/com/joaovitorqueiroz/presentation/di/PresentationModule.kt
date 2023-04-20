package br.com.joaovitorqueiroz.presentation.di

import br.com.joaovitorqueiroz.presentation.viewmodel.LoginViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val presentationModule = module {
    viewModel { LoginViewModel(get(), get()) }
}
