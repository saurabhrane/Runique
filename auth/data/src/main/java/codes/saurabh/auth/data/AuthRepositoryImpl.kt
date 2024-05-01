package codes.saurabh.auth.data

import codes.saurabh.auth.domain.AuthRepository
import codes.saurabh.core.data.networking.post
import codes.saurabh.core.domain.util.DataError
import codes.saurabh.core.domain.util.EmptyResult
import io.ktor.client.HttpClient

class AuthRepositoryImpl(
    private val httpClient: HttpClient
): AuthRepository {

    override suspend fun register(email: String, password: String): EmptyResult<DataError.Network> {
        return httpClient.post<RegisterRequest, Unit>(
            route = "/register",
            body = RegisterRequest(
                email = email,
                password = password
            )
        )
    }
}