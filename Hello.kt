// Import function to have the return function usable
import java.util.*

// Functions
fun feedTheFish()
{
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    // Calling the function shouldChangeWater()
    println("Changing Water: ${shouldChangeWater(day)}")
}

fun randomDay() : String
{
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

// Function with when expression

fun fishFood(day : String) : String
{
    // Empty var for now, can be changed to val if no need to be initialized
    val food : String
    when (day)
    {
        "Monday" -> food = "flakes"
        "Wednesday" -> food = "red worms"
        "Thursday" -> food = "granules"
        "Friday" -> food = "mosquitoes"
        "Sunday" -> food = "plankton"
        else -> food = "nothing"
    }

    return food
}

// Function with default values as parameters
fun swim(speed: String = "fast")
{
    println("Swimming $speed")
}

// Multiple parameter function
fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20): Boolean
{
    return when
    {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

// Compact/Single expression function
fun isTooHot(temperature: Int) = temperature > 30
fun isDirty(dirty: Int) = dirty > 30
fun isSunday(day: String) = day == "Sunday"

// Main function
fun main(args: Array<String>)
{
    // $ - specifies part of string that is a var or exp
    println("Hello, ${args[0]}") // String template - inserts variable or expression into a string

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    // Assign return value of println() to a var
    val isUnit = println("This is an expression.")
    println(isUnit)

    // Declare variable and initialize
    val temp = 51
    val isHot = if(temp < 50) true else false
    println(isHot)

    // Printing in an output message
    val message = "The temperature today is ${if (temp < 50) "slightly colder" else "surprisingly warm"}"
    println(message)

    // Call function feedTheFish
    feedTheFish()

    // Call function swim() with default value parameter
    swim() // Default value used
    swim("slow") // Positional argument
    swim(speed = "turtle like") // Named Parameter
}