package com.example.di

import com.example.repository.CharacterRepository
import com.example.repository.CharacterRepositoryImpl
import org.koin.dsl.module

val koinModule= module {
    single<CharacterRepository> {
        CharacterRepositoryImpl()
    }
}