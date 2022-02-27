fun main() {    
    val myFirstDice = Dice(4, "orange")
    val rollResult = myFirstDice.roll()
    val luckyNumber = 4
    
    when (rollResult) {
        luckyNumber -> println("You win!")
        1 -> println("So sorry! You rolled a 1. Try again!")
        2 -> println("Sadly, you rolled a 2. Try again!")
        3 -> println("Unfortunately, you rolled a 3. Try again!")
        5 -> println("Don't cry! You rolled a 5. Try again!")
        6 -> println("Apologies! You rolled a 6. Try again!")
        else -> println("You lost. Try again!")
    }
}

class Dice(val numSides: Int, val color: String) {
    fun roll(): Int {
    	return (1..numSides).random()
    }
}