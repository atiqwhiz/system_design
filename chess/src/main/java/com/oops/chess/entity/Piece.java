package com.oops.chess.entity;

import com.oops.chess.enums.Color;
import lombok.Data;

@Data
abstract public class Piece {
    private String name;
    private Color color;
}