package oop

class House(owner:String,model:String,kitchen:Int,bedrooms:Int,bathrooms:Int,floors:Int) {

    init {
        println("Owned by $owner")
        println("House type $model")
        println("Has $kitchen kitchen")
        println("Has $bedrooms bedrooms")
        println("Has $bathrooms bathrooms")
        println("Has $floors floors")
    }
}

fun main(args: Array<String>) {
    var owner_one = House("Jeno","Modern",2,5, 7,3)
    var owner_two = House("Jaemin","Classic",1,3, 5,2)
    var owner_three = House("Jisung","Modern",2,4, 6,2)
    var owner_four = House("Haechan","Vintage",1,5, 7,3)
    var owner_five = House("Chenle","Modern",2,4, 6,2)
    var owner_six = House("Renjun","Cottage",1,2, 3,2)
}