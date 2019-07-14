package oop

class Person {
    var name: String = "Tom"
    var age:Int = 18


    set(value) {
        if((value>0)&&(value<110))
            field = value
    }
    val info:String
        get() = "Name: $name Age: $age"
}

fun main(){
    val bob:Person = Person() // создание объекта
    println(bob.name) //Tom
    println(bob.age) //18

    bob.name = "Bob"
    bob.age = 25

    println(bob.name) // Bob
    println(bob.age) //25

    val personName :String = bob.name
    println(personName)
    println(bob.info)
    bob.age = -8
    println(bob.info)


}