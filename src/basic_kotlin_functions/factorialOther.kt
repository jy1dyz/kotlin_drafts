package basic_kotlin_functions



fun factorial(n:Int):Int {

    var result = 1
    for(d in 1..n) {
        result *= d
    }
    return result
}
/*
fun main() {
    val a = factorial(4)
    val b = factorial(6)
    val c = factorial(2)
    println("a=$a, b=$b, c=$c")
}
*/
//ЛОкальные функции

fun isFirstGreater(base1: Double, height1: Double, base2: Double, height2: Double):Boolean {
    fun square(base: Double, height: Double) = base*height/2
    return square(base1, height1) > square(base2, height2)
}
/*
fun main() {
    val a = isFirstGreater(10.0,10.0, 20.0, 20.0)
    val b = isFirstGreater(20.0, 20.0, 10.0, 10.0)
    println("a=$a, b=$b")
}

 */

fun add(a: Double, b:Int): Double {
    return a+b
}
fun add(a: Double, b:Int, c:Float):String{
    return "$a + $b + $c"
}
/*
fun main() {
    val s = add(1.0,5)
    val k = add(5.0,4, 5.5f)
    println(s)
    println(k)
}
*/
//Функции высшего порядка

fun action(n1:Int, n2:Int, operation: (Int, Int)->Int) {
    val result = operation(n1, n2)
    println(result)
}

fun main() {
    val add = {x:Int, y:Int -> x+y}
    val multiply = {x:Int, y:Int -> x*y}

    action(5,3,add)
    action(5,3,multiply)
    action(5,3) { x:Int, y:Int -> x-y}
}