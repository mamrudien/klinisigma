package id.ac.ugm.klinisigma.physician

data class Physician(
    val id: Long,
    val firstname: String,
    val lastname: String,
    val age: Int,
    val photoUrl: String? = null,
    val speciality: String? = null,
    val subSpeciality: String? = null
)