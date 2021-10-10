package Aquarium

fun main (args: Array<String>) {
    buildAquarium()
    makeFish()
}

//accessible only in this file
private fun buildAquarium() {
    val myAquarium = Aquarium()
    println("length: ${myAquarium.length}\n height: ${myAquarium.height}\n width: ${myAquarium.width} ")
    myAquarium.height = 80
    println("new height: ${myAquarium.height}")
    println("Volume: ${myAquarium.volume}")

    val smallAquarium = Aquarium(20,15,30)
    println("Small aquarium volme: ${smallAquarium.volume} and the max water it takes is ${smallAquarium.maxWater}")

    val fishAquarium = Aquarium(numberOfFish = 19)
    println("Fish Aquarium: length: ${fishAquarium.length} height: ${fishAquarium.height} width: ${fishAquarium.width}")

    val fixExample = Fish(false, 30)
    // if class initialize method exist need to call by variable the volume needed
    println("Example fish volume needed: ${fixExample.size} ")
}
fun makeFish() {
    val shark = Shark()
    val tostolop = Tostolop()

    println("Shark has ${shark.color} color and the tostolop has ${tostolop.color} color")
//    shark.eat()
//    tostolop.eat()

    feedFish(shark)
    feedFish(tostolop)
}

fun feedFish(fish: FishAction) {
    fish.eat()
}