package com.oops.chess.entity;

import com.oops.chess.rules.KnightValidMove;
import com.oops.chess.rules.QueenValidMove;
import com.oops.chess.rules.ValidMove;

public class Board {
    private final int size = 8;
    private Piece[][] matrix;

    public void setBoard() {
        matrix = new Piece[size][size];
    }


    public boolean isValidMove(Player player, Piece piece, Axis destination) {

        if (destination.getRow() < 0 || destination.getRow() > 7 || destination.getCol() < 0 || destination.getCol() > 7)
            return false;
        else
            return matrix == null || matrix[destination.getRow()][destination.getCol()].getColor() != player.getColor();
    }

    public void makeMove(Player player, Piece piece, Axis destination) {
        piece.setAxis(destination);
    }

    public boolean isValidPieceMove(Piece piece, Axis destination) {
        ValidMove validMove = null;
        Boolean moveValidity = false;
        if (piece.getPieceType().equals(PieceType.QUEEN)) {
            validMove = new QueenValidMove();
            moveValidity = validMove.validOptions(piece.getAxis(), destination);
        } else if (piece.getPieceType().equals(PieceType.KNIGHTS)) {
            validMove = new KnightValidMove();
            moveValidity = validMove.validOptions(piece.getAxis(), destination);
        }
        return moveValidity;
    }

    public BoardStatus checkBoardStatus(Board board) {
       return BoardStatus.DRAW;
    }
}
