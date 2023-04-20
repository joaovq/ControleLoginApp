package br.com.joaovitorqueiroz.domain.usecases

import br.com.joaovitorqueiroz.domain.mappers.toDomain
import br.com.joaovitorqueiroz.domain.model.Profile
import br.com.joaovitorqueiroz.domain.repository.UserRepository

class GetProfileUseCase(
    private val repository: UserRepository,
) {
    fun execute(): Profile =
        repository.getProfile().toDomain()
}
