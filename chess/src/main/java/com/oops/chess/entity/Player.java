package com.oops.chess.entity;

import com.oops.chess.enums.Color;
import lombok.Data;

@Data
public class Player {
    private String userId;
    private Color color;
}
