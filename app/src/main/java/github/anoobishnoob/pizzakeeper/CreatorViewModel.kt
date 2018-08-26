package github.anoobishnoob.pizzakeeper

import android.arch.lifecycle.ViewModel
import github.anoobishnoob.pizzakeeper.data.Topping

/**
 * Created by saqan on 8/26/2018.
 */
class CreatorViewModel : ViewModel() {
    var pizzaName = "New Pizza"
    val switchStates = mutableMapOf<Topping, Boolean>()
}