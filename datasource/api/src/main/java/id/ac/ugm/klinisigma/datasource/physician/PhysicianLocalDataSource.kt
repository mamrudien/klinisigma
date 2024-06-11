package id.ac.ugm.klinisigma.datasource.physician

import id.ac.ugm.klinisigma.physician.Physician
import kotlinx.coroutines.flow.Flow

interface PhysicianLocalDataSource {
    suspend fun getAll(): List<Physician>
    fun observePhysicianById(id: Long): Flow<Physician?>
    suspend fun upsert(physician: Physician): Unit
}
