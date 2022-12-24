package com.tumusx.network.retrofit

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object InstanceRetrofit {
    val baseUrlService = "your-url"
    val instanceRetrofit = Retrofit.Builder().baseUrl(baseUrlService)
        .addConverterFactory(MoshiConverterFactory.create()).build()
}