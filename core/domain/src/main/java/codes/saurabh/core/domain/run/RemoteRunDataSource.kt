package codes.saurabh.core.domain.run

import codes.saurabh.core.domain.util.DataError
import codes.saurabh.core.domain.util.EmptyResult
import codes.saurabh.core.domain.util.Result

interface RemoteRunDataSource {
    suspend fun getRuns(): Result<List<Run>, DataError.Network>
    suspend fun postRun(run: Run, mapPicture: ByteArray): Result<Run, DataError.Network>
    suspend fun deleteRun(id: String): EmptyResult<DataError.Network>
}