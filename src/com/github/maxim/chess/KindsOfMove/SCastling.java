package com.github.maxim.chess.KindsOfMove;

public class SCastling extends Move {

    private boolean isWhite;

    public SCastling(boolean isWhite) {
        this.isWhite = isWhite;
    }

    public boolean getIsWhite() {
        return isWhite;
    }

    public void setIsWhite(boolean isWhite) {
        this.isWhite = isWhite;
    }
}
