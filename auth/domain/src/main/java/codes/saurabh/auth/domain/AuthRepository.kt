package codes.saurabh.auth.domain

import codes.saurabh.core.domain.util.DataError
import codes.saurabh.core.domain.util.EmptyResult

interface AuthRepository {
    suspend fun register(email: String, password: String): EmptyResult<DataError.Network>
}