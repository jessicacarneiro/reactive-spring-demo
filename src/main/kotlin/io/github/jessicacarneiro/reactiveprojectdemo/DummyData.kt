package io.github.jessicacarneiro.reactiveprojectdemo

import io.github.jessicacarneiro.reactiveprojectdemo.document.Playlist
import io.github.jessicacarneiro.reactiveprojectdemo.repository.PlaylistRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component
import reactor.core.publisher.Flux
import java.util.*

@Component
class DummyData(private val repository: PlaylistRepository) : CommandLineRunner {
    override fun run(vararg args: String?) {
//        repository.deleteAll().thenMany(
//            Flux.just("Raining day", "Good vibes", "Romantic", "To study")
//                .map { name -> Playlist(UUID.randomUUID().toString(), name) }
//                .flatMap { playlist -> repository.save(playlist) })
//            .subscribe(System.out::println)
    }
}