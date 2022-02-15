package com.github.maxim.chess.BoardPosition;

import java.util.Objects;

public class BoardPosition {

    private int  vertical;
    private int horizontal;

    public BoardPosition( int v , int h){
        vertical = v;
        horizontal = h;
    }
    public int getVertical() {
        return vertical;
    }

    public void setVertical(int vertical) {
        this.vertical = vertical;
    }

    public int getHorizontal() {
        return horizontal;
    }

    public void setHorizontal(int horizontal) {
        this.horizontal = horizontal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoardPosition that = (BoardPosition) o;
        return vertical == that.vertical &&
                horizontal == that.horizontal;
    }

    @Override
    public int hashCode() {
        return Objects.hash(vertical, horizontal);
    }
}
