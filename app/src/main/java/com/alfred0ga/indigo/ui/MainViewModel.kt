package com.alfred0ga.indigo.ui

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.alfred0ga.indigo.repositories.MainRepo

class MainViewModel @ViewModelInject constructor(
    private val repo: MainRepo
) : ViewModel() {
    
}