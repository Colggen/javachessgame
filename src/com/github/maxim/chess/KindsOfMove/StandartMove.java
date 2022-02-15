package com.github.maxim.chess.KindsOfMove;

import com.github.maxim.chess.BoardPosition.BoardPosition;

public class StandartMove extends Move {

    private BoardPosition fpos;
    private BoardPosition lpos;

    public StandartMove(BoardPosition fpos, BoardPosition lpos) {
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
