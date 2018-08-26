package github.anoobishnoob.pizzakeeper.data

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query

/**
 * Created by saqan on 8/26/2018.
 */
@Dao
interface ToppingDao {
    @Query("select * from topping")
    fun getAll(): List<Topping>

    @Query("select * from topping where id = :id")
    fun getToppingById(id: Int): Topping

    @Insert
    fun insert(topping: Topping)
}