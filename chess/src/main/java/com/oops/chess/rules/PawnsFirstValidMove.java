package com.oops.chess.rules;

import com.oops.chess.entity.Axis;

public class PawnsFirstValidMove implements ValidMove {
    @Override
    public boolean validOptions(Axis source, Axis dest) {
        return false;
    }
}
