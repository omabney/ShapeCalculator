class Shape{

    var area: Double? = null
    var perimeter: Double? = null

    //function for calculating area of a triangle
    fun areaOfTriangle(height:Double, breadth:Double ){
        if ((height <= 0) || (breadth <= 0) ){
            println("Invalid inputs.Height and Base must be greater than 0...")
        }else{
            area = 0.5*height*breadth
        }
    }

    //function for calculating perimeter of a triangle
    fun perimeterOfTriangle(sides:List<Double>){
        var per: Double = 0.0
        var flag = 1
        sides.forEach{
                side -> if(side <= 0){
            flag = 0
        }else per += side
        }
        if(flag == 1) perimeter = per else println("Invalid inputs.Sides of a triangle must be greater than 0...")
    }

    //function for calculating area of a square
    fun areaOfSquare(length:Double){
        if ((length <= 0) ){
            println("Invalid input.Length must be greater than 0...")
        }else{
            area = length*length
        }
    }

    //function for calculating perimeter of a square
    fun perimeterOfSquare(length:Double){
        if ((length <= 0) ){
            println("Invalid input.Length must be greater than 0...")
        }else{
            perimeter = 4*length
        }
    }

    //function for calculating area of a Circle
    fun areaOfCircle(radius:Double){
        if ((radius <= 0) ){
            println("Invalid input.Radius must be greater than 0...")
        }else{
            area = Math.PI*radius*radius
        }
    }

    //function for calculating perimeter of a circle
    fun perimeterOfCircle(radius:Double){
        if ((radius <= 0) ){
            println("Invalid input.Radius must be greater than 0...")
        }else{
            perimeter = 2*Math.PI*radius
        }
    }

    //function for calculating area of a Rectangle
    fun areaOfRectangle(length:Double, breadth:Double ){
        if ((length <= 0) || (breadth <= 0) ){
            println("Invalid inputs.length and breadth must be greater than 0...")
        }else{
            area = length * breadth
        }
    }

    //function for calculating perimeter of a Rectangle
    fun perimeterOfRectangle(length:Double, breadth:Double){
        if ((length <= 0) || (breadth <= 0) ){
            println("Invalid inputs.length and breadth must be greater than 0...")
        }else{
            perimeter = 2*(length + breadth)
        }
    }

    //function for calculating area of a Parallelogram
    fun areaOfParallelogram(base:Double, height:Double ){
        if ((base <= 0) || (height <= 0) ){
            println("Invalid inputs.Base and height must be greater than 0...")
        }else{
            area = base * height
        }
    }

    //function for calculating perimeter of a Parallelogram
    fun perimeterOfParallelogram(side1:Double, base:Double){
        if ((side1 <= 0) || (base <= 0) ){
            println("Invalid inputs.Every sides must be greater than 0...")
        }else{
            perimeter = 2*(side1 + base)
        }
    }
}