package com.lobitos.doglist

import okhttp3.Interceptor


class HeaderInterceptor : Interceptor{
    override fun intercept(chain: Interceptor.Chain): okhttp3.Response {

        val request = chain.request().newBuilder()
            .addHeader("Accept", "application/json")
            .addHeader("ApiKey","123PruebaCabecera")
            .build()
        return chain.proceed(request)
    }
}