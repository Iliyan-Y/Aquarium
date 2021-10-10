package Aquarium

class Aquarium {
    var width: Int = 20
    var height: Int = 40
    var length: Int = 100

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
    val volume: Int get() = width * height * length / 1000


}