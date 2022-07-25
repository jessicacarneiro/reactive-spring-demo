package io.github.jessicacarneiro.reactiveprojectdemo

import io.github.jessicacarneiro.reactiveprojectdemo.services.PlaylistService
import org.springframework.beans.factory.annotation.Autowired

//@Component
class PlaylistHandler(@Autowired private val service: PlaylistService) {

//    fun findAll(request: ServerRequest): Mono<ServerResponse> {
//        return ok().contentType(MediaType.APPLICATION_JSON)
//            .body(service.findAll(), Playlist::class.java)
//    }
//
//    fun findById(request: ServerRequest): Mono<ServerResponse> {
//        val id = request.pathVariable("id")
//
//        return ok().contentType(MediaType.APPLICATION_JSON)
//            .body(service.findById(id), Playlist::class.java)
//    }
//
//    fun save(request: ServerRequest): Mono<ServerResponse> {
//        val playlist = request.bodyToMono(Playlist::class.java)
//
//        return ok().contentType(MediaType.APPLICATION_JSON)
//            .body(fromPublisher(playlist.flatMap(service::save), Playlist::class.java))
//    }
}
