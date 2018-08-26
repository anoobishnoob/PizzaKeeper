package github.anoobishnoob.pizzakeeper.data

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

/**
 * Created by saqan on 8/26/2018.
 */
@Database(entities = [Pizza:: class, PizzaTopping::class, Topping::class], version = 1)
abstract class PizzaDatabase: RoomDatabase() {
    abstract fun pizzaDao(): PizzaDao
    abstract fun pizzaToppingDap(): PizzaToppingDao
    abstract fun ToppingDao(): ToppingDao


}