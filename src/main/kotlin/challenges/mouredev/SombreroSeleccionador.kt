package challenges.mouredev

/*
 * Reto #7: El sombrero seleccionador
 * Crea un programa que simule el comportamiento del sombrero selccionador del
 * universo mágico de Harry Potter.
 * - De ser posible realizará 5 preguntas (como mínimo) a través de la terminal.
 * - Cada pregunta tendrá 4 respuestas posibles (también a selecciona una a través de terminal).
 * - En función de las respuestas a las 5 preguntas deberás diseñar un algoritmo que
 *   coloque al alumno en una de las 4 casas de Hogwarts (Gryffindor, Slytherin , Hufflepuff y Ravenclaw)
 * - Ten en cuenta los rasgos de cada casa para hacer las preguntas y crear el algoritmo seleccionador.
 *   Por ejemplo, en Slytherin se premia la ambición y la astucia.
 */

fun main(args: Array<String>) {
    hat()
    //hatCorrection()
}

private fun hat() {
    var contGryffindor = 0
    var contSlytherin = 0
    var contHufflepuff = 0
    var contRavenclaw = 0
    var answer_option = 0

    println("Pregunta 1: Digamos que tiene un examen la próxima semana, ¿cómo se va a preparar?")
    println(
        "Respuesta 1: Dejo todo para última hora y el día antes me trasnocho estudiando con uno o dos amigos\n" +
                "Respuesta 2: Reviso mis apuntes y estudio solo  en mi casa\n" +
                "Respuesta 3: Le digo a mis compañeros que nos reunamos a estudiar juntos en la biblioteca\n" +
                "Respuesta 4: Estudio un poquito cada día de la semana pero no me estreso porque sé que he parado bolas " +
                "en clase entonces me va a ir bien"
    )
    println("Selecciona el número de la respuesta a elegir: ")
    answer_option = readln().toInt()
    when {
        (answer_option == 1) -> contGryffindor += 1
        (answer_option == 2) -> contRavenclaw += 1
        (answer_option == 3) -> contHufflepuff += 1
        (answer_option == 4) -> contSlytherin += 1
    }

    println("\nPregunta 2: Si su habitación en Hogwarts se está quemando y pudiera rescatar solo una cosa, ¿cuál sería?")
    println(
        "Respuesta 1: A su mascota\n" +
                "Respuesta 2: Una reliquia familiar que ha pasado de generación en generación\n" +
                "Respuesta 3: Su libro favorito o computador\n" +
                "Respuesta 4: Las fotos que tiene con sus amigos"
    )
    println("Selecciona el número de la respuesta a elegir: ")
    answer_option = readln().toInt()
    when {
        (answer_option == 1) -> contGryffindor += 1
        (answer_option == 2) -> contSlytherin += 1
        (answer_option == 3) -> contRavenclaw += 1
        (answer_option == 4) -> contHufflepuff += 1
    }

    println("\nPregunta 3: ¿Cuál de estas cosas lo pone más nervioso?")
    println(
        "Respuesta 1: La soledad\n" +
                "Respuesta 2: Los espacios cerrados\n" +
                "Respuesta 3: Fracasar\n" +
                "Respuesta 4: Hablar en público"
    )
    println("Selecciona el número de la respuesta a elegir: ")
    answer_option = readln().toInt()
    when {
        (answer_option == 1) -> contGryffindor += 1
        (answer_option == 2) -> contSlytherin += 1
        (answer_option == 3) -> contRavenclaw += 1
        (answer_option == 4) -> contHufflepuff += 1
    }

    println("\nPregunta 4: Si le dan un pedazo de papel, ¿qué hace con él?")
    println(
        "Respuesta 1: Un avioncito de papel\n" +
                "Respuesta 2: Escribe\n" +
                "Respuesta 3: Lo rompe en muchos pedazos\n" +
                "Respuesta 4: Dibuja"
    )
    println("Selecciona el número de la respuesta a elegir: ")
    answer_option = readln().toInt()
    when {
        (answer_option == 1) -> contGryffindor += 1
        (answer_option == 2) -> contSlytherin += 1
        (answer_option == 3) -> contRavenclaw += 1
        (answer_option == 4) -> contHufflepuff += 1
    }

    println("\nPregunta 5: Si en una clase los ponen a hacer un trabajo en grupo, ¿usted qué hace?")
    println(
        "Respuesta 1: Hacer de todo un poquito: ayuda con la investigación, organiza, escribe\n" +
                "Respuesta 2: Se pone a cargo de todo, organiza, asigna roles y termina caso haciéndolo todo usted. " +
                "Prefiere eso porque si no lo hace usted, no va a quedar bien hecho\n" +
                "Respuesta 3: Lo mínimo posible. En los grupos siempre hay alguien que se va a encargar de hacerlo todo y eso es lo chévere\n" +
                "Respuesta 4: Investiga y escribe gran parte del trabajo pero deja que alguien más en el grupo lo decore y haga la presentación"
    )
    println("Selecciona el número de la respuesta a elegir: ")
    answer_option = readln().toInt()
    when {
        (answer_option == 1) -> contGryffindor += 1
        (answer_option == 2) -> contRavenclaw += 1
        (answer_option == 3) -> contHufflepuff += 1
        (answer_option == 4) -> contSlytherin += 1
    }

    when {
        (contGryffindor > contSlytherin && contGryffindor > contHufflepuff && contGryffindor > contRavenclaw) -> println(
            "Perteneces a Gryffindor"
        )

        (contSlytherin > contGryffindor && contSlytherin > contHufflepuff && contSlytherin > contRavenclaw) -> println("Perteneces a Slytherin")
        (contHufflepuff > contGryffindor && contHufflepuff > contSlytherin && contHufflepuff > contRavenclaw) -> println(
            "Perteneces a Hufflepuff"
        )

        (contRavenclaw > contGryffindor && contRavenclaw > contSlytherin && contRavenclaw > contHufflepuff) -> println("Perteneces a Ravenclaw")
    }
}