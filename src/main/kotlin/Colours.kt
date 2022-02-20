
class Colours {

    private val colours = listOf("Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet", "Black", "Silver")

    fun getAll (): List<String>{
        //TODO return the colours list
        return colours // returns the list of colours
    }

    fun numberOfColours (): Int{
        //TODO return the size of the colours list
        return  colours.size //returns size of colours list
    }

    fun firstColour() : String{
        //TODO return the first colour in the list
        return colours[0] // returns the value at position 0 (1st) in list

    }

    fun lastColour() : String{
        //TODO return the last colour list
        return colours.last() // returns last value in the colours list

    }

    fun coloursInAplhabeticOrder() : List<String>{
        //TODO return the colours in alphabetical order
        return colours.sorted() //sorted sorts the list colours in alphabetical order
    }

    fun coloursInAllCapitals() : List<String>{
        //TODO return the colours in ALL CAPS
        return colours.map {it.uppercase()}//returns all the values in a function in all uppercase letters

    }

    fun coloursStartingWithLetter(letter: Char) : List<String>{
        //TODO return the colours starting with the letter passed as a parameter
        return colours.filter {it.startsWith(letter)}//checks the first letter of all the lists and outputs the one that start with the given parameters
    //listOf("this should return colours that start with ${letter}")
    }

    fun coloursWithSpecificNumberOfChars(size: Int) : List<String>{
        //TODO return the colours that have exactly the same number of chars as the number passed as a parameter
        return colours.filter { it.length==size}//retuens the colours list with the number of chars with the given parameters
        //listOf("this should return colours that have ${size} chars")
    }

    fun coloursWithLessCharsThan(size: Int) : List<String>{
        //TODO return the colours that have less chars than the number passed as s parameter
        return colours.filter { it.length<size}//retuens the colours list with less than number of chars with the given parameters
    //listOf("this should return colours less than ${size} chars")
    }

    fun isColourInTheList(colour : String) : Boolean{
        //TODO return true of the colour passed as a parameter is in the list and false otherwise
        // Note: the search should be case insensitive - if blue is passed as a parameter it should find Blue, BLUE etc.
        colours.filter {it.contains(colour)}
        return true

    }

    //TODO Write THREE additional functions of your choice that will perform some sort of
    // analysis on the colours list.
    fun randomColour(): String{
        return colours.random()//picks a random colour in the list and outputs it
    }

    fun coloursRevered(): String{
        return colours.reversed().toString()//reverses the order of the colours list
    }

    fun coloursListRandom(): String{
        return colours.shuffled().toString()//outputs the colours list in random order
    }
  //  fun coloursListOf() {
    //    listOf.size(colours)
  // }
}