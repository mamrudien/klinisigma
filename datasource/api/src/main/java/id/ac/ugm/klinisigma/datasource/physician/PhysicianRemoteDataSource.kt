package id.ac.ugm.klinisigma.datasource.physician

import id.ac.ugm.klinisigma.physician.Physician

interface PhysicianRemoteDataSource {
    suspend fun getPhysicianList(): List<Physician>
    suspend fun getPhysicianById(id: Long): Physician
}
