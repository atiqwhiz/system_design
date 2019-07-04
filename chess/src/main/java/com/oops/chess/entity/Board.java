package com.oops.chess.entity;

public class Board {
    private final int size = 8;
    private Piece[][] piece;

    public void setBoard(){
        piece = new Piece[size][size];
    }


    public void makeMove(Player player, Piece piece) {

    }
}
