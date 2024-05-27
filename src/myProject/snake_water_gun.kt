package myProject

import kotlin.random.Random

enum class Move {
    SNAKE,
    WATER,
    GUN
}

fun getComputerMoves(): Move {
    val moves = Move.values()
    return moves[Random.nextInt(moves.size)]
}

fun getResult(playerMoves: Move, computerMove: Move): String {
    return when {
        playerMoves == computerMove -> "It's a Dreaw"
        playerMoves == Move.SNAKE && computerMove == Move.WATER -> "You win! Snake drinks water"
        playerMoves == Move.SNAKE && computerMove == Move.GUN -> "You lose! Gun shoots snake"
        playerMoves == Move.WATER && computerMove == Move.GUN -> "You win Water! rusts gun"
        playerMoves == Move.WATER && computerMove == Move.SNAKE -> "You lose! Snake drinks water"
        playerMoves == Move.GUN && computerMove == Move.SNAKE -> "You win! gun shoots snake"
        playerMoves == Move.GUN && computerMove == Move.WATER -> "You lose! Water rusts gun"
        else -> {
            "Invalid Moves"
        }
    }
}

fun main() {
    while (true) {
        println("Enter your moves (Snake, WATER, GUN):")
        val playerMoveInput = readln().uppercase()

        if (playerMoveInput == "EXIT") {
            println("Thanks for playing!")
            break
        }
        val playerMoves = try {
            Move.valueOf(playerMoveInput)
        } catch (e: IllegalArgumentException) {
            println("Invalid choice! please enter  SNAKE,WATER, or GUN")
            continue
        }
        val computerMove = getComputerMoves()
        println("computer choose $computerMove")
        val result = getResult(playerMoves, computerMove)
        println(result)
    }
}