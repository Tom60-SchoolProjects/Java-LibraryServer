package models

import kotlinx.serialization.Serializable

@Serializable
data class ReaderModel (
    var name: String,
) {
    override fun toString(): String {
        return "models.Reader(name='$name')"
    }
}