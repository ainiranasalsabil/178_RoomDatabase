package com.example.roomdatabase.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface SiswaDao {
    @Query(value = "SELECT * from tblSiswa ORDER By nama ASC")
    fun  getAllSiswa(): Flow<List<Siswa>>


}