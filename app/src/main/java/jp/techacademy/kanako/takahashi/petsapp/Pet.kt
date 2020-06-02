package jp.techacademy.kanako.takahashi.petsapp

import java.io.Serializable

class Pet(val name: String, val uid: String, val gender: String, val birth: String, val old: String, val petUid:String,bytes: ByteArray) : Serializable {
    val imageBytes: ByteArray

    init {
        imageBytes = bytes.clone()
    }
}