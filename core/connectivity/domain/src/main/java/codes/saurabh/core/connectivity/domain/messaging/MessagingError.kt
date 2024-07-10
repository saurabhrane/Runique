package codes.saurabh.core.connectivity.domain.messaging

import codes.saurabh.core.domain.util.Error

enum class MessagingError: Error {
    CONNECTION_INTERRUPTED,
    DISCONNECTED,
    UNKNOWN
}