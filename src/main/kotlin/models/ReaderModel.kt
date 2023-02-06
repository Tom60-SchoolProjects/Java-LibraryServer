package models

import com.moandjiezana.toml.TomlWriter

class ReaderModel(
    var id: Int,
    var name: String,
    var email: String,
    var password: String,
    var role: String,
    var token: String,
    var books: List<BookModel>,
    var booksBorrowed: List<BookModel>,
    var booksReserved: List<BookModel>,
    var booksReturned: List<BookModel>,
    var booksLost: List<BookModel>,
    var booksDamaged: List<BookModel>,
    var booksBorrowedHistory: List<BookModel>,
    var booksReservedHistory: List<BookModel>,
    var booksReturnedHistory: List<BookModel>,
    var booksLostHistory: List<BookModel>,
    var booksDamagedHistory: List<BookModel>,
    var booksBorrowedHistoryCount: Int,
    var booksReservedHistoryCount: Int,
    var booksReturnedHistoryCount: Int,
    var booksLostHistoryCount: Int,
    var booksDamagedHistoryCount: Int,
    var booksBorrowedCount: Int,
    var booksReservedCount: Int,
    var booksReturnedCount: Int,
    var booksLostCount: Int,
    var booksDamagedCount: Int,
    var booksCount: Int,
    var booksBorrowedHistoryPage: Int,
    var booksReservedHistoryPage: Int,
    var booksReturnedHistoryPage: Int,
    var booksLostHistoryPage: Int,
    var booksDamagedHistoryPage: Int,
    var booksBorrowedPage: Int,
    var booksReservedPage: Int,
    var booksReturnedPage: Int,
    var booksLostPage: Int,
    var booksDamagedPage: Int,
    var booksPage: Int,
    var booksBorrowedHistoryPageCount: Int,
    var booksReservedHistoryPageCount: Int,
    var booksReturnedHistoryPageCount: Int,
    var booksLostHistoryPageCount: Int
) {
    fun toToml(): String = TomlWriter().write(this)

    override fun toString(): String {
        return "models.Reader(id=$id, name='$name', email='$email', password='$password', role='$role', token='$token', books=$books, booksBorrowed=$booksBorrowed, booksReserved=$booksReserved, booksReturned=$booksReturned, booksLost=$booksLost, booksDamaged=$booksDamaged, booksBorrowedHistory=$booksBorrowedHistory, booksReservedHistory=$booksReservedHistory, booksReturnedHistory=$booksReturnedHistory, booksLostHistory=$booksLostHistory, booksDamagedHistory=$booksDamagedHistory, booksBorrowedHistoryCount=$booksBorrowedHistoryCount, booksReservedHistoryCount=$booksReservedHistoryCount, booksReturnedHistoryCount=$booksReturnedHistoryCount, booksLostHistoryCount=$booksLostHistoryCount, booksDamagedHistoryCount=$booksDamagedHistoryCount, booksBorrowedCount=$booksBorrowedCount, booksReservedCount=$booksReservedCount, booksReturnedCount=$booksReturnedCount, booksLostCount=$booksLostCount, booksDamagedCount=$booksDamagedCount, booksCount=$booksCount, booksBorrowedHistoryPage=$booksBorrowedHistoryPage, booksReservedHistoryPage=$booksReservedHistoryPage, booksReturnedHistoryPage=$booksReturnedHistoryPage, booksLostHistoryPage=$booksLostHistoryPage, booksDamagedHistoryPage=$booksDamagedHistoryPage, booksBorrowedPage=$booksBorrowedPage, booksReservedPage=$booksReservedPage, booksReturnedPage=$booksReturnedPage, booksLostPage=$booksLostPage, booksDamagedPage=$booksDamagedPage, booksPage=$booksPage, booksBorrowedHistoryPageCount=$booksBorrowedHistoryPageCount, booksReservedHistoryPageCount=$booksReservedHistoryPageCount, booksReturnedHistoryPageCount=$booksReturnedHistoryPageCount, booksLostHistoryPageCount=$booksLostHistoryPageCount)"
    }
}