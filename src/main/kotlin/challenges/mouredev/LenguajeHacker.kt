package challenges.mouredev

import java.text.Normalizer


/*
 * Reto #1: EL "LENGUAJE HACKER"
 * Escribe un programa que reciba un texto y transforme lenguaje natural a
 * "lenguaje hacker" (conocido realmente como "leet" o "1337"). Este lenguaje
 *  se caracteriza por sustituir caracteres alfanuméricos.
 * - Utiliza esta tabla (https://www.gamehouse.com/blog/leet-speak-cheat-sheet/)
 *   con el alfabeto y los números en "leet".
 *   (Usa la primera opción de cada transformación. Por ejemplo "4" para la "a")
 */

fun main(args: Array<String>) {
    val phrase = "Santiago Hernando Sachica Lancheros"
    lenguajeHacker(phrase)
    lenguajeHackerCorreccionCorta(phrase)
}

fun lenguajeHacker(phrase: String) {
    val lower_case = phrase.uppercase()
    val split_phrase = lower_case.split("")
    var leet_phrase = ""
    for (i in 0..phrase.length) {
        when {
            (split_phrase[i] == "A") -> leet_phrase = leet_phrase + "4"
            (split_phrase[i] == "B") -> leet_phrase = leet_phrase + "I3"
            (split_phrase[i] == "C") -> leet_phrase = leet_phrase + "["
            (split_phrase[i] == "D") -> leet_phrase = leet_phrase + ")"
            (split_phrase[i] == "E") -> leet_phrase = leet_phrase + "3"
            (split_phrase[i] == "F") -> leet_phrase = leet_phrase + "|="
            (split_phrase[i] == "G") -> leet_phrase = leet_phrase + "&"
            (split_phrase[i] == "H") -> leet_phrase = leet_phrase + "#"
            (split_phrase[i] == "I") -> leet_phrase = leet_phrase + "1"
            (split_phrase[i] == "J") -> leet_phrase = leet_phrase + ",_|"
            (split_phrase[i] == "K") -> leet_phrase = leet_phrase + ">|"
            (split_phrase[i] == "L") -> leet_phrase = leet_phrase + "1"
            (split_phrase[i] == "M") -> leet_phrase = leet_phrase + "/\\/\\"
            (split_phrase[i] == "N") -> leet_phrase = leet_phrase + "^/"
            (split_phrase[i] == "O") -> leet_phrase = leet_phrase + "0"
            (split_phrase[i] == "P") -> leet_phrase = leet_phrase + "|*"
            (split_phrase[i] == "Q") -> leet_phrase = leet_phrase + "(_,)"
            (split_phrase[i] == "R") -> leet_phrase = leet_phrase + "I2"
            (split_phrase[i] == "S") -> leet_phrase = leet_phrase + "5"
            (split_phrase[i] == "T") -> leet_phrase = leet_phrase + "7"
            (split_phrase[i] == "U") -> leet_phrase = leet_phrase + "(_)"
            (split_phrase[i] == "V") -> leet_phrase = leet_phrase + "\\/"
            (split_phrase[i] == "W") -> leet_phrase = leet_phrase + "\\/\\/"
            (split_phrase[i] == "X") -> leet_phrase = leet_phrase + "><"
            (split_phrase[i] == "Y") -> leet_phrase = leet_phrase + "j"
            (split_phrase[i] == "Z") -> leet_phrase = leet_phrase + "2"
            (split_phrase[i] == "0") -> leet_phrase = leet_phrase + "o"
            (split_phrase[i] == "1") -> leet_phrase = leet_phrase + "L"
            (split_phrase[i] == "2") -> leet_phrase = leet_phrase + "R"
            (split_phrase[i] == "3") -> leet_phrase = leet_phrase + "E"
            (split_phrase[i] == "4") -> leet_phrase = leet_phrase + "A"
            (split_phrase[i] == "5") -> leet_phrase = leet_phrase + "S"
            (split_phrase[i] == "6") -> leet_phrase = leet_phrase + "b"
            (split_phrase[i] == "7") -> leet_phrase = leet_phrase + "T"
            (split_phrase[i] == "8") -> leet_phrase = leet_phrase + "B"
            (split_phrase[i] == "9") -> leet_phrase = leet_phrase + "g"
            else -> leet_phrase = leet_phrase + split_phrase[i]
        }
    }
    println(leet_phrase)
}

fun lenguajeHackerCorreccionCorta(text: String) {
    val leet = mapOf(
        "A" to "4", "B" to "I3", "C" to "[", "D" to ")", "E" to "3", "F" to "|=",
        "G" to "&", "H" to "#", "I" to "1", "J" to ",_|", "K" to ">|", "L" to "1", "M" to "/\\/\\",
        "N" to "^/", "O" to "0", "P" to "|*", "Q" to "(_,)", "R" to "I2", "S" to "5", "T" to "7",
        "U" to "(_)", "V" to "\\/", "W" to "\\/\\/", "X" to "><", "Y" to "j", "Z" to "2",
        "1" to "L", "2" to "R", "3" to "E", "4" to "A", "5" to "S", "6" to "b", "7" to "T",
        "8" to "B", "9" to "g", "0" to "o"
    )

    var leetText = ""

    for (word in text) {
        val character = word.toString().uppercase()
        leetText += if (leet.containsKey(character)) {
            leet[character]
        } else {
            word.toString()
        }
    }
    println(leetText)
}