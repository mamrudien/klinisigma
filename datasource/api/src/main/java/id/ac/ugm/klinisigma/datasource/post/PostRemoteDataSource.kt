package id.ac.ugm.klinisigma.datasource.post

import id.ac.ugm.klinisigma.post.Post

interface PostRemoteDataSource {
    suspend fun getPostList(): List<Post>
}
