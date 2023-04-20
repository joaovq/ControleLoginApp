package br.com.joaovitorqueiroz.domain.di

import br.com.joaovitorqueiroz.domain.repository.UserRepository
import br.com.joaovitorqueiroz.domain.usecases.GetProfileUseCase
import br.com.joaovitorqueiroz.domain.usecases.SignInUseCase
import org.koin.dsl.module

val domainModule = module {
    single { UserRepository(get(), get()) }
    factory { GetProfileUseCase(get()) }
    factory { SignInUseCase(get()) }
}