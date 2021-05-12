package com.lucascabral.kotlin150

sealed interface Error

class GenericError(val message: String) : Error
class HttpError(val errorCode: Int) : Error

fun test(error: Error) {
    val result = when (error) {
        is GenericError -> TODO()
        is HttpError -> TODO()
    }
}
