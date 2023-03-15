fun main(args: Array<String>) {
    println("Enter student grade")
    var grade:Int = readLine()!!.toInt()

    if ( grade >=80)
        print("A-EXCELLENT")
    else if (grade >=70)
        print(" A- Amazing")
    else if (grade >= 60)
        print("B -Very good performance")
    else if (grade >=50)
        print("C - Good performance")
    else if (grade >=40)
        print("Average performance")
    else if (grade <=30)
        print("Student has to repeat")
}