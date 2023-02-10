class Environment {
    companion object {
        val url by lazy { System.getenv("URL") ?: "http://127.0.0.1:8080" }
    }
}