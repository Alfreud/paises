package com.alfred0ga.indigo.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.alfred0ga.indigo.repositories.MainRepo

class MainViewModelProviderFactory(
    val repo: MainRepo
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModel(repo) as T
    }
}