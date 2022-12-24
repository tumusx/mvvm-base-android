package com.tumusx.network.stateRequest

sealed class ApiResult<T>(val data: T? = null, val messageError: String? = null) {
    class Success<T>(data: T) : ApiResult<T>(data = data)
    class Error<T>(messageError: String) : ApiResult<T>(messageError = messageError)
    object Loading : ApiResult<Nothing>()
}