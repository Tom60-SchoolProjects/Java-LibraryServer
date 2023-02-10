import models.BookModel
import models.ReaderModel
import okhttp3.*
import requests.BookRequest
import requests.ReaderRequest

val client = OkHttpClient()

/**
 * Entry point of the program
 */
fun main() {

    // Check if the server is running
    if (checkServer())
        println("Connected to server")
    else {
        println("Server is not running")
        return // Exit application
    }

    // Loop until the user wants to exit
    while (true) {
        // Display choices
        println("1. Add book")
        println("2. Add reader")
        println("3. Disconnect ¯\\_(ツ)_/¯")
        println("4. Exit")
        println()
        print("Enter your choice: ")

        // Read user input
        when (readln().toIntOrNull()) {

            // Add book
            1 -> {
                // Ask user for book information
                val book = newBook()

                // Send request to server
                val request = BookRequest()
                request.post(book, object : Callback {
                    // If the request fails
                    override fun onFailure(call: Call, e: java.io.IOException) {
                        println("Failed to execute request")
                    }

                    // If the request succeeds
                    override fun onResponse(call: Call, response: Response) {
                        if (response.isSuccessful)
                            println("Book added successfully")
                        else
                            println("Failed to add book (Status code: ${response.code})")
                    }
                })
            }

            // Add reader
            2 -> {
                // Ask user for reader information
                val reader = newReader()

                // Send request to server
                val request = ReaderRequest()
                request.post(reader, object : Callback {
                    // If the request fails
                    override fun onFailure(call: Call, e: java.io.IOException) {
                        println("Failed to execute request")
                    }

                    // If the request succeeds
                    override fun onResponse(call: Call, response: Response) {
                        if(response.isSuccessful)
                            println("Reader added successfully")
                        else
                            println("Failed to add reader (Status code: ${response.code})")
                    }
                })
            }

            // Disconnect (¯\_(ツ)_/¯)
            // In case this wasn't obvious enough, this is a joke
            3 -> {
                println("Disconnecting gracefully...")
                val request = Request.Builder()
                    .url(Environment.url + "/gracefully/disconnect")
                    .build()

                client.newCall(request).execute()
                throw Exception("Disconnected gracefully!")
            }

            // Exit application
            4 -> {
                println("Exiting...")
                break
            }
            else -> {
                println("Invalid choice")
            }
        }
    }
}

/**
 * Check if the server is running
 * @return true if the server is running, false otherwise
 */
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

/**
 * Ask user for book information
 * @return The book
 */
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

/**
 * Ask user for reader information
 * @return The reader
 */
fun newReader(): ReaderModel {
    println("Enter the name of the reader:")
    val name: String = readln()

    return ReaderModel(name)
}