package basic_kotlin_functions

/*
fun main() {
    // Creates an Array<String> with values ["0", "1", "4", "9", "16"]
    val asc = Array(5) { i -> (i * i).toString() }
    asc.forEach { println(it) }

    val array1 = arrayOf(7, 1, 78, 56, 5, 0)
    array1.sortedBy{it}
    array1.forEach { println(it) }
    if(array1.contains(2)) return println("array1 has a number 2")
    else {println("array1 has not a number 2")}

    var index = 0
    while(index < array1.size) {
        println(array1[index]-1)
        index++

    }



}
*/


/*
fun main() {
    val str = "abcd"
    for (c in str) {
        println(c)
    }

    val s = "abc" + 1
    println(s + "def")


}
*/
/*
fun main() {
    for (i in 1..3) {
        println(i)
    }
    for (i in 6 downTo 0 step 2) {
        println(i)
    }
}

 */
/*
fun main() {
    val array = arrayOf("a", "b", "c")
    for ((index, value) in array.withIndex()) {
        println("the element at $index is $value")
        println(value)
    }


}
*/
/*
fun foo() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return // non-local return directly to the caller of foo()
        println(it)
    }
    println("this point is unreachable")
}

fun main() {
    foo()
}
*/
/*
fun foo() {
    listOf(1, 2, 3, 4, 5).forEach lit@{
        if (it == 3) return@lit // local return to the caller of the lambda, i.e. the forEach loop
        print(it)
    }
    print(" done with explicit label")
}

fun main() {
    foo()
}
*/

fun foo() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return@forEach // local return to the caller of the lambda, i.e. the forEach loop
        print(it)
    }
    print(" done with implicit label")
}

fun main() {
    foo()
}
