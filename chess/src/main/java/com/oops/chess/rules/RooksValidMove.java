package com.oops.chess.rules;

import com.oops.chess.entity.Axis;

public class RooksValidMove implements ValidMove{

    @Override
    public boolean validOptions(Axis source, Axis dest) {
        return false;
    }
}
