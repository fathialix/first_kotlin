fun main(args: Array<String>) {
    add(num1 = 400, num2 = 400)
    multiply(num1 = 100, num2 = 20)
    divide(num1 = 400, num2 = 20)
}

fun add(num1:Int, num2:Int){

    var result = num1 + num2
    println(result)
}
fun multiply(num1:Int, num2: Int){

    var result = num1 * num2
    println(result)
}
fun divide(num1:Int, num2: Int){

    var result = num1 / num2
    println(result)
}