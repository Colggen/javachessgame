package com.github.maxim.chess.Figures;

import com.github.maxim.chess.BoardPosition.BoardPosition;

public abstract class Piece implements Moveable, Drawable {


    private boolean isWhite;
    private boolean hasMoved;
    private BoardPosition position;

    public Piece(boolean isWhite, boolean hasMoved, BoardPosition position) {
        this.isWhite = isWhite;
        this.hasMoved = hasMoved;
        this.position = position;
    }
    public Piece(){

    }
    Piece(boolean iswhite, BoardPosition position){
        this.isWhite = iswhite;
        this.position = position;
    }

    public boolean getisWhite() {
        return isWhite;
    }

    public void setisWhite(boolean white) {
        isWhite = white;
    }

    public BoardPosition getPosition() {
        return position;
    }

    public void setPosition(BoardPosition position) {
        this.position = position;
    }
    public boolean getHasMoved() {
        return hasMoved;
    }

    public void setHasMoved(boolean hasMoved) {
        this.hasMoved = hasMoved;
    }
}
