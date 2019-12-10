fun main(args: Array<String>) {


    /**
     *
     * VAR and VAL
     *
     * var is creating a regular variable which can be changed
     * whereas val is a variable that cannot be changed once it is created.
     *
     */

    var i = 9
    var hello = "hello world "
    println("" + i + hello)


    /**
     *
     * OPERATOR
     *
     *
     *
     */


    /**
     *you can explicitly mention the data type too
     * you can add "$"
     */
    var s : Int = 4
    var j: Int = 5

    println("the addition of $s and $j are: " + (s+ j))


    /**
     * Creating a simple object out of class
     *
     * when you want to use an object use {$} but when are using a regular variable then just use dollar sign
     *
     */
    var makkhay = DummyClass();
    makkhay.name = "Prakash Gurung"

    println("my name is : ${makkhay.name}" )


    /**
     *
     * if else statement
     *
     *
     */

    var first : Int = 5
    var second: Int = 7


    if(first > second){
        println("first is greater")

    }else{
        println("first is smaller")
    }


    /**
     *
     * String comparision
     *
     * .equals(string, true)   // true means ignorecase
     *
     */


    var compareOne : String = "first"
    var compareTwo :  String = "first"


     if(compareOne.equals(compareTwo,true)){
         println("same")
     }else{
         println("Not same")
     }


    /**
     *
     * Null handling
     *
     * You cannot allow to put null value , but if want to use it then add "?" after like this String?
     *
     * For object use like this: makkhayNull.name?.length
     */


    var nullTest : String? = null


    /**
     *
     * When expression AKA Switch statement
     *
     * else is like the default statement
     *
     *
     *
     *
     *
     */


    var input: Int = 2


    when(input)
    {
        1 -> println("one")
        2 -> println("two")
        3 -> println("three")
        else -> {
            println("give a proper input")
            println("default")

        }

    }


    /**
     *  Loops and range
     *
     *
     *  while loop: you don't know the range, example; printing text from a file
     *
     *
     *
     *
     *  for loop : use this when you know the range, example; array, arraylist
     *
     *  use count() to count the numbers
     *
     *  use reversed() to reverse
     *
     *
     *
     */

    var num = 1..6

    // prints 1,3,5
    for(a in num step 2){
        println(a)
    }

    var reverse  = 6 downTo 1

    // prints reverse
    for( a in reverse){
        println(a)
    }

    var oneLess = 1 until 5

    // prints 1,2,3,4
    for(a in oneLess.reversed()){
        println(a)
    }

    println(oneLess.count())

    /**
     *
     * list and map
     *
     * list.get(0) will get the first item from the list
     *
     *
     *
     */


    var list  = listOf(1,2,3,4)

    // prints all element
    for ( i in list){
        println(i)
    }


    // prints index
    for((i, e) in list.withIndex()){
        println("the index is: $i and the element is: $e")
    }


    var map = HashMap<String, Int>()
    map["Prakash"] = 23
    map["rakesh"] = 21


    for((name, age) in map){
        println("name is: $name and the age is: $age")
    }

    /**
     *
     * Function expression
     *
     *
     *
     *
     */

    // will return the value of a + b
    // if you don't want to return then remove ": Int"
    fun add( a: Int, b : Int) : Int{

        return a + b
    }


    /**
     *  Constructor: In kotlin you don't have to name the same as Java
     *
     *
     *  class Test constructor( var n : String){
     *
     *   var name:  String = n
     *
     *   var age :  Int = 0
     *
     *   constructor(age : Int ,name: String) : this(name)
     *   {
     *     this.age = age
     *
     *   }
     *
     *   fun print(){
     *
     *    println("Kotlin is awesome $name")
     *
     *
     *  }
     *
     *
     *  fun main( args: Array<String>){
     *
     *     var makkhay = Test("Prakash")
     *
     *     // prints Kotlin is awesome Prakash
     *     makkhay.print(20,"Prakash)
     *
     *   Note: constructor keyword is not needed
     *
     *  }
     *
     *
     *
     *
     *
     *
     *
     *
     */


    /**
     *
     *  Inheritance
     *
     *  By default every class and method is final in kotlin so you need use "open" keyword
     *
     *
     *
     *
     *  open class Human
     *  {
     *
     *    open fun think()
     *    {
     *      println("real thinking")
     *    }
     *
     *
     *  }
     *
     *
     * class Test : Human()
     * {
     *
     *  overrride fun think()
     *  {
     *
     *   println("Virtual thinking")
     *
     *  }
     *
     *  }
     *
     *  fun main(args : Array<String>)
     *  {
     *
     *   var makhhay = Test()
     *   makkhay.think()
     *
     *  }
     *
     *
     *
     *
     *
     *
     */


    /**
     *
     * Object keyword
     *
     *
     *
     *
     *
     *
     */












}