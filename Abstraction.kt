abstract class Shape {
    abstract fun area(): Int
}

class Rectangle(
    private val length: Int,
    private val width: Int
) : Shape() {
    override fun area(): Int {
        return length * width
    }
}

fun main() {
    val rectangle = Rectangle(5, 4)

    println("Area of Rectangle: ${rectangle.area()}")
}
