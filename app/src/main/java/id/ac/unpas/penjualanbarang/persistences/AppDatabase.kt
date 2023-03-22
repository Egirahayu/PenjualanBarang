package id.ac.unpas.penjualanbarang.persistences

import androidx.room.Database
import androidx.room.RoomDatabase
import id.ac.unpas.penjualanbarang.model.penjualanbarang

@Database(entities = [penjualanbarang::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun penjualanbarangDao(): penjualanbarangDao
}