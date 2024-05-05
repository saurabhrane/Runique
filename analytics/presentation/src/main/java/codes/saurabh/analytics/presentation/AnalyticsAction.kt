package codes.saurabh.analytics.presentation

sealed interface AnalyticsAction {
    data object OnBackClick: AnalyticsAction
}