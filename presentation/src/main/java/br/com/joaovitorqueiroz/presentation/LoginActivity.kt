package br.com.joaovitorqueiroz.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.joaovitorqueiroz.presentation.databinding.ActivityLoginBinding
import br.com.joaovitorqueiroz.presentation.extension.toast
import br.com.joaovitorqueiroz.presentation.viewmodel.LoginViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    private val loginViewModel by viewModel<LoginViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setupView()
    }

    private fun setupView() {
        with(binding) {
            btnLogin.setOnClickListener {
                val isSuccess: Boolean = loginViewModel.login(
                    email = etEmail.text.toString(),
                    password = etPassword.text.toString(),
                )

                this@LoginActivity.toast(
                    message =
                    if (isSuccess) {
                        "Login efetuado com sucesso!"
                    } else {
                        "Falha ao efetuar o login."
                    },
                )
            }
        }
    }
}
