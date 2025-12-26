package com.example.pertemuan12.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.mutableStateSetOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.pertemuan12.modedata.UIStateSiswa
import com.example.pertemuan12.repositori.RepositoryDataSiswa

class EditViewModel (savedStateHandle: SavedStateHandle,private val repositoryDataSiswa:
    RepositoryDataSiswa): ViewModel(){

        var uiStateSiswa by mutableStateOf(UIStateSiswa())
        private set
}