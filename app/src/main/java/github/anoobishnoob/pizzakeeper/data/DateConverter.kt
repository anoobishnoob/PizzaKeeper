package github.anoobishnoob.pizzakeeper.data

import android.arch.persistence.room.TypeConverter
import java.util.*

/**
 * Created by saqan on 8/26/2018.
 */
class DateConverter {
    @TypeConverter
    fun dateToLong(date: Date): Long = date.time

    @TypeConverter
    fun longToDate(long: Long): Date = Date(long)
}