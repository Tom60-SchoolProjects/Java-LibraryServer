package models

import kotlinx.serialization.Serializable

/**
 * ReaderModel is a class that contains the information of a reader
 * @param name The name of the reader
 */
@Serializable
data class ReaderModel (
    var name: String,
) {
    override fun toString(): String {
        return "models.Reader(name='$name')"
    }
}