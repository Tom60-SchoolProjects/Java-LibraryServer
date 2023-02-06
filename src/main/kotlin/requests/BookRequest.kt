package requests

import Environement
import models.BookModel
import okhttp3.*
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.RequestBody.Companion.toRequestBody

class BookRequest {
    fun post(book: BookModel, callback: Callback) {
        val toml = book.toToml()

        val okHttpClient = OkHttpClient()
        val requestBody = toml.toRequestBody("application/json".toMediaTypeOrNull())
        val request = Request.Builder()
            .method("POST", requestBody)
            .url(url)
            .build()
        okHttpClient.newCall(request).enqueue(callback)
    }

    companion object {
        private var url = Environement.url + "/book"
    }
}