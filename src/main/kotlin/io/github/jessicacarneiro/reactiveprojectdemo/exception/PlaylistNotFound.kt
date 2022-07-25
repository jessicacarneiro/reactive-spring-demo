package io.github.jessicacarneiro.reactiveprojectdemo.exception

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException

class PlaylistNotFound : NotFoundException() {
}