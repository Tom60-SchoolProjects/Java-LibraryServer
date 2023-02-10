package requests

import Environment
import com.akuleshov7.ktoml.Toml
import kotlinx.serialization.encodeToString
import models.ReaderModel
import okhttp3.*
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.RequestBody.Companion.toRequestBody

/**
 * ReaderRequest is a class that contains functions to send reader request to the server
 */
class ReaderRequest {
    /**
     * Send a POST request to the server to add a reader
     * @param reader The reader to add
     * @param callback The callback to execute when the request is done
     */
    fun post(reader: ReaderModel, callback: Callback) {
        val toml = Toml.encodeToString(reader)

        val okHttpClient = OkHttpClient()
        val requestBody = toml.toRequestBody("application/toml".toMediaTypeOrNull())
        val request = Request.Builder()
            .method("POST", requestBody)
            .url(url)
            .build()
        okHttpClient.newCall(request).enqueue(callback)
    }

    companion object {
        private var url = Environment.url + "/reader"
    }
}