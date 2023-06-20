package com.lobitos.doglist

import okhttp3.MultipartBody
import okhttp3.Request
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.http.Url

interface APIService {

    @GET("/example/example2/1234/loquesea")
    suspend fun getDogsByBreeds(@Url url:String): Response<DogsResponse>

    //example
    @GET("/example/example2/{id}/loquesea")
    suspend fun getDogsByBreeds2(@Path("id")id:String): Response<DogsResponse>

    @GET("/example/example2/v2/loquesea") //esto sirve para agregar mas caracteres a su derecha
    suspend fun getDogsByBreeds3(@Query("pet") pet:String, @Query("name") name:String ): Response<DogsResponse>


    @POST
    fun getEVERYTHING(@Body exampleJuanDTO: ExampleJuanDTO): Call<*>

    @Multipart
    @POST
    fun getEVERYTHING2(@Part image:MultipartBody.Part, @Part("example") myExample:String): Call<*>



}


data class ExampleJuanDTO(val name: String, val age: Int)