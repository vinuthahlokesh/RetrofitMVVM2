package com.example.retrofitmvvm2.repositry

interface ApiCallBback {
    fun onResponse(response: List<DataX>)
    fun onFailure(t:Throwable)
}