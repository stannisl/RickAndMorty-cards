package com.example.rickmorty.common.database

import androidx.room.Database
import com.example.rickmorty.cards.data.model.CharacterModel
import com.example.rickmorty.cards.data.service.CharactersDAO

@Database(
    entities = [CharacterModel::class],
    version = 1,
    exportSchema = false
)
abstract class Database {
    abstract fun charactersDAO(): CharactersDAO

    companion object {
        const val DATABASE_NAME = "characters.db"
    }
}