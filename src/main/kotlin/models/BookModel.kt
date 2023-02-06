package models

import com.moandjiezana.toml.TomlWriter




class BookModel(
    val title: String,
    var author: String,
    var year: Int,
    var pages: Int,
    var language: String,
    var publisher: String,
    var isbn: String,
    var price: Double,
    var format: String,
    var genre: String,
    var description: String,
    var cover: String,
    var url: String,
    var id: Int
) {
    fun toToml(): String = TomlWriter().write(this)

    override fun toString(): String {
        return "models.Book(title='$title', author='$author', year=$year, pages=$pages, language='$language', publisher='$publisher', isbn='$isbn', price=$price, format='$format', genre='$genre', description='$description', cover='$cover', url='$url', id=$id)"
    }
}