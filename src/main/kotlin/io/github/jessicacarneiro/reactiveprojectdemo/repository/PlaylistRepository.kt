package io.github.jessicacarneiro.reactiveprojectdemo.repository

import io.github.jessicacarneiro.reactiveprojectdemo.document.Playlist
import org.springframework.data.mongodb.repository.ReactiveMongoRepository

interface PlaylistRepository : ReactiveMongoRepository<Playlist, String> {
}