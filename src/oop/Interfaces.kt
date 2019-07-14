package oop

interface Movable {
    fun move() //определение функции без реализации
    fun stop(){ // определение функции с реализацией по умолчанию
        println("Остановка")
    }
}

class Car : Movable {
    override fun move() {
        println("Машина едет")
    }
}

class Aircraft:Movable {
    override fun move() {
        println("Самолет летит")
    }

    override fun stop() {
        println("Приземление")
    }
}
/*
fun main() {
    val m1:Movable = Car()
    val m2:Movable = Aircraft()
    //val m3:Movable = Movable() напрямую объект интерфейса создать нельзя

    m1.move()
    m1.stop()
    m2.move()
    m2.stop()
}
*/
interface Info {
    val model: String
        get() = "Undefined"
    val number:String

}

class Auto(mod:String, num:String):Movable, Info {

    override val number: String = num
    override val model: String = mod

    override fun move() {
        println("Машина едет")
    }
}

fun main() {
    val n1 :Auto = Auto("Tesla", "2563211SD")
    println(n1.model)
    println(n1.number)

    n1.move()

}