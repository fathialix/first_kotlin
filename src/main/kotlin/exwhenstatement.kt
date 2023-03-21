fun main(args: Array<String>) {
    println("Dail MMI Code")
    var code:String = readLine()!!.toString()

    println("Choose number")
    var dail: Int = readLine()!!.toInt()
    when (dail){
        1-> println("Data Deals")
        2-> println("Daily Bundles")
        3-> println("Weekly Bundles")
        4-> println("GO MONTHLY")
        5-> println("No Expiry")
        else -> println("Invalid")
    }
}