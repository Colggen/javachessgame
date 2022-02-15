package com.github.maxim.chess.Figures;

import com.github.maxim.chess.BoardPosition.BoardPosition;

import java.util.List;

public interface Moveable {

    boolean possibleMove(BoardPosition bp);
    List<BoardPosition> trace(BoardPosition p);
}
