package basic_kotlin_functions

fun printStrings(vararg strings: String) {
    for(str in strings)
        println(str)
}
/*
fun main(args:Array<String>) {

    printStrings("Tom", "Bob", "Sam")
    printStrings("Kotlin", "Javascript", "Java", "C#", "Python")
}
*/
fun sum(vararg numbers: Int) {
    var result = 0
    for(n in numbers)
        result += n
    println("Сумма чисел равна $result")
}
/*
fun main(args:Array<String>) {

    sum(1,2,3,4,5,6,7)
    sum(5,8,9,6,1,0,8,3,6,4,7,99)
}*/

fun printUserGroup(group: String, vararg users: String, count:Int) {
    println("Group: $group")
    println("Count: $count")
    for(user in users)
        println(user)
}

fun main() {

    val users = arrayOf("Kate", "Tom", "Bill")
    printUserGroup("Kt-01", *users, count = 2)
}