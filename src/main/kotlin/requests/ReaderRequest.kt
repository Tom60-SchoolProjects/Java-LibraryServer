package requests

import Environment
import com.akuleshov7.ktoml.Toml
import kotlinx.serialization.encodeToString
import models.ReaderModel
import okhttp3.*
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.RequestBody.Companion.toRequestBody

class ReaderRequest {
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