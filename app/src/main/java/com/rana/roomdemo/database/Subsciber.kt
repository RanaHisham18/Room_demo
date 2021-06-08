package com.rana.roomdemo.database


import kotlin.Any as Any1
//I added all those annotations due to suggestions.

@Entity(tableName = "subscriber_data_table")
data class Subsciber(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "subscriber_id")
    val id : Int,
    @ColumnInfo(name = "subscriber_name")
    val name : String,
    @ColumnInfo(name = "subscriber_email")
    val email: String
) {
    annotation class PrimaryKey(val autoGenerate: Boolean)

}


