package com.tumusx.network.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object InstanceRetrofit {
    val baseUrlService = ""
    val instanceRetrofit = Retrofit.Builder().baseUrl(baseUrlService)
        .addConverterFactory(GsonConverterFactory.create()).build()
}