import models.BookModel
import models.ReaderModel
import okhttp3.*
import requests.BookRequest
import requests.ReaderRequest

val client = OkHttpClient()

fun main() {

    if (checkServer())
        println("Connected to server")
    else {
        println("Server is not running")
        return
    }

    while (true) {
        println("1. Add book")
        println("2. Add reader")
        println("3. Exit")
        println()
        print("Enter your choice: ")

        when (readln().toIntOrNull()) {
            1 -> {
                val book = newBook()

                val request = BookRequest()
                request.post(book, object : Callback {
                    override fun onFailure(call: Call, e: java.io.IOException) {
                        println("Failed to execute request")
                    }

                    override fun onResponse(call: Call, response: Response) {
                        if (response.code == 200)
                            println("Book added successfully")
                        else
                            println("Failed to add book (Status code: ${response.code})")
                    }
                })
            }
            2 -> {
                val reader = newReader()

                val request = ReaderRequest()
                request.post(reader, object : Callback {
                    override fun onFailure(call: Call, e: java.io.IOException) {
                        println("Failed to execute request")
                    }

                    override fun onResponse(call: Call, response: Response) {
                        println("Reader added successfully")
                    }
                })
            }
            3 -> {
                println("Exiting...")
                break
            }
            else -> {
                println("Invalid choice")
            }
        }
    }
}

fun checkServer(): Boolean {
    val request = Request.Builder()
        .url(Environment.url)
        .build()

    return try {
        client.newCall(request).execute()
        true
    }  catch (e: Exception) {
        false
    }
}

fun newBook(): BookModel {
    println("Enter the title of the book:")
    val title: String = readln()
    println("Enter the author of the book:")
    val author: String = readln()
    println("Enter the language of the book:")
    val language: String = readln()
    println("Enter the genre of the book:")
    val genre: String = readln()

    return BookModel(title, author, language, genre)
}

fun newReader(): ReaderModel {
    println("Enter the name of the reader:")
    val name: String = readln()

    return ReaderModel(name)
}