package challenges.mouredev

/*
 * Reto #2: EL PARTIDO DE TENIS
 * Escribe un programa que muestre cómo transcurre un juego de tenis y quién lo ha ganado.
 * El programa recibirá una secuencia formada por "P1" (Player 1) o "P2" (Player 2), según quien
 * gane cada punto del juego.
 *
 * - Las puntuaciones de un juego son "Love" (cero), 15, 30, 40, "Deuce" (empate), ventaja.
 * - Ante la secuencia [P1, P1, P2, P2, P1, P2, P1, P1], el programa mostraría lo siguiente:
 *   15 - Love
 *   30 - Love
 *   30 - 15
 *   30 - 30
 *   40 - 30
 *   Deuce
 *   Ventaja P1
 *   Ha ganado el P1
 * - Si quieres, puedes controlar errores en la entrada de datos.
 * - Consulta las reglas del juego si tienes dudas sobre el sistema de puntos.
 */

fun main(args: Array<String>) {
    val secuence = listOf("P1", "P1", "P2", "P2", "P1", "P2", "P1", "P1")
    partidoDeTenis(secuence)
}

fun partidoDeTenis(secuence: List<String>) {
    var cont_player_one_score = 0
    var cont_player_two_score = 0
    var result_player_one = ""
    var result_player_two = ""

    for (i in secuence.indices) {
        if (secuence[i].equals("P1")) {
            cont_player_one_score += 1
        }
        if (secuence[i].equals("P2")) {
            cont_player_two_score += 1
        }

        when {
            (cont_player_one_score == 0) -> result_player_one = "Love"
            (cont_player_one_score == 1) -> result_player_one = "15"
            (cont_player_one_score == 2) -> result_player_one = "30"
            (cont_player_one_score == 3) -> result_player_one = "40"
            (cont_player_one_score == 4) -> result_player_one = "Ventaja" + secuence[i]
        }

        when{
            (cont_player_two_score == 0) -> result_player_two = "Love"
            (cont_player_two_score == 1) -> result_player_two = "15"
            (cont_player_two_score == 2) -> result_player_two = "30"
            (cont_player_two_score == 3) -> result_player_two = "40"
            (cont_player_two_score == 4) -> result_player_two = "Ventaja" + secuence[i]
        }

        if (cont_player_one_score == 4 || cont_player_two_score == 4) {
            println("Ventaja " + secuence[i])
            println("Ha ganado " + secuence[i])
            break
        }else{
            if (cont_player_one_score != cont_player_two_score) {
                println("$result_player_one - $result_player_two")
            } else {
                if (cont_player_one_score == cont_player_two_score) {
                    println("Deuce")
                }
            }
        }
    }
}