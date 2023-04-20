package br.com.joaovitorqueiroz.data.network.remote

class UserRemoteDataSource(
    private val loginRetrofitService: LoginRetrofitService,
) {

    fun login(email: String, password: String): Boolean {
        return loginRetrofitService.login(email, password)
    }
}
