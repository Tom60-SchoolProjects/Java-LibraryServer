package requests

import Environment
import com.akuleshov7.ktoml.Toml
import kotlinx.serialization.encodeToString
import models.BookModel
import okhttp3.*
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.RequestBody.Companion.toRequestBody

/**
 * BookRequest is a class that contains functions to send book request to the server
 */
class BookRequest {
    /**
     * Send a POST request to the server to add a book
     * @param book The book to add
     * @param callback The callback to execute when the request is done
     */
    fun post(book: BookModel, callback: Callback) {
        val toml = Toml.encodeToString(book)

        val okHttpClient = OkHttpClient()
        val requestBody = toml.toRequestBody("application/toml".toMediaTypeOrNull())
        val request = Request.Builder()
            .method("POST", requestBody)
            .url(url)
            .build()
        okHttpClient.newCall(request).enqueue(callback)
    }

    companion object {
        private var url = Environment.url + "/book"
    }
}