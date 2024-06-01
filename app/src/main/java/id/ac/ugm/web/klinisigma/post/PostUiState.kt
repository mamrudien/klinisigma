package id.ac.ugm.web.klinisigma.post

import id.ac.ugm.web.klinisigma.physician.PhysicianUiState

data class PostUiState(
    val title: String,
    val thumbnailUrl: String? = null,
    val content: String,
    val author: PhysicianUiState,
)