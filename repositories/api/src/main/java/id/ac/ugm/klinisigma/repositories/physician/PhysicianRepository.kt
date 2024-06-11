package id.ac.ugm.klinisigma.repositories.physician

import id.ac.ugm.klinisigma.physician.Physician
import kotlinx.coroutines.flow.Flow

interface PhysicianRepository {
    suspend fun getPhysicianById(id: Long): Physician?
    fun observePhysicianById(id: Long): Flow<Physician?>
}