package additional_features

var name :String? = "Tom"
val firstName: String = name ?: "Undefined" // если name = null , то присваивается "Undefined"

var age :Int? = 23
val myAge: Int = age ?: 0 // если age = null, то присваивается число 0

/**
 * Оператор ?: принимает два операнда. Если первый не равен null ,то
 * возвращается значение первого операнда.
 * Если первый операнд = null , то
 * возвращается значение второго операнда.
 *
 * идентично записи внизу
 */
/*var name :String? = "Tom"
val firstName :String
if (name!=null) {
    firstName = name
} */

val length:Int? = name?.length ?: 0
fun main() {
    println(length)
}


