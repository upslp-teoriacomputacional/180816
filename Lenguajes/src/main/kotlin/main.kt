/** ----------------------------------------------------------------------
 *  Universidad Politécnica de San Luis Potosí
 *  Ingeniería en Tecnologías de Información
 *
 *  Materia: Teoría Computacional
 *  Profesor: Juan Carlos González Ibarra
 *  Nombre:    Aarón Mishael Carrizal Méndez
 *  Matrícula: 180816
 *
 *  Escrito:       24/02/21
 *  Última actualización:  26/02/21
 *----------------------------------------------------------------------**/
//String operations

//To capitalize each word of a String where each word is preceded by a blank space
fun String.capitalizeWords(): String = split(" ").map { it.toLowerCase().capitalize() }.joinToString(" ")

fun main(args: Array<String>) {

    //You cannot use single quotes for String variables in Kotlin
    val doubleQuotes = "Kotlin in double quotes"
    println(doubleQuotes)

    var message = "Hello, Kotlin!"
    println(message[7]) //K

    /*
    text =              K O T L I N
    positive index =    0 1 2 3 4 5
    negative index =    5 4 3 2 1 0
     */
    val text = "KOTLIN"
    println(text[3])    //L
    println(text.reversed()[4]) //O
    message = "Hello, Kotlin"
    println(message.substring(7..10))   //Kotl

    message = "    Welcome Kotlin.  "
    println(message.trim()) //Welcome Kotlin.

    message ="Welcome Kotlin!"
    println(message.toLowerCase())  //welcome kotlin!

    message ="Kotlin tutorial with dotnettechpoint.com"
    println(message.toUpperCase())  //KOTLIN TUTORIAL WITH DOTNETTECHPOINT.COM

    message ="Welcome Kotlin!"
    println(message.length) //15

    message ="Kotlin with dotnettechpoint.com"
    println(message.replace("Kotlin","Learn Kotlin"))    //Learn Kotlin with dotnettechpoint.com

    message ="Kotlin, tutorials, with, dotnettechpoint.com"
    println(message.split(",")) //[Kotlin,  tutorials,  with,  dotnettechpoint.com]

    message ="kotlin tutorials with dotnettechpoint.com"
    println(message.capitalizeWords())   //Kotlin Tutorials With Dotnettechpoint.com

    println(message.capitalize())   //Kotlin tutorials with dotnettechpoint.com

    println(message.count{ "t".contains(it) })  //8

    println(message.indexOf("with"))    //17

    var first_string = "Kotlin"
    var last_string = "Tutorial"
    println("$first_string $last_string")   //Kotlin Tutorial

    var middle_string = 3
    println("$first_string $middle_string $last_string")  //Kotlin 3 Tutorial

    println(first_string+" "+middle_string.toString()+" "+last_string)  //Kotlin 3 Tutorial

}

