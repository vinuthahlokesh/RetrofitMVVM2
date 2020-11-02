package com.example.retrofitmvvm2.repositry

data class Data (
    val code: Int,
    val `data`: List<DataX>,
    val meta: Meta
)
data class DataX(
    val body: String,
    val created_at: String,
    val id: Int,
    val post_id:Int,
    val name: String,
    val description:String,
    val email: String,
    val gender: String,
    val status : String,
    val title: String,
    val updated_at: String,
    val completed:String,
    val user_id: Int,
    val product_id:Int,
    val category_id:Int,
    val categories: Categories
)
data class Categories(
    val id:Int,
    val name:String
)

data class Meta(
    val pagination: Pagination
)
data class Pagination(
    val limit: Int,
    val page: Int,
    val pages: Int,
    val total: Int
)