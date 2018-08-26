package com.teamtreehouse.pizzakeeper

import android.arch.lifecycle.ViewModel
import com.teamtreehouse.pizzakeeper.data.Topping

/**
 * Created by saqan on 8/26/2018.
 */
class CreatorViewModel : ViewModel() {
    var pizzaName = "New Pizza"
    val switchStates = mutableMapOf<Topping, Boolean>()
}