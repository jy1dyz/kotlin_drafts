package oop

//абстрактный класс фигуры
abstract class Figure {
    // абстрактный метод для получения периметра
    abstract fun perimeter():Float

    //абстрактный метод для получения площади
    abstract fun area():Float

}
//производный класс прямоугольник
class Rectangle(val width: Float, val height: Float):Figure() {

    override fun area(): Float {
        return width*height

    }

    override fun perimeter(): Float {
        return width*2 + height*2
    }
}

fun main() {
    val a:Figure = Rectangle(5.5f, 2.0f)

    println(a.area())
    println(a.perimeter())
}