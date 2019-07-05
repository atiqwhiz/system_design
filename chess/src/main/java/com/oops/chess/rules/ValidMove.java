package com.oops.chess.rules;

import com.oops.chess.entity.Axis;

public interface ValidMove {
    boolean validOptions(Axis source, Axis dest);
}
