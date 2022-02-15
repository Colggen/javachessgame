package com.github.maxim.chess.KindsOfMove;

import com.github.maxim.chess.BoardPosition.BoardPosition;

public class PawnEating extends Move {

    private BoardPosition fpos;
    private BoardPosition lpos;

    public PawnEating(BoardPosition fpos, BoardPosition lpos) {
        this.fpos = fpos;
        this.lpos = lpos;
    }

    public BoardPosition getFpos() {
        return fpos;
    }

    public void setFpos(BoardPosition fpos) {
        this.fpos = fpos;
    }

    public BoardPosition getLpos() {
        return lpos;
    }

    public void setLpos(BoardPosition lpos) {
        this.lpos = lpos;
    }
}
