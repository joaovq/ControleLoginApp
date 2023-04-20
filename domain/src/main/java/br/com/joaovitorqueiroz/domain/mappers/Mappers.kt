package br.com.joaovitorqueiroz.domain.mappers

import br.com.joaovitorqueiroz.data.local.model.ProfileDTO
import br.com.joaovitorqueiroz.domain.model.Profile

fun ProfileDTO.toDomain() = Profile(
    this.name,
    this.email,
    this.password
)