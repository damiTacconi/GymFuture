package com.example.dami_.gymfuture.Model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "objetives")
public class Objetive {
    @PrimaryKey @NonNull
    @ColumnInfo(name = "id_objetive")
    private String key;
    @ColumnInfo(name = "breakTime")
    private String breakTime;
    @ColumnInfo(name = "name")
    private String name;
    @ColumnInfo(name = "repetitions")
    private Byte repetitions;
    @ColumnInfo(name = "series")
    private Byte series;

    public Objetive(@NonNull String key, String breakTime, String name, Byte repetitions, Byte series) {
        this.key = key;
        this.breakTime = breakTime;
        this.name = name;
        this.repetitions = repetitions;
        this.series = series;
    }


    @NonNull
    public String getKey() {
        return key;
    }

    public void setKey(@NonNull String key) {
        this.key = key;
    }

    public String getBreakTime() {
        return breakTime;
    }

    public void setBreakTime(String breakTime) {
        this.breakTime = breakTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getRepetitions() {
        return repetitions;
    }

    public void setRepetitions(Byte repetitions) {
        this.repetitions = repetitions;
    }

    public Byte getSeries() {
        return series;
    }

    public void setSeries(Byte series) {
        this.series = series;
    }
}
