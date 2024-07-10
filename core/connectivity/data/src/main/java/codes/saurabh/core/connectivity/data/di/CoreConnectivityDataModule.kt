package codes.saurabh.core.connectivity.data.di

import codes.saurabh.core.connectivity.data.WearNodeDiscovery
import codes.saurabh.core.connectivity.data.messaging.WearMessagingClient
import codes.saurabh.core.connectivity.domain.NodeDiscovery
import codes.saurabh.core.connectivity.domain.messaging.MessagingClient
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val coreConnectivityDataModule = module {
    singleOf(::WearMessagingClient).bind<MessagingClient>()
    singleOf(::WearNodeDiscovery).bind<NodeDiscovery>()
}