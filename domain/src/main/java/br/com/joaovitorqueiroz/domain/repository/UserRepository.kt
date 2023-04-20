package br.com.joaovitorqueiroz.domain.repository

import br.com.joaovitorqueiroz.data.local.datasources.UserLocalDataSource
import br.com.joaovitorqueiroz.data.local.model.ProfileDTO
import br.com.joaovitorqueiroz.data.network.remote.UserRemoteDataSource

class UserRepository(
    private val userLocalDataSource: UserLocalDataSource,
    private val userRemoteDataSource: UserRemoteDataSource,
) {

    fun login(email: String, password: String): Boolean {
        return userRemoteDataSource.login(email, password)
    }

    fun getProfile(): ProfileDTO {
        return userLocalDataSource.getProfile()
    }
}
