package github.anoobishnoob.pizzakeeper.data

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query

/**
 * Created by saqan on 8/26/2018.
 */
@Dao
interface PizzaToppingDao {
    @Query("select toppingId from pizzatopping where pizzaId = :id")
    fun getToppingIdsForPizzaId(id: Int): List<Int>

    @Insert
     fun insert(pizzaTopping: PizzaTopping)

    @Query("delete from pizzatopping where pizzaId = :id")
    fun deletePizzaById(id: Int)
}