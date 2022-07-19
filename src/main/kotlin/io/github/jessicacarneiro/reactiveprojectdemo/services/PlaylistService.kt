package io.github.jessicacarneiro.reactiveprojectdemo.services

import io.github.jessicacarneiro.reactiveprojectdemo.document.Playlist
import io.github.jessicacarneiro.reactiveprojectdemo.repository.PlaylistRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class PlaylistService(@Autowired private val repository: PlaylistRepository) {

    fun findAll() : Flux<Playlist> {
        return repository.findAll()
    }

    fun findById(id: String): Mono<Playlist> {
        return repository.findById(id)
    }

    fun save(playlist: Playlist): Mono<Playlist> {
        return repository.save(playlist)
    }
}