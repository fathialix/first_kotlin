fun main(args: Array<String>) {
    println("Dail MMI Code")
    var code:String = readLine()!!.toString()

    println("Choose number")
    var dail: Int = readLine()!!.toInt()


    if (dail == 1){
        print("Data Deals")
    }
    else if (dail == 2){
        print("Daily Bundles")
    }
    else if (dail == 3){
        print("Weekly Bundles")
    }
    else if (dail == 4){
        print("GO MONTHLY")
    }
    else if (dail == 5){
        print("No Expiry")
    }
    else{
        print("Invalid characters")
    }
}