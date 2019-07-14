package oop

enum class Day(val value: Int) {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(100500);

    /*fun getDuration(day:Day):Int {
        return value - day.value
    } */
}

fun main() {
    val day1: Day = Day.FRIDAY
    val day2: Day = Day.MONDAY

    /*println(Day.MONDAY.value)
    println(day1.getDuration(day2)) */
    println(day1.name)
    println(day1.ordinal)
    println(day2.ordinal)
    println(day2.name)

    for(day in Day.values())
        println(day)

    println(Day.valueOf("FRIDAY"))

    DayTime.DAY.printName()
    DayTime.NIGHT.printName()
}

interface Printable {
    fun printName()
}
enum class DayTime: Printable {
    DAY {
        override fun printName() {
            println("День")
        }
    },
    NIGHT{
        override fun printName() {
            println("Ночь")
        }
    }
}