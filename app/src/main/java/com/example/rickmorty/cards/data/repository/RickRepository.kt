package com.example.rickmorty.cards.data.repository

import com.example.rickmorty.cards.data.mapper.CharacterMapper
import com.example.rickmorty.cards.data.service.CharactersDAO
import com.example.rickmorty.cards.data.service.RickApiService
import com.example.rickmorty.cards.domain.entity.CharacterEntity
import com.example.rickmorty.cards.domain.repository.IRickRepository

class RickRepository(
    private val apiService: RickApiService,
    private val dao: CharactersDAO,
) : IRickRepository {
    override suspend fun getAllCharacters(forceRefresh: Boolean) : List<CharacterEntity> {
        val localData = dao.getAllCharacters()

        if (localData.isEmpty() || forceRefresh) {
            val remoteData = apiService.getAllCharacters()

            TODO("Save remoteData to localDatabase")

            return remoteData.results.map { CharacterMapper.mapDTOToEntity(it) }
        }
        return localData.map { CharacterMapper.mapModelToEntity(it) }
    }
}