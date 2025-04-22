package com.example.rickmorty.cards.data.model

import android.net.Uri
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "characters")
data class CharacterModel(
    @PrimaryKey val id: Int,
    val name: String,
    val age: Int,
    val image: String,
    val status: String,
)
