package id.ac.ugm.web.klinisigma.physician

data class PhysicianUiState(
    val firstname: String,
    val lastname: String,
    val age: Int,
    val photoUrl: String? = null,
    val speciality: String? = null,
    val subSpeciality: String? = null
)