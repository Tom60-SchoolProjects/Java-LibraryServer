import models.BookModel
import models.ReaderModel
import okhttp3.OkHttpClient
import okhttp3.Request
import requests.BookRequest
import requests.ReaderRequest
import java.io.IOException

val client = OkHttpClient();

fun main(args: Array<String>) {

    newBook()

    newReader()

}

fun newBook() : BookModel {
    val title: String
    var author: String
    var year: Int
    var pages: Int
    var language: String
    var publisher: String
    var isbn: String
    var price: Double
    var format: String
    var genre: String
    var description: String
    var cover: String
    var url: String
    var id: Int

    println("Enter the title of the book")
    title = readLine()!!
    println("Enter the author of the book")
    author = readLine()!!
    println("Enter the year of the book")
    year = readLine()!!.toInt()
    println("Enter the number of pages of the book")
    pages = readLine()!!.toInt()
    println("Enter the language of the book")
    language = readLine()!!
    println("Enter the publisher of the book")
    publisher = readLine()!!
    println("Enter the ISBN of the book")
    isbn = readLine()!!
    println("Enter the price of the book")
    price = readLine()!!.toDouble()
    println("Enter the format of the book")
    format = readLine()!!
    println("Enter the genre of the book")
    genre = readLine()!!
    println("Enter the description of the book")
    description = readLine()!!
    println("Enter the cover of the book")
    cover = readLine()!!
    println("Enter the url of the book")
    url = readLine()!!
    println("Enter the id of the book")
    id = readLine()!!.toInt()

    val book = BookModel(title, author, year, pages, language, publisher, isbn, price, format, genre, description, cover, url, id)
    return book
}

fun newReader(): ReaderModel {
    var id: Int
    var name: String
    var email: String
    var password: String
    var role: String
    var token: String
    var books: List<BookModel>
    var booksBorrowed: List<BookModel>
    var booksReserved: List<BookModel>
    var booksReturned: List<BookModel>
    var booksLost: List<BookModel>
    var booksDamaged: List<BookModel>
    var booksBorrowedHistory: List<BookModel>
    var booksReservedHistory: List<BookModel>
    var booksReturnedHistory: List<BookModel>
    var booksLostHistory: List<BookModel>
    var booksDamagedHistory: List<BookModel>
    var booksBorrowedHistoryCount: Int
    var booksReservedHistoryCount: Int
    var booksReturnedHistoryCount: Int
    var booksLostHistoryCount: Int
    var booksDamagedHistoryCount: Int
    var booksBorrowedCount: Int
    var booksReservedCount: Int
    var booksReturnedCount: Int
    var booksLostCount: Int
    var booksDamagedCount: Int
    var booksCount: Int
    var booksBorrowedHistoryPage: Int
    var booksReservedHistoryPage: Int
    var booksReturnedHistoryPage: Int
    var booksLostHistoryPage: Int
    var booksDamagedHistoryPage: Int
    var booksBorrowedPage: Int
    var booksReservedPage: Int
    var booksReturnedPage: Int
    var booksLostPage: Int
    var booksDamagedPage: Int
    var booksPage: Int
    var booksBorrowedHistoryPageCount: Int
    var booksReservedHistoryPageCount: Int
    var booksReturnedHistoryPageCount: Int
    var booksLostHistoryPageCount: Int

    println("Enter the id of the reader")
    id = readLine()!!.toInt()
    println("Enter the name of the reader")
    name = readLine()!!
    println("Enter the email of the reader")
    email = readLine()!!
    println("Enter the password of the reader")
    password = readLine()!!
    println("Enter the role of the reader")
    role = readLine()!!
    println("Enter the token of the reader")
    token = readLine()!!
    println("Enter the books of the reader")
    books = readLine()!!.split(",").map { it.trim() }.map { BookModel(it, "", 0, 0, "", "", "", 0.0, "", "", "", "", "", 0) }
    println("Enter the booksBorrowed of the reader")
    booksBorrowed = readLine()!!.split(",").map { it.trim() }.map { BookModel(it, "", 0, 0, "", "", "", 0.0, "", "", "", "", "", 0) }
    println("Enter the booksReserved of the reader")
    booksReserved = readLine()!!.split(",").map { it.trim() }.map { BookModel(it, "", 0, 0, "", "", "", 0.0, "", "", "", "", "", 0) }
    println("Enter the booksReturned of the reader")
    booksReturned = readLine()!!.split(",").map { it.trim() }.map { BookModel(it, "", 0, 0, "", "", "", 0.0, "", "", "", "", "", 0) }
    println("Enter the booksLost of the reader")
    booksLost = readLine()!!.split(",").map { it.trim() }.map { BookModel(it, "", 0, 0, "", "", "", 0.0, "", "", "", "", "", 0) }
    println("Enter the booksDamaged of the reader")
    booksDamaged = readLine()!!.split(",").map { it.trim() }.map { BookModel(it, "", 0, 0, "", "", "", 0.0, "", "", "", "", "", 0) }
    println("Enter the booksBorrowedHistory of the reader")
    booksBorrowedHistory = readLine()!!.split(",").map { it.trim() }.map { BookModel(it, "", 0, 0, "", "", "", 0.0, "", "", "", "", "", 0) }
    println("Enter the booksReservedHistory of the reader")
    booksReservedHistory = readLine()!!.split(",").map { it.trim() }.map { BookModel(it, "", 0, 0, "", "", "", 0.0, "", "", "", "", "", 0) }
    println("Enter the booksReturnedHistory of the reader")
    booksReturnedHistory = readLine()!!.split(",").map { it.trim() }.map { BookModel(it, "", 0, 0, "", "", "", 0.0, "", "", "", "", "", 0) }
    println("Enter the booksLostHistory of the reader")
    booksLostHistory = readLine()!!.split(",").map { it.trim() }.map { BookModel(it, "", 0, 0, "", "", "", 0.0, "", "", "", "", "", 0) }
    println("Enter the booksDamagedHistory of the reader")
    booksDamagedHistory = readLine()!!.split(",").map { it.trim() }.map { BookModel(it, "", 0, 0, "", "", "", 0.0, "", "", "", "", "", 0) }
    println("Enter the booksBorrowedHistoryCount of the reader")
    booksBorrowedHistoryCount = readLine()!!.toInt()
    println("Enter the booksReservedHistoryCount of the reader")
    booksReservedHistoryCount = readLine()!!.toInt()
    println("Enter the booksReturnedHistoryCount of the reader")
    booksReturnedHistoryCount = readLine()!!.toInt()
    println("Enter the booksLostHistoryCount of the reader")
    booksLostHistoryCount = readLine()!!.toInt()
    println("Enter the booksDamagedHistoryCount of the reader")
    booksDamagedHistoryCount = readLine()!!.toInt()
    println("Enter the booksBorrowedCount of the reader")
    booksBorrowedCount = readLine()!!.toInt()
    println("Enter the booksReservedCount of the reader")
    booksReservedCount = readLine()!!.toInt()
    println("Enter the booksReturnedCount of the reader")
    booksReturnedCount = readLine()!!.toInt()
    println("Enter the booksLostCount of the reader")
    booksLostCount = readLine()!!.toInt()
    println("Enter the booksDamagedCount of the reader")
    booksDamagedCount = readLine()!!.toInt()
    println("Enter the booksCount of the reader")
    booksCount = readLine()!!.toInt()
    println("Enter the booksBorrowedHistoryPage of the reader")
    booksBorrowedHistoryPage = readLine()!!.toInt()
    println("Enter the booksReservedHistoryPage of the reader")
    booksReservedHistoryPage = readLine()!!.toInt()
    println("Enter the booksReturnedHistoryPage of the reader")
    booksReturnedHistoryPage = readLine()!!.toInt()
    println("Enter the booksLostHistoryPage of the reader")
    booksLostHistoryPage = readLine()!!.toInt()
    println("Enter the booksDamagedHistoryPage of the reader")
    booksDamagedHistoryPage = readLine()!!.toInt()
    println("Enter the booksBorrowedPage of the reader")
    booksBorrowedPage = readLine()!!.toInt()
    println("Enter the booksReservedPage of the reader")
    booksReservedPage = readLine()!!.toInt()
    println("Enter the booksReturnedPage of the reader")
    booksReturnedPage = readLine()!!.toInt()
    println("Enter the booksLostPage of the reader")
    booksLostPage = readLine()!!.toInt()
    println("Enter the booksDamagedPage of the reader")
    booksDamagedPage = readLine()!!.toInt()
    println("Enter the booksPage of the reader")
    booksPage = readLine()!!.toInt()
    println("Enter the booksBorrowedHistoryPageCount of the reader")
    booksBorrowedHistoryPageCount = readLine()!!.toInt()
    println("Enter the booksReservedHistoryPageCount of the reader")
    booksReservedHistoryPageCount = readLine()!!.toInt()
    println("Enter the booksReturnedHistoryPageCount of the reader")
    booksReturnedHistoryPageCount = readLine()!!.toInt()
    println("Enter the booksLostHistoryPageCount of the reader")
    booksLostHistoryPageCount = readLine()!!.toInt()

    val reader = ReaderModel(
        id,
        name,
        email,
        password,
        role,
        token,
        books,
        booksBorrowed,
        booksReserved,
        booksReturned,
        booksLost,
        booksDamaged,
        booksBorrowedHistory,
        booksReservedHistory,
        booksReturnedHistory,
        booksLostHistory,
        booksDamagedHistory,
        booksBorrowedHistoryCount,
        booksReservedHistoryCount,
        booksReturnedHistoryCount,
        booksLostHistoryCount,
        booksDamagedHistoryCount,
        booksBorrowedCount,
        booksReservedCount,
        booksReturnedCount,
        booksLostCount,
        booksDamagedCount,
        booksCount,
        booksBorrowedHistoryPage,
        booksReservedHistoryPage,
        booksReturnedHistoryPage,
        booksLostHistoryPage,
        booksDamagedHistoryPage,
        booksBorrowedPage,
        booksReservedPage,
        booksReturnedPage,
        booksLostPage,
        booksDamagedPage,
        booksPage,
        booksBorrowedHistoryPageCount,
        booksReservedHistoryPageCount,
        booksReturnedHistoryPageCount,
        booksLostHistoryPageCount
    )
    return reader
}