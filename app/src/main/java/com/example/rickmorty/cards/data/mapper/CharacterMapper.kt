package com.example.rickmorty.cards.data.mapper

import com.example.rickmorty.cards.data.dto.CharacterDTO
import com.example.rickmorty.cards.domain.entity.CharacterEntity
import com.example.rickmorty.cards.data.model.CharacterModel
import androidx.core.net.toUri

abstract class CharacterMapper {
    companion object {
        fun mapDTOToEntity(dto: CharacterDTO): CharacterEntity =
            CharacterEntity(
                name = dto.name,
                status = dto.status,
                image = dto.image.toUri()
            )

        fun mapModelToEntity(model: CharacterModel): CharacterEntity =
            CharacterEntity(
                name = model.name,
                status = model.status,
                image = model.image.toUri()
            )
    }
}