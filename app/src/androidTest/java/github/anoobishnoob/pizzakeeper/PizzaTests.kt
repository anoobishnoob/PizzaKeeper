package github.anoobishnoob.pizzakeeper

import android.arch.persistence.room.Room
import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4
import github.anoobishnoob.pizzakeeper.data.Pizza
import github.anoobishnoob.pizzakeeper.data.PizzaDatabase
import github.anoobishnoob.pizzakeeper.data.PizzaTopping

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import java.util.*

@RunWith(AndroidJUnit4::class)
class PizzaTests {
    val testPizza = Pizza(0, "Hawaiian", Date())
    val testToppingIds = listOf(1,7)
    val appContext = InstrumentationRegistry.getTargetContext()
    val db = Room.databaseBuilder(appContext, PizzaDatabase::class.java,"PizzaDatabase")
            .build()



    @Test
    fun PizzaTest() {

        db.clearAllTables()
        db.pizzaDao().insert(testPizza)
        val returnedPizza = db.pizzaDao().getPizzaByID(testPizza.id)
        assertEquals(testPizza, returnedPizza)
    }
    @Test
    fun pizzaToppingTest(){
        //Arrange
        db.clearAllTables()
        db.pizzaDao().insert(testPizza)
        toppings.forEach{
            db.ToppingDao().insert(it)

        }

        // Act
        testToppingIds.forEach{
            val pizzaTopping = PizzaTopping(testPizza.id, it)
            db.pizzaToppingDao().insert(pizzaTopping)
        }
        val returnedToppingIds = db.pizzaToppingDao().getToppingIdsForPizzaId(testPizza.id)

        //Assert
        assertEquals(testToppingIds, returnedToppingIds)
    }



}
