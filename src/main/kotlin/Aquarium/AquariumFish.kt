package Aquarium

abstract class AquariumFish {
    abstract val color: String
}

class Shark: AquariumFish(), FishAction {
    override val color = "Grey"
    override fun eat() {
        println("FISH FISH")
    }
}

class Tostolop: AquariumFish(), FishAction {
    override val color: String
        get() = "Gold"

    override fun eat() {
        println("Seaweed")
    }
}

interface FishAction {
    fun eat()
}
