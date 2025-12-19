package com.example.pertemuan12.viewmodel

import com.example.pertemuan12.modedata.DataSiswa


sealed interface StatusUiSiswa{
    data class Success(val siswa: List<DataSiswa> = listOf()): StatusUiSiswa
    object Error: StatusUiSiswa
    object Loading: StatusUiSiswa
}

