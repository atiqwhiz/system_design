package com.oops.chess.game;

import com.oops.chess.entity.Board;
import com.oops.chess.entity.BoardStatus;
import com.oops.chess.entity.Piece;
import com.oops.chess.entity.Player;
import lombok.Data;

@Data
public class Game {
    Board board;
    Player player1;
    Player player2;

    public void startGame() {
        board.setBoard();  //initialized board
        while (true) {
            Piece piece = null;
            board.makeMove(player1,piece);
            checkBoardStatus(board);
            board.makeMove(player2,piece);
            checkBoardStatus(board);
        }
    }

    private BoardStatus checkBoardStatus(Board board) {

        return BoardStatus.WIN;
    }
}
