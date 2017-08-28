package com.moez.QKSMS.dagger

import com.moez.QKSMS.data.repository.ConversationRepository
import com.moez.QKSMS.ui.conversations.ConversationListViewModel
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ConversationsModule {

    @Provides
    @Singleton
    fun provideRepository(): ConversationRepository {
        return ConversationRepository()
    }

    @Provides
    @Singleton
    fun provideViewModel(repository: ConversationRepository): ConversationListViewModel {
        return ConversationListViewModel(repository)
    }

}