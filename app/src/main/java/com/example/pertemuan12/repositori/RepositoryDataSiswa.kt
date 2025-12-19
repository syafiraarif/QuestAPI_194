package com.example.pertemuan12.repositori

import com.example.pertemuan12.modedata.DataSiswa

interface RepositoryDataSiswa{
    suspend fun getDataSiswa(): List<DataSiswa>

    suspend fun postDataSiswa(dataSiswa: DataSiswa) :retrofit2.Response<Void>
}

