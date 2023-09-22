fun main(args: Array<String>) {
    println("What is your name?")

    val name = readln()
    println("Hello, $name")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    //Prints on the screen and Prompts
    //the user to enter a number
    print("Enter a number: ")

    //reads line from standard input - keyboard
    //and !! operator ensures the input is not null
    val stringInput = readLine()!!

    //converts the string input to integer
    val integer:Int = stringInput.toInt()

    //print() prints the following Line to the output screen
    println("You entered: $integer")

    val first: Int = 10
    val second: Int = 20

    val sum =  first + second

    println("The sum is: $sum")

    val ch = 'i'

    val vowelConsonant = if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') "vowel" else "consonant"

    println("$ch is $vowelConsonant")

    val th = 'z'
    when(th){
        'a', 'e', 'i', 'o', 'u' -> println("$th is a vowel")
        else -> println("$th is a consonant")}

    val year = 1900
    var leap = false

    if(year % 4 == 0)
    {
        if (year % 100 == 0)
        {
            leap = year % 400 == 0
        }
        else
        {
            leap = true
        }
    }
    else
    {
        leap = true
    }

    println(if(leap) "$year is a leap year." else "$year is not a leap year.")
}


