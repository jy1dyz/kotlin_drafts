package additional_features

import basic_kotlin_functions.factorial

/*
fun main() {
    try {
        val x:Int = 0
        val z:Int = 0/x
        println("z=$z")
    }
    catch(e:Exception){
        println("Exception")
        println(e.message)
    }
    finally {
        println("Program has been finished")
    }

    exp()
}
*/
fun exp() {
    try{
        val nums = arrayOf(1,2,3,4)
        println(nums[6])
    }
    catch(e:ArrayIndexOutOfBoundsException){
        println("Out of bound of array")
    }
    catch (e:Exception) {
        println(e.message)
    }
}
 fun main() {
     val a:Int? = try{ factorial(8)} catch(e:Exception) { null}
     println(a)
     /*try{
         println(factorial(-5))
     }
     catch(e:Exception){
         println(e.message)
     } */
 }

fun factorial(n:Int):Int {
    if(n<1) throw Exception("Input number must be more than zero")
    var result = 1
    for(i in 1..n)
        result *= i
    return result
}