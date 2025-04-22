package com.example.rickmorty.cards.data.dto

data class CharacterListInfoDTO(
    val count: Int,
    val pages: Int,
    val next: String,
    val prev: String
)