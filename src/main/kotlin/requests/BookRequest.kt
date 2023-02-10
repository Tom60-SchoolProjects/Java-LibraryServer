package requests

import Environment
import com.akuleshov7.ktoml.Toml
import kotlinx.serialization.encodeToString
import models.BookModel
import okhttp3.*
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.RequestBody.Companion.toRequestBody

class BookRequest {
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