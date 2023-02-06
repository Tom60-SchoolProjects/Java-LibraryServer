import io.github.cdimascio.dotenv.dotenv

class Environement {
    companion object {
        val url by lazy {
            val dotenv = dotenv()
            dotenv["URL"]
        }
    }
}