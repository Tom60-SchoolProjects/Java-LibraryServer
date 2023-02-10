package models

import kotlinx.serialization.Serializable

@Serializable
data class BookModel (
    val title: String,
    var author: String,
    var language: String,
    var genre: String,
) {
    override fun toString(): String {
        return "models.BookModel(title='$title', author='$author', language='$language', genre='$genre')"
    }
}