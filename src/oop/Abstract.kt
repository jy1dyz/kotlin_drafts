package oop

abstract class Body(val name: String) {
    abstract fun hello()

}
class Humans(name: String):Body(name) {
    override fun hello() {
        println("My name is $name")
    }
}

fun main() {
    val kate = Humans("Kate")
    val slim:Body = Humans("Slim  Shady")

    kate.hello()
    slim.hello()
}
/**
 * Зачем нужны абстрактные классы?
 * Классы обычно отражают какие-то сущности
 * реального мира. Но некоторые из этих сущностей
 * представляют абстракцию, которая непосредственного
 * воплощения не имеет. Например, возьмем систему
 * геометрических фигур. В реальности не существует
 * геометрической фигуры как таковой. Есть круг,
 * прямоугольник, квадрат, но просто фигуры нет.
 * Однако же и круг, и прямоугольник имеют что-то общее и
 * являются фигурами. В этом случае мы можем определить
 * абстрактный класс фигуры и затем от него унаследовать
 * все остальные классы фигур:
 */

