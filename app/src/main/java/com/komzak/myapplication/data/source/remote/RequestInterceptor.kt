package com.komzak.myapplication.data.source.remote

import okhttp3.Interceptor
import okhttp3.Response


/**
 * Created by Komiljon Zokirov on 8/31/2023.
 */
class RequestInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val originalRequest = chain.request()
        val newUrl = originalRequest.url
            .newBuilder()
            .addQueryParameter(
                "api_key",
                "b251f83131ad1da248a073f4e86fd0dc"
            )
            .build()
        val request = originalRequest.newBuilder()
            .url(newUrl)
            .build()
        return chain.proceed(request)
    }
}