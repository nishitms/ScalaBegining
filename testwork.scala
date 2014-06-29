import scala.swing._

abstract class calculations{
					def calculate() : Double
}

class addition (a :Double , b: Double)  extends calculations{
				  def calculate() : Double = ( a + b)
}
class substraction (a :Double , b: Double)  extends calculations{
				  def calculate() : Double = if (a>b) a-b else b-a
}
class multiplication (a :Double , b: Double)  extends calculations{
				  def calculate() : Double = a * b
}
class division (a :Double , b: Double)  extends calculations{
				  def calculate() : Double = a/b
}
class mod (a :Double , b: Double)  extends calculations{
				  def calculate() : Double = a%b
}
class abs (a :Double)  extends calculations{
				  def calculate() : Double = if (a>0) a else -a
}


object testwork extends App {
 
  val frame = new MainFrame{
    title = "My GUI"
    size = new Dimension(800,800)
  }
  frame.visible =false;
  
  println("Welcome to the Scala worksheet")    //> Welcome to the Scala worksheet
  /*  class iterate[X] (body : => X){
    def until( condition : X => Boolean ) : X = {
      val wish = body
      if (condition(wish)) wish else until(condition)
    }
  }
  object iterate{
    def run[X] (body : => X) = new iterate(body)
  }*/
 // var ans = 'Y'
 // do{
  
    
  println("*********************************************")                                            
  println("				 Main Menu						")					
  println("1. Basic Mathematical Operations ")   //>1. Basic Mathematical Operations 
  println("2. Testing Inheritence ")            //> 2. Testing Inheritence 
  println("3. Data Structures ")                //> 3. Data Structures 
  println("4. File Handling ")                  //> 4. File Handling 
  println("*********************************************")
  println("Enter your choice ")
  val choice = readInt
  val a: Int = 0
  //println(choice)								//Test
  choice match {
    case 1 => 	def add (a : Double , b : Double) : Double = a + b  //>add: (a: Double, b: Double)Double
    			def sub (a : Double , b : Double) : Double = if (a>b) a-b else b-a //> sub: (a: Double, b: Double)Double
    			def mul (a: Double)(b: Double) : Double = a * b //> mul: (a: Double)(b: Double)Double
    			def div (a: Double)(b: Double) : Double = a / b //> div: (a: Double)(b: Double)Double
    			def mod (a: Double)(b: Double) : Double = a % b //> mod: (a: Double)(b: Double)Double
    			def abs (a: Double): Double = if (a>0) a else -a//> abs: (a: Double)Double
    			println("Basic Math")
    		  	println("Enter First Number")
    		  	val num1 : Double = readDouble
    		  	println("Enter Second Number")
    		  	val num2 : Double = readDouble
    		  	println("-------Operations------")
    		  	println("1. Addition ")
    		  	println("2. Substraction ")
    		  	println("3. Multiplication ")
    		  	println("4. Division")
    		  	println("5. Modulous ")
    		  	println("6. Absolute ")
    		  	println("-----------------------")
    		  	println("Enter the operation")
    		  	val operation = readInt
    		  	operation match {
    			  case 1 => println ("Num1 + Num2 ="+ add (num1 , num2))
    			  case 2 => println ("Num1 - Num2 ="+ sub (num1 , num2))
    			  case 3 => println ("Num1 * Num2 ="+ mul (num1)(num2))
    			  case 4 => println ("Num1 / Num2 ="+ div (num1)(num2))
    			  case 5 => println ("Num1 % Num2 ="+ mod (num1)(num2))
    			  case 6 => println ("| Num1 | ="+ abs (num1) +"| Num2 | =" + abs (num2))
    			  case _ => println("Wrong Choice")
    		  	}
    case 2 => println("Inheritence")
    
    			println("Enter First Number")
    		  	val num1 : Double = readDouble
    		  	println("Enter Second Number")
    		  	val num2 : Double = readDouble
    		  	
    			println("-------Operations------")
    		  	println("1. Addition ")
    		  	println("2. Substraction ")
    		  	println("3. Multiplication ")
    		  	println("4. Division")
    		  	println("5. Modulous ")
    		  	println("6. Absolute ")
    		  	println("-----------------------")
    		  	println("Enter the operation")
    		  	val operation = readInt
    		  	operation match {
    			  case 1 => val a = new addition(num1,num2)
    			    		println ("Num1 + Num2 ="+ a.calculate())		  
    			  case 2 => val a = new substraction(num1,num2)
    			    		println ("Num1 - Num2 ="+ a.calculate())
    			  case 3 => val a = new multiplication(num1,num2)
    			    		println ("Num1 * Num2 ="+ a.calculate())
    			  case 4 => val a = new division(num1,num2)
    			    		println ("Num1 / Num2 ="+ a.calculate())
    			  case 5 => val a = new mod(num1,num2)
    			    		println ("Num1 % Num2 ="+ a.calculate())
    			  case 6 => val a = new abs(num1)
    			  			val b=  new abs(num2) 
    			    		println ("| Num1 | ="+ a.calculate() +"| Num2 | =" + b.calculate())
    			  case _ => println("Wrong Choice")
    		  	}
    case 3 => println("Data Structures")
    case 4 => println("File Handling")
    case _ => println("Wrong Choice")
    println("Do you wish to continue (y/n) ?")
   // a= readInt
   
                                
                                 
}            
  
}

