package id.ac.ugm.klinisigma.datasource.post

import id.ac.ugm.klinisigma.post.Post
import kotlinx.coroutines.flow.Flow

interface PostLocalDataSource {
    fun observePostStream(): Flow<List<Post>>
    suspend fun upsert(post: Post): Unit
    suspend fun upsertAll(posts: List<Post>): Unit
    suspend fun deleteAll(): Unit
}
