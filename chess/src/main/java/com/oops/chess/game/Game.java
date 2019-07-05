package com.oops.chess.game;

import com.oops.chess.entity.*;
import lombok.Data;

@Data
public class Game {
    Board board;
    Player player1;
    Player player2;

    private Game() {
    }

    public void initializeGame() {
        board.setBoard();
    }

    public BoardStatus playTurn(Player player, Piece piece, Axis destination) {

        if (!board.isValidMove(player, piece, destination) || !board.isValidPieceMove(piece, destination)) {
            return BoardStatus.INVALID_MOVE;
        } else {
            board.makeMove(player, piece, destination);
            return board.checkBoardStatus(board);
        }
    }
}
