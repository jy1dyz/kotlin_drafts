package oop



open class Human(val name: String) {

    open val fullInfo:String
    get() = "Name: $name"


    open fun display() {
        println("Name: $name")
    }
}
open class Employee(name: String, val company : String) : Human(name) {

    override val fullInfo: String
        get() = "${super.fullInfo}  Company: $company"

    override fun display() {
        println("Name:$name  Company:$company")
    }

}

class Manager(name:String, company: String):Employee(name, company) {
    override fun display() {
         println("Name: $name Company: $company Position: Manager")
     }
}


fun main() {
    val anna = Human("Anna")
    val kate = Employee("Kate", "Google")
    val liza:Human = Employee("liza", "Tesla")
    val will = Manager("Will", "Apple")
    val john = Human("John")
    val robert = Manager("Robert", "Microsoft")


    anna.display()
    kate.display()
    liza.display()
    will.display()
    john.display()
    robert.display()

}

open class Video{
    open fun play() {
        println("Play video")
    }
}

interface AudioPlayable {
    fun play() {
        println("Play Audio")
    }
}

class MediaPlayer():Video(), AudioPlayable {
    override fun play() { //Функцию play обязательно надо переопределить
        super<Video>.play() //вызываем Video.play()
        super<AudioPlayable>.play() //вызываем AudioPlayable.play()
    }
}