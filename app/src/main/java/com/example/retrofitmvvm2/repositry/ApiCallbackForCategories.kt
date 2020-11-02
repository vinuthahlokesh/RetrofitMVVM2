package com.example.retrofitmvvm2.repositry

interface ApiCallbackForCategories {
    fun onResponse(response: List<Categories>)
    fun onFailure(t:Throwable)
}