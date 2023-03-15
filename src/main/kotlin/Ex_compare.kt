fun main(args: Array<String>) {
    print("Dail MMI Code")
    var mmi_code:String = readLine()!!.toString()

    print("Choose number")
    var dail: Int = readLine()!!.toInt()


    if (dail == 1){
        print("Data Deals")
    }
    if (dail == 2){
        print("Daily Bundles")
    }
    if (dail == 3){
        print("Weekly Bundles")
    }
    if (dail == 4){
        print("GO MONTHLY")
    }
    if (dail == 5){
        print("No Expiry")
    }
    else{

    }
}