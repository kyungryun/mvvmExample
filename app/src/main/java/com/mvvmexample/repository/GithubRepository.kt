package com.mvvmexample.repository

import com.mvvmexample.api.GithubService

class GithubRepository {
    private val githubClient = GithubService.client
    suspend fun getRepositories(query: String) = githubClient?.getRepositories(query)

}