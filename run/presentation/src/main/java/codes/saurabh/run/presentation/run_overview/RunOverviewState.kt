package codes.saurabh.run.presentation.run_overview

import codes.saurabh.run.presentation.run_overview.model.RunUi

data class RunOverviewState(
    val runs: List<RunUi> = emptyList()
)
