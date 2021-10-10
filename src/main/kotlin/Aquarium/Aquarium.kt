package Aquarium

import kotlin.math.PI

open class Aquarium (var width: Int = 20, var height: Int = 40, var length: Int = 100) {

//    fun volume(): Int {
//        return width * height * length / 1000
//    }

    //one line declaration same function above
    //fun volume() = width * height * length / 1000

    //or change it to one line getter
//    val volume: Int get() {
//        return  width * height * length / 1000
//    }
    // same as above but in one line
    open var volume: Int
        get() = width * height * length / 1000
        set(value) { height = (value * 1000 ) / (width * height)}

    open var maxWater = volume * 0.9

    //creating a custom constructor
    constructor(numberOfFish: Int): this() {
        val water: Int = numberOfFish * 2000
        val tank: Double = water + water * 0.1
        height = (tank / (length * width)).toInt()
    }
}

//inheritance

class TowerTank(): Aquarium() {
    override var maxWater: Double = volume * 0.8

    override var volume: Int
        get() = (width * height * length / 1000 * PI).toInt()
        set(value) { height = (value * 1000 ) / (width * height)}
}