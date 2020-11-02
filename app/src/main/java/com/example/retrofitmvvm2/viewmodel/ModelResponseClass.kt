package com.example.retrofitmvvm2.viewmodel

import androidx.lifecycle.ViewModel
import com.example.retrofitmvvm2.repositry.*

class ModelResponseClass : ViewModel() {


    fun getdata(viewCallBack: ApiCallBback) {
        val responseRepository = RetrofitRepositry()
        responseRepository.getdata(object : ApiCallBback {
            override fun onResponse(response: List<DataX>) {
                viewCallBack.onResponse(response)
            }

            override fun onFailure(t: Throwable) {
                viewCallBack.onFailure(t)
            }

        })
    }


    fun getusersdata(viewCallBack: ApiCallBback) {
        val responseRepository = RetrofitRepositry()
        responseRepository.getusersdata(object : ApiCallBback {
            override fun onResponse(response: List<DataX>) {
                viewCallBack.onResponse(response)
            }

            override fun onFailure(t: Throwable) {
                viewCallBack.onFailure(t)
            }

        })
    }

    fun getcommentsdata(viewCallBack: ApiCallBback) {
        val responseRepository = RetrofitRepositry()
        responseRepository.getcommentsdata(object : ApiCallBback {
            override fun onResponse(response: List<DataX>) {
                viewCallBack.onResponse(response)
            }

            override fun onFailure(t: Throwable) {
                viewCallBack.onFailure(t)
            }

        })
    }
    fun gettodosdata(viewCallBack: ApiCallBback) {
        val responseRepository = RetrofitRepositry()
        responseRepository.gettodosdata(object : ApiCallBback {
            override fun onResponse(response: List<DataX>) {
                viewCallBack.onResponse(response)
            }

            override fun onFailure(t: Throwable) {
                viewCallBack.onFailure(t)
            }

        })
    }

    fun getcategoriesdata(viewCallBack: ApiCallBback) {
        val responseRepository = RetrofitRepositry()
        responseRepository.getcategoriesdata(object : ApiCallBback {
            override fun onResponse(response: List<DataX>) {
                viewCallBack.onResponse(response)
            }

            override fun onFailure(t: Throwable) {
                viewCallBack.onFailure(t)
            }

        })
    }
    fun getproductsdata(viewCallBack: ApiCallbackForCategories) {
        val responseRepository = RetrofitRepositry()
        responseRepository.getproductsdata(object : ApiCallbackForCategories {
            override fun onResponse(response: List<Categories>) {
                viewCallBack.onResponse(response)
            }

            override fun onFailure(t: Throwable) {
                viewCallBack.onFailure(t)
            }

        })
    }
    fun getproductcategoriesdata(viewCallBack: ApiCallBback) {
        val responseRepository = RetrofitRepositry()
        responseRepository.getproductcategoriesdata(object : ApiCallBback {
            override fun onResponse(response: List<DataX>) {
                viewCallBack.onResponse(response)
            }

            override fun onFailure(t: Throwable) {
                viewCallBack.onFailure(t)
            }

        })
    }
}

