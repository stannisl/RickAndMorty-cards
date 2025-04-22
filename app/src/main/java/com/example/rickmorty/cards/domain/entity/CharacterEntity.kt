package com.example.rickmorty.cards.domain.entity

import android.net.Uri

data class CharacterEntity(
    val name: String,
    val status: String,
    val image: Uri
)
