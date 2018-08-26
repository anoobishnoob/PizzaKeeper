package github.anoobishnoob.pizzakeeper.data

import android.arch.persistence.room.Entity
import android.arch.persistence.room.ForeignKey

/**
 * Created by saqan on 8/26/2018.
 */
@Entity(primaryKeys = ["pizzaId", "toppingId"],
        foreignKeys = [
        ForeignKey(entity = Pizza::class, parentColumns = ["id"], childColumns = ["pizzaId"]),
        ForeignKey(entity = Topping::class, parentColumns = ["id"], childColumns = ["toppingId"])

        ]
)
data class PizzaTopping (
        val  pizzaId: Int,
        val toppingId: Int
)