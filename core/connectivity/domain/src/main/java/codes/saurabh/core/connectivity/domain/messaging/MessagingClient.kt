package codes.saurabh.core.connectivity.domain.messaging

import codes.saurabh.core.domain.util.EmptyResult
import kotlinx.coroutines.flow.Flow

interface MessagingClient {
    fun connectToNode(nodeId: String): Flow<MessagingAction>
    suspend fun sendOrQueueAction(action: MessagingAction): EmptyResult<MessagingError>
}