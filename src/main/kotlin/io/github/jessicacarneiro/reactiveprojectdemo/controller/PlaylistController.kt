package io.github.jessicacarneiro.reactiveprojectdemo.controller

import io.github.jessicacarneiro.reactiveprojectdemo.document.Playlist
import io.github.jessicacarneiro.reactiveprojectdemo.services.PlaylistService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import reactor.util.function.Tuple2
import java.time.Duration

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

    @GetMapping(value = ["playlist/events"], produces = [MediaType.TEXT_EVENT_STREAM_VALUE])
    fun getPlaylistByEvents(): Flux<Tuple2<Long, Playlist>> {
        val interval = Flux.interval(Duration.ofSeconds(10))
        val events = service.findAll()
        println("Passou aqui em events")
        return Flux.zip(interval, events)
    }
}