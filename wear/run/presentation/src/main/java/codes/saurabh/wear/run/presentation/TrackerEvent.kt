package codes.saurabh.wear.run.presentation

import codes.saurabh.core.presentation.ui.UiText

sealed interface TrackerEvent {
    data object RunFinished: TrackerEvent
    data class Error(val message: UiText): TrackerEvent
}