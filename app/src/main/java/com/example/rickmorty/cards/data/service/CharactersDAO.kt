package com.example.rickmorty.cards.data.service

import androidx.room.Dao
import androidx.room.Query
import com.example.rickmorty.cards.data.model.CharacterModel

@Dao
interface CharactersDAO {
    @Query("SELECT * FROM characters")
    suspend fun getAllCharacters(): List<CharacterModel>

    @Query("SELECT * FROM characters WHERE id = :id")
    suspend fun getCharacterById(id: Int): CharacterModel
}
