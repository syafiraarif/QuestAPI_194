package com.example.pertemuan12.viewmodel

import com.example.pertemuan12.modedata.DataSiswa

sealed interface StatusUIDetail {
    data class Success (val satusiswa: DataSiswa) : StatusUIDetail
    object Error : StatusUIDetail
    object Loading : StatusUIDetail
}