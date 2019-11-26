package com.example.data_storage;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

/**
 * @author Abraham Ginting (abraham.ginting@dana.id)
 * @version Person, v 0.1 2019-11-26 16:37 by Abraham Ginting
 */
//Annotate the class with @Entity and use the tableName property to set the name of the table.
@Entity(tableName = "person")
public class Person {

    //Set the primary key by adding the @PrimaryKey annotation to the correct fields
    @PrimaryKey(autoGenerate = true)
    private int id;

    //Set the name of the columns for the class fields using the @ColumnInfo(name = “column_name”) annotation
    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "city")
    private String city;

    public Person(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    //Add the @Ignore annotation to tell Room which should be used and which not.
    @Ignore
    public Person(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
