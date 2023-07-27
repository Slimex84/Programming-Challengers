package challenges.mouredev

/*
 * Reto #4: PRIMO, FIBONACCI Y PAR
 * Escribe un programa que, dado un número, compruebe y muestre si es primo, fibonacci y par.
 * Ejemplos:
 * - Con el número 2, nos dirá: "2 es primo, fibonacci y es par"
 * - Con el número 7, nos dirá: "7 es primo, no es fibonacci y es impar"
 */

fun main(args: Array<String>) {
    primoFibonacciPar()
}

fun primoFibonacciPar() {
    print("Ingresa un número para comprobar si este es primo, fibonacci y par: ")
    var number = readlnOrNull()?.toInt() as Int
    var result = ""

    //Primo o no
    var cont = 0
    for (i in 1..number) {
        if (number % i == 0) {
            cont += 1
        }
    }

    result = if (cont == 2) {
        "$number es primo, "
    } else {
        "$number no es primo, "
    }

    //Fibonacci o no
    var numberSupportOne = 0
    var numberSupportTwo = 1
    var numberSupportThree = 0
    var resultFibonacci = "no es fibonacci "
    for (i in 0..number) {
        numberSupportThree = numberSupportOne + numberSupportTwo
        numberSupportTwo = numberSupportOne
        numberSupportOne = numberSupportThree
        if (numberSupportThree == number) {
            resultFibonacci = "fibonacci "
            break
        }
    }
    result += resultFibonacci

    //Par o impar
    result += if (number % 2 == 0) "y es par" else "y es impar"

    println(result)
}