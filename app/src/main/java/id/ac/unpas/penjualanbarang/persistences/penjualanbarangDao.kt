package id.ac.unpas.penjualanbarang.persistences

import androidx.lifecycle.LiveData
import androidx.room.*
import id.ac.unpas.penjualanbarang.model.penjualanbarang

@Dao
interface penjualanbarangDao {
    @Query("SELECT * FROM penjualanbarang")
    fun loadAll(): LiveData<List<penjualanbarang>>
    @Query("SELECT * FROM penjualanbarang WHERE id = :id")
    fun find(id: String): penjualanbarang?
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(vararg items: penjualanbarang)
    @Delete
    fun delete(item: penjualanbarang)
}