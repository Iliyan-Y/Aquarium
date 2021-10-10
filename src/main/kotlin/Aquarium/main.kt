package Aquarium

fun main (args: Array<String>) {
    buildAquarium()
}

fun buildAquarium() {
    val myAquarium = Aquarium()
    println("length: ${myAquarium.length}\n height: ${myAquarium.height}\n width: ${myAquarium.width} ")
    myAquarium.height = 80
    println("new height: ${myAquarium.height}")
    println("Volume: ${myAquarium.volume}")
}