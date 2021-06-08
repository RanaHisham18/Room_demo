package com.rana.roomdemo.database

import androidx.room.Insert

@Dao
interface SubscriberDAO {

}
@Insert
suspend fun insertSubscriber(subscriber: Subscriber) : Long


@Update
suspend fun updateSubscriber(subscriber: Subscriber) : Int



@Delete
suspend fun deleteSubscriber(subscriber: Subscriber) : Int







