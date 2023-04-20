package br.com.joaovitorqueiroz.domain.usecases

import br.com.joaovitorqueiroz.domain.repository.UserRepository

class SignInUseCase(
    private val repository: UserRepository,
) {
    fun execute(email: String, senha: String) = repository.login(email,senha)
}
