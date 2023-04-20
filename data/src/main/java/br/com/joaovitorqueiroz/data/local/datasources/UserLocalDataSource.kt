package br.com.joaovitorqueiroz.data.local.datasources

import android.content.Context
import br.com.joaovitorqueiroz.data.local.model.ProfileDTO

class UserLocalDataSource(context: Context) {

    fun getProfile(): ProfileDTO {
        return ProfileDTO("", "", "")
    }
}
