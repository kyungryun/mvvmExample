package com.mvvmexample.ui.view.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mvvmexample.api.setImageWithGlide
import com.mvvmexample.model.GithubRepositoryModel
import kotlinx.android.synthetic.main.item_github_repository.view.*

class GithubRepositoryItemHolder(view: View, listener: GithubRepositoryAdapter.OnGithubRepositoryClickListener?) : RecyclerView.ViewHolder(view) {

    private val avatarView: ImageView = view.avatarView
    private val fullNameView: TextView = view.fullNameView
    private val descriptionView: TextView = view.descriptionView
    private val starCountView: TextView = view.starCountView

    init {
        view.setOnClickListener{
            listener?.onItemClick(adapterPosition)
        }
    }

    fun bind(model: GithubRepositoryModel){
        model.run{
            avatarView.setImageWithGlide(owner.avatarUrl)
            fullNameView.text = fullName
            descriptionView.text = description
            starCountView.text = "Stars : $stargazersCount"
        }
    }

}