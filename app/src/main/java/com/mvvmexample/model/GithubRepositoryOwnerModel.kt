package com.mvvmexample.model

import com.google.gson.annotations.SerializedName

data class GithubRepositoryOwnerModel (
    @SerializedName("avatar_url")
    val avatarUrl: String
){

}