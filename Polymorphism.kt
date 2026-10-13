open class Animal {
    open fun sound() {
        println("Animal makes a sound")
    }
}

class Dog : Animal() {
    override fun sound() {
        println("Dog barks")
    }
}

class Cat : Animal() {
    override fun sound() {
        println("Cat meows")
    }
}

fun main() {
    val animals: Array<Animal> = arrayOf(Dog(), Cat())

    for (animal in animals) {
        animal.sound()
    }
}
