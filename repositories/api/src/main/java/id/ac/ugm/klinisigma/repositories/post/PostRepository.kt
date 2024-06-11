package id.ac.ugm.klinisigma.repositories.post

import id.ac.ugm.klinisigma.post.Post
import kotlinx.coroutines.flow.Flow

interface PostRepository {
    fun observePostStream(): Flow<List<Post>>
    suspend fun reload(): Unit
}