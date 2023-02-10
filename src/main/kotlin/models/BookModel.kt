package models

import kotlinx.serialization.Serializable

/**
 * BookModel is a class that contains the information of a book
 * @param title The title of the book
 * @param author The author of the book
 * @param language The language of the book
 * @param genre The genre of the book
 */
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