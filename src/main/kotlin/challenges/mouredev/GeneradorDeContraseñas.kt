package challenges.mouredev

/*
 * Reto #3: EL GENERADOR DE CONTRASEÑAS
 * Escribe un programa que sea capaz de generar contraseñas de forma aleatoria.
 * Podrás configurar generar contraseñas con los siguientes parámetros:
 * - Longitud: Entre 8 y 16.
 * - Con o sin letras mayúsculas.
 * - Con o sin números.
 * - Con o sin símbolos.
 * (Pudiendo combinar todos estos parámetros entre ellos)
 */

fun main(args: Array<String>) {
    generadorDeContraseñas()
}

fun generadorDeContraseñas() {
    println("GENEREADOR DE CONTRASEÑAS \nDigita la longitud de la contraseña, esta tiene que ser entre 8 y 16 caracteres: ")
    var char_long = readlnOrNull()?.toInt() as Int
    while (char_long < 8 || char_long > 16) {
        println("Rango inválido, ingresa un número entre 8 y 16")
        char_long = readlnOrNull()?.toInt() as Int
    }
    println("Digita s si quieres que incluya letras en mayúsculas, digita n si no quieres que incluya letras en mayúsculas: ")
    val capital_letters = readlnOrNull()
    println("Digita s si quieres que incluya números, digita n si no quieres que incluya números: ")
    val num_option = readlnOrNull()
    println("Digita s si quieres que incluya símbolos, digita n si no quieres que incluya símbolos: ")
    val symbol_option = readlnOrNull()

    val random_char = ('a'..'z')
    val random_capital_char = ('a'..'z') + ('A'..'Z')
    val random_number = ('0'..'9')
    val random_symbol = listOf(
        '!',
        '@',
        '#',
        '$',
        '%',
        '^',
        '&',
        '*',
        '(',
        ')',
        '-',
        '_',
        '+',
        '=',
        '{',
        '}',
        '?'
    )
    var cont = 0
    var password = ""

    for (i in 1..char_long) {
        if (capital_letters == "n") {
            password += random_char.random().toString()
        }
        if (symbol_option == "s") {
            if (cont == char_long) break
            password += random_symbol.random().toString()
            cont += 1
        }
        if (num_option == "s") {
            if (cont == char_long) break
            password += random_number.random().toString()
            cont += 1
        }
        if (capital_letters == "s") {
            if (cont == char_long) break
            password += random_capital_char.random().toString()
            cont += 1
        }
    }
    println(password)
}