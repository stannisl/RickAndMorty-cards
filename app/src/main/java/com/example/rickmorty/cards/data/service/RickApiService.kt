package com.example.rickmorty.cards.data.service

import com.example.rickmorty.cards.data.dto.CharacterDTO
import com.example.rickmorty.cards.data.dto.CharacterListDTO
import com.example.rickmorty.common.api.NetworkModule
import io.ktor.client.call.body
import io.ktor.client.request.get

object RickApiService {
    private const val BASE_URL = "http"

    suspend fun getAllCharacters() : CharacterListDTO {
        return NetworkModule.publicClient.get("$BASE_URL/character").body()
    }

    suspend fun getCharacterById(id: Int) : CharacterDTO {
        return NetworkModule.publicClient.get("$BASE_URL/character").body()
    }
}