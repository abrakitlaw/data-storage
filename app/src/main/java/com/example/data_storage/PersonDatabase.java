package com.example.data_storage;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

/**
 * @author Abraham Ginting (abraham.ginting@dana.id)
 * @version PersonDatabase, v 0.1 2019-11-26 16:44 by Abraham Ginting
 */
@Database(entities = Person.class, exportSchema = false, version = 1)
public abstract class PersonDatabase extends RoomDatabase {

    private static final String DB_NAME = "person_db";

    private static PersonDatabase instance;

    public static synchronized PersonDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room
                .databaseBuilder(context.getApplicationContext(), PersonDatabase.class, DB_NAME)
                .fallbackToDestructiveMigration()
                .build();
        }
        return instance;
    }

    public abstract PersonDao personDao();
}
