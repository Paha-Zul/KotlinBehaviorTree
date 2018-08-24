package com.quickbite.economy.behaviour

import com.badlogic.ashley.core.Entity
import com.badlogic.gdx.math.Vector2
import com.quickbite.economy.components.BuildingComponent
import com.quickbite.economy.util.objects.FarmObject
import com.quickbite.economy.util.objects.ItemAmountLink


class BlackBoard{
    private val dataMap:HashMap<String, Any> = hashMapOf()

    inline fun <reified T> get(key:String):T?{
    }
}