package com.example.dami_.gymfuture.Dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.dami_.gymfuture.Model.Category;

import java.util.List;

@Dao
public interface CategoryDao {
    @Insert
    void insert(Category... categories);
    @Delete
    void delete(Category... categories);
    @Update
    void update(Category... categories);
    @Query("SELECT * FROM categories")
    LiveData<List<Category>> getAll();
    @Query("DELETE FROM categories")
    void truncate();
}
