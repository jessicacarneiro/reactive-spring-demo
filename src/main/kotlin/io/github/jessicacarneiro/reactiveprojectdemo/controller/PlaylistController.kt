package io.github.jessicacarneiro.reactiveprojectdemo.controller

import io.github.jessicacarneiro.reactiveprojectdemo.document.Playlist
import io.github.jessicacarneiro.reactiveprojectdemo.services.PlaylistService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
class PlaylistController(@Autowired private val service: PlaylistService) {

    @GetMapping("/playlist")
    fun getAllPlaylists(): Flux<Playlist> {
        return service.findAll()
    }

    @GetMapping("/playlist/{id}")
    fun getPlaylistById(@PathVariable("id") id: String): Mono<Playlist> {
        return service.findById(id)
    }

    @PostMapping("/playlist")
    fun savePlaylist(@RequestBody playlist: Playlist): Mono<Playlist> {
        return service.save(playlist)
    }
}