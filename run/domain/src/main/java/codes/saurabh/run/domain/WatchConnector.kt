package codes.saurabh.run.domain

import codes.saurabh.core.connectivity.domain.DeviceNode
import codes.saurabh.core.connectivity.domain.messaging.MessagingAction
import codes.saurabh.core.connectivity.domain.messaging.MessagingError
import codes.saurabh.core.domain.util.EmptyResult
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.StateFlow

interface WatchConnector {
    val connectedDevice: StateFlow<DeviceNode?>
    val messagingActions: Flow<MessagingAction>

    suspend fun sendActionToWatch(action: MessagingAction): EmptyResult<MessagingError>
    fun setIsTrackable(isTrackable: Boolean)
}