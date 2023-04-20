package br.com.joaovitorqueiroz.data.di

import br.com.joaovitorqueiroz.data.local.datasources.UserLocalDataSource
import br.com.joaovitorqueiroz.data.network.remote.LoginRetrofitService
import br.com.joaovitorqueiroz.data.network.remote.UserRemoteDataSource
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val dataModule = module {
    single<LoginRetrofitService> {
        object : LoginRetrofitService {
            override fun login(email: String, password: String): Boolean {
                return true
            }
        }
    }
    single { UserRemoteDataSource(get()) }
    single { UserLocalDataSource(androidContext()) }
}