package br.com.joaovitorqueiroz.presentation.viewmodel

import androidx.lifecycle.ViewModel
import br.com.joaovitorqueiroz.domain.model.Profile
import br.com.joaovitorqueiroz.domain.usecases.GetProfileUseCase
import br.com.joaovitorqueiroz.domain.usecases.SignInUseCase

class LoginViewModel(
    private val getProfileUseCase: GetProfileUseCase,
    private val signInUseCase: SignInUseCase,
) : ViewModel() {

    fun login(email: String, password: String): Boolean {
        return signInUseCase.execute(email, password)
    }

    fun getProfile(): Profile {
        return getProfileUseCase.execute()
    }
}
