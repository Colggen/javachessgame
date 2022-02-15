package com.github.maxim.chess.KindsOfMove;

public class LCastling extends Move {

    private boolean isWhite;

    public LCastling(boolean isWhite) {
        this.isWhite = isWhite;
    }

    public boolean getIsWhite() {
        return isWhite;
    }

    public void setIsWhite(boolean isWhite) {
        this.isWhite = isWhite;
    }

}
