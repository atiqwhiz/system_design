package com.oops.chess.rules;

import com.oops.chess.entity.Axis;

public class QueenValidMove implements ValidMove {

    public boolean validOptions(Axis source, Axis dest) {

        return (source.getRow() == dest.getRow())
                || (source.getCol() == dest.getCol())
                || (source.getRow() == dest.getRow()) ||
                (Math.abs((source.getRow() - dest.getRow())) == Math.abs((source.getCol() - dest.getCol())));
    }
}
