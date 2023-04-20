package br.com.joaovitorqueiroz.data.network.remote

import retrofit2.http.GET

interface LoginRetrofitService {

    @GET("login")
    fun login(email: String, password: String): Boolean
}
