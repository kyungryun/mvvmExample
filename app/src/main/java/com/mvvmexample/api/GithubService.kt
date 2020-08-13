package com.mvvmexample.api


object GithubService{
    private const val GITHUB_URL = "http://api.github.com"

    val client = BaseService().getClient(GITHUB_URL)?.create(GithubApi::class.java)
}