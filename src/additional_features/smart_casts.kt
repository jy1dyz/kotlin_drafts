@file:Suppress("CAST_NEVER_SUCCEEDS")

package additional_features

fun main() {
    square(6)
    square2(8)

    val name : String  = "Tom"
    val id: Int? = name as? Int
    println(id)     // null
}

fun square(d:Any){
    //val t = d*d
    //недопустимая операция - d - не число,а  объект типа Any
    if(d is Int)
        println(d*d)
    else
        println("d is not an Int")
}
fun square2(v:Any){
    val t = v as Int // приводит к типу Int
    println(t*t)
}

