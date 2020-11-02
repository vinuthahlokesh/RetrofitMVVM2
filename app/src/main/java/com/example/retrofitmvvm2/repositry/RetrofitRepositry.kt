package com.example.retrofitmvvm2.repositry

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RetrofitRepositry {
    private val retrofit = RetrofitObject.getRetrofitInstance()
    private val apiInterface = retrofit.create(RetrofitInterface::class.java)
    fun getdata(apiResponseInterface: ApiCallBback){
        val userResponseData: Call<Data> = apiInterface.getdata()
        userResponseData.enqueue(object : Callback<Data> {
            override fun onResponse(
                call: Call<Data>,
                response: Response<Data>
            ) {
                response.body()?.let {
                    apiResponseInterface.onResponse(it.data)
                }
            }
            override fun onFailure(call: Call<Data>, t: Throwable) {
                apiResponseInterface.onFailure(t)
            }
        })
    }


    fun getusersdata(apiResponseInterface: ApiCallBback) {
        val userResponseData: Call<Data> = apiInterface.getusersdata()
        userResponseData.enqueue(object : Callback<Data> {
            override fun onResponse(
                    call: Call<Data>,
                    response: Response<Data>
            ) {
                response.body()?.let {
                    apiResponseInterface.onResponse(it.data)
                }
            }
            override fun onFailure(call: Call<Data>, t: Throwable) {
                apiResponseInterface.onFailure(t)
            }
        })
    }

    fun getcommentsdata(apiResponseInterface: ApiCallBback) {
        val userResponseData: Call<Data> = apiInterface.getcommentsdata()
        userResponseData.enqueue(object : Callback<Data> {
            override fun onResponse(
                    call: Call<Data>,
                    response: Response<Data>
            ) {
                response.body()?.let {
                    apiResponseInterface.onResponse(it.data)
                }
            }
            override fun onFailure(call: Call<Data>, t: Throwable) {
                apiResponseInterface.onFailure(t)
            }
        })
    }
    fun gettodosdata(apiResponseInterface: ApiCallBback) {
        val userResponseData: Call<Data> = apiInterface.gettodosdata()
        userResponseData.enqueue(object : Callback<Data> {
            override fun onResponse(
                    call: Call<Data>,
                    response: Response<Data>
            ) {
                response.body()?.let {
                    apiResponseInterface.onResponse(it.data)
                }
            }
            override fun onFailure(call: Call<Data>, t: Throwable) {
                apiResponseInterface.onFailure(t)
            }
        })
    }
    fun getcategoriesdata(apiResponseInterface: ApiCallBback) {
        val userResponseData: Call<Data> = apiInterface.getcategoriesdata()
        userResponseData.enqueue(object : Callback<Data> {
            override fun onResponse(
                    call: Call<Data>,
                    response: Response<Data>
            ) {
                response.body()?.let {
                    apiResponseInterface.onResponse(it.data)
                }
            }
            override fun onFailure(call: Call<Data>, t: Throwable) {
                apiResponseInterface.onFailure(t)
            }


        })
    }
    fun getproductsdata(apiResponseInterface: ApiCallbackForCategories) {
        val userResponseData: Call<List<Categories>> = apiInterface.getproductsdata()
        userResponseData.enqueue(object : Callback<List<Categories>> {
            override fun onResponse(
                    call: Call<List<Categories>>, response: Response<List<Categories>>) {
                response.body()?.let {
                    apiResponseInterface.onResponse(it)
                }
            }
            override fun onFailure(call: Call<List<Categories>>, t: Throwable) {
                apiResponseInterface.onFailure(t)
            }

        })
    }
    fun getproductcategoriesdata(apiResponseInterface: ApiCallBback) {
        val userResponseData: Call<Data> = apiInterface.getproductcategoriesdata()
        userResponseData.enqueue(object : Callback<Data> {
            override fun onResponse(
                    call: Call<Data>,
                    response: Response<Data>
            ) {
                response.body()?.let {
                    apiResponseInterface.onResponse(it.data)
                }
            }
            override fun onFailure(call: Call<Data>, t: Throwable) {
                apiResponseInterface.onFailure(t)
            }
        })
    }
}