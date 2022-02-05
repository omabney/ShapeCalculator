import java.util.Scanner

//Main function,Entry point of the application
fun main() {

    //input Stream
    val scanner = Scanner(System.`in`)
    var choice: Int = -1
    var height : Double
    var length : Double
    var breadth : Double
    var radius : Double
    var base : Double
    var side1 : Double
    var side2 : Double

    do {
        println("\n************ Shape Calculator ************")
        println("\n1. Triangle")
        println("2. Square")
        println("3. Circle")
        println("4. Rectangle")
        println("5. Parallelogram")
        println("6. Exit")
        println("\nPlease Select your choice")
        choice = scanner.nextInt()

        when (choice) {
            1 ->{
                println("\n**********Triangle**********")
                println("Enter the height: ")
                height = scanner.nextDouble()
                println("Enter the base")
                base = scanner.nextDouble()
                println("Enter the length of side 1")
                side1 = scanner.nextDouble()
                println("Enter the length of side 2")
                side2 = scanner.nextDouble()
                val triangleShape = Shape()
                triangleShape.areaOfTriangle(height, base)                      //Calling function to calculate area
                triangleShape.perimeterOfTriangle(listOf(side1, side2, base))   // Passing the sides of a triangle as a collection to find the perimeter

                println("\n******Output******")
                val areaToPrint = triangleShape.area ?: "**Computational Error**"  // Using Elvis operator to check area has valid value
                val perimeterToPrint = triangleShape.perimeter?: "**Computational Error**" // Using Elvis operator to check perimeter has valid value
                println("Area = $areaToPrint")
                println("Perimeter = $perimeterToPrint")

            }
            2 ->{
                println("\n**********Square**********")
                println("Enter the length: ")
                length = scanner.nextDouble()
                val squareShape =Shape()
                squareShape.areaOfSquare(length)        //Calling function to calculate area
                squareShape.perimeterOfSquare(length)   //Calling function to calculate perimeter

                println("\n******Output******")
                val areaToPrint = squareShape.area ?: "**Computational Error**"  // Using Elvis operator to check area has valid value
                val perimeterToPrint = squareShape.perimeter?: "**Computational Error**" // Using Elvis operator to check perimeter has valid value
                println("Area = $areaToPrint")
                println("Perimeter = $perimeterToPrint")
            }
            3 ->{
                println("\n**********Circle**********")
                println("Enter the radius: ")
                radius = scanner.nextDouble()
                val circleShape =Shape()
                circleShape.areaOfCircle(radius)        //Calling function to calculate area
                circleShape.perimeterOfCircle(radius)   //Calling function to calculate perimeter

                println("\n******Output******")
                val areaToPrint = circleShape.area ?: "**Computational Error**"  // Using Elvis operator to check area has valid value
                val perimeterToPrint = circleShape.perimeter?: "**Computational Error**" // Using Elvis operator to check perimeter has valid value
                println("Area = $areaToPrint")
                println("Perimeter = $perimeterToPrint")
            }
            4 ->{
                println("\n**********Rectangle**********")
                println("Enter the length: ")
                length = scanner.nextDouble()
                println("Enter the breadth: ")
                breadth = scanner.nextDouble()
                val rectangleShape =Shape()
                rectangleShape.areaOfRectangle(length, breadth)        //Calling function to calculate area
                rectangleShape.perimeterOfRectangle(length, breadth)   //Calling function to calculate perimeter

                println("\n******Output******")
                val areaToPrint = rectangleShape.area ?: "**Computational Error**"  // Using Elvis operator to check area has valid value
                val perimeterToPrint = rectangleShape.perimeter?: "**Computational Error**" // Using Elvis operator to check perimeter has valid value
                println("Area = $areaToPrint")
                println("Perimeter = $perimeterToPrint")
            }
            5 ->{
                println("\n**********Parallelogram**********")
                println("Enter the side 1: ")
                side1 = scanner.nextDouble()
                println("Enter the base: ")
                base = scanner.nextDouble()
                println("Enter the height: ")
                height = scanner.nextDouble()
                val parallelogramShape =Shape()
                parallelogramShape.areaOfParallelogram(base, height)        //Calling function to calculate area
                parallelogramShape.perimeterOfParallelogram(side1, base)   //Calling function to calculate perimeter

                println("\n******Output******")
                val areaToPrint = parallelogramShape.area ?: "**Computational Error**"  // Using Elvis operator to check area has valid value
                val perimeterToPrint = parallelogramShape.perimeter?: "**Computational Error**" // Using Elvis operator to check perimeter has valid value
                println("Area = $areaToPrint")
                println("Perimeter = $perimeterToPrint")
            }
            6 -> println("******Thanks for using Shape calculator******") // Exiting from the application

            else -> println("Invalid option...Please select the correct option") // When user enter an invalid option this statement will print
        }
    }while(choice != 6)

}