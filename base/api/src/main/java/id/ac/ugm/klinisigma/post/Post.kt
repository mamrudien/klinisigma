package id.ac.ugm.klinisigma.post

data class Post(
    val id: Long,
    val title: String,
    val thumbnailUrl: String? = null,
    val content: String,
    val authorId: Long,
)