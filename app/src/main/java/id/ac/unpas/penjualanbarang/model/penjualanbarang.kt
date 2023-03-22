package id.ac.unpas.penjualanbarang.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class penjualanbarang(
    @PrimaryKey val id: String,
    val nama: String,
    val stok: String,
    val harga: String
)
