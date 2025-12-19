package com.example.pertemuan12.apiservice

import com.example.pertemuan12.modedata.DataSiswa
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ServiceApiSiswa{
    @GET("bacaTeman.php")
    suspend fun getSiswa(): List<DataSiswa>

    @POST("insertTM.php")
    suspend fun postSiswa(@Body data: DataSiswa):retrofit2.Response<Void>

}