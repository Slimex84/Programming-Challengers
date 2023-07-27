package challenges.mouredev

/*
 * Reto #6: Piedra, Papel, Tijera, Lagarto, Spock
 * Crea un programa que calcule quien gana más partidas al piedra,
 * papel, tijera, lagarto, spock.
 * - El resultado puede ser: "Player 1", "Player 2", "Tie" (empate)
 * - La función recibe un listado que contiene pares, representando cada jugada.
 * - El par puede contener combinaciones de "🗿" (piedra), "📄" (papel),
 *   "✂️" (tijera), "🦎" (lagarto) o "🖖" (spock).
 * - Ejemplo. Entrada: [("🗿","✂️"), ("✂️","🗿"), ("📄","✂️")]. Resultado: "Player 2".
 * - Debes buscar información sobre cómo se juega con estas 5 posibilidades.
 */

fun main(args: Array<String>) {
    var game = listOf("🗿", "✂️", "✂️", "🗿", "📄", "✂️")
    piedraPapelTijeraLagartoSpock(game)
    game = listOf("📄", "🦎", "✂️", "📄", "🦎", "🖖")
    piedraPapelTijeraLagartoSpock(game)
    game = listOf("📄", "🦎", "✂️", "📄", "🦎", "🖖", "✂️", "🗿")
    piedraPapelTijeraLagartoSpock(game)
    game = listOf("🖖", "🗿", "✂️", "📄", "🗿", "🗿", "🦎", "🖖")
    piedraPapelTijeraLagartoSpock(game)
    game = listOf("🗿", "🖖", "🗿", "🗿", "🦎", "🖖", "📄", "✂️", "📄", "🦎")
    piedraPapelTijeraLagartoSpock(game)
}

fun piedraPapelTijeraLagartoSpock(game: List<String>) {
    var contPlayer1 = 0
    var contPlayer2 = 0
    var choiseP1 = ""
    var choiseP2 = ""

    for (i in 1..game.size step (2)) {
        choiseP1 = game.get(i - 1)
        choiseP2 = game.get(i)
        when {
            (choiseP1 == "🗿" && choiseP2 == "✂️" || choiseP1 == "✂️" && choiseP2 == "📄"
                    || (choiseP1 == "📄" && choiseP2 == "🗿") || (choiseP1 == "🗿" && choiseP2 == "🦎")
                    || (choiseP1 == "🦎" && choiseP2 == "🖖") || (choiseP1 == "🖖" && choiseP2 == "✂️")
                    || (choiseP1 == "✂️" && choiseP2 == "🦎") || (choiseP1 == "🦎" && choiseP2 == "📄")
                    || (choiseP1 == "📄" && choiseP2 == "🖖") || (choiseP1 == "🖖" && choiseP2 == "🗿")) -> contPlayer1 += 1

            (choiseP2 == "🗿" && choiseP1 == "✂️" || choiseP2 == "✂️" && choiseP1 == "📄"
                    || (choiseP2 == "📄" && choiseP1 == "🗿") || (choiseP2 == "🗿" && choiseP1 == "🦎")
                    || (choiseP2 == "🦎" && choiseP1 == "🖖") || (choiseP2 == "🖖" && choiseP1 == "✂️")
                    || (choiseP2 == "✂️" && choiseP1 == "🦎") || (choiseP2 == "🦎" && choiseP1 == "📄")
                    || (choiseP2 == "📄" && choiseP1 == "🖖") || (choiseP2 == "🖖" && choiseP1 == "🗿")) -> contPlayer2 += 1
        }
    }

    if (contPlayer1 == contPlayer2) {
        println("Tie")
    } else {
        if (contPlayer1 > contPlayer2) {
            println("Player 1")
        } else {
            println("Player 2")
        }
    }
}