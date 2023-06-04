fun main(args: Array<String>) {
    //Object
    var newObject = Object()
    //Message
    val first = Message("Илья")
    println(first.introduce())
    //OOP
    var cat :Cat = Cat("catFood", "catLocation")
    var dog: Dog = Dog("dogFood", "dogLocation")
    var horse:Horse = Horse("horseFood", "horseLocation")
    var animals: MutableList<Animal> = mutableListOf(cat,dog,horse)
    for (i in 0..2)
    {
        var veterinarian =Veterinarian()
        veterinarian.treatAnimal(animals[i])
    }
}


class Object {
    init {
        println("Класс Object был создан!")
    }
}
class Message(val username: String) {
    fun introduce() = "Привет, меня зовут $username"
}
abstract class Animal {
    abstract var food:String
    abstract var location:String
    abstract fun makeNoise ()
    abstract fun eat ()
    abstract fun sleep ()
}
class Horse(override var food: String, override var location: String) : Animal() {
    final var speed:Int = 40;
    override fun makeNoise() {
    }
    override fun eat() {
    }
    override fun sleep() {
    }
}
class Dog (override var food: String, override var location: String) : Animal(){
    final var breed: String = "Pug";
    override fun makeNoise() {
    }
    override fun eat() {
    }
    override fun sleep() {
    }
}
class Cat (override var food: String, override var location: String) : Animal(){
    final var cuteLevel:Int = 99;
    override fun makeNoise() {
    }
    override fun eat() {
    }
    override fun sleep() {
    }
}
class Veterinarian() {
    fun treatAnimal(animal: Animal){
        println(animal.food + " " + animal.location)
    }
}
