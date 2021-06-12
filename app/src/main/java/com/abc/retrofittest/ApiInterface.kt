package com.abc.retrofittest

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {

    @GET("posts")
    //fun getData():Call<List<MyDataItem>>
    suspend fun getData():Response<List<MyDataItem>>
}