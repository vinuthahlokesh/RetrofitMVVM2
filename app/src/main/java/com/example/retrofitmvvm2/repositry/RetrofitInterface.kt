package com.example.retrofitmvvm2.repositry


import retrofit2.Call
import retrofit2.http.GET

interface RetrofitInterface {
    @GET("/public-api/posts")
    fun getdata (): Call<Data>

    @GET("/public-api/users")
    fun getusersdata (): Call<Data>

    @GET("/public-api/comments")
    fun getcommentsdata (): Call<Data>

    @GET("/public-api/todos")
    fun gettodosdata (): Call<Data>

    @GET("/public-api/categories")
    fun getcategoriesdata (): Call<Data>

    @GET("/public-api/products")
    fun getproductsdata (): Call<List<Categories>>

    @GET("/public-api/product-categories")
    fun getproductcategoriesdata (): Call<Data>

}