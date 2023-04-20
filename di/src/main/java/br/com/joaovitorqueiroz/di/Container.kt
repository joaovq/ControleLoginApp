package br.com.joaovitorqueiroz.di

import br.com.joaovitorqueiroz.data.di.dataModule
import br.com.joaovitorqueiroz.domain.di.domainModule
import br.com.joaovitorqueiroz.presentation.di.presentationModule
import org.koin.dsl.module

val appModule = module {
    includes(domainModule, presentationModule, dataModule)
}
