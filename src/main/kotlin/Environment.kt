/**
 * Environment is a class that contains variables that are used in the application
 */
class Environment {
    companion object {
        val url by lazy { System.getenv("URL") ?: "http://127.0.0.1:8080" }
    }
}