/** ----------------------------------------------------------------------
 *  Universidad Politecnica de San Luis Potosí
 *  Ingeniería en Tecnologías de Información
 *
 *  Materia: Teoría Computacional
 *  Profesor: Juan Carlos González Ibarra
 *  Nombre:    Aarón Mishael Carrizal Méndez
 *  Matricula: 180816
 *
 *  Escrito:       16/02/21
 *  Ultima actualización:  18/02/21
 *----------------------------------------------------------------------**/
//Kotlin program to check if a String contains valid characters ({a..z},{A..Z},{0..9})
fun checkWord(word: String?): Boolean {
    //Check if  word isn't null
    if (word != null) {
        //For each char in word
        for (c in word) {
            //Check if char isn't a letter nor an integer
            if (!c.isLetter() && c !in '0'..'9') {
                return false
            }
        }
    }
    return true
}

fun main(args: Array<String>) {
    println("Give me a word")
    val word = readLine()
    //calling checkWord function and display it
    print(checkWord(word))
}