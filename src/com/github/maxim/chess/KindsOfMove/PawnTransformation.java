package com.github.maxim.chess.KindsOfMove;

import com.github.maxim.chess.Figures.Piece;
import com.github.maxim.chess.BoardPosition.BoardPosition;

public class PawnTransformation  extends Move{

    private BoardPosition fpos;
    private BoardPosition lpos;
    private Piece whatfigure;

    public PawnTransformation(BoardPosition fpos, BoardPosition lpos, Piece whatfigure) {
        this.fpos = fpos;
        this.lpos = lpos;
        this.whatfigure = whatfigure;
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

    public Piece getWhatfigure() {
        return whatfigure;
    }

    public void setWhatfigure(Piece whatfigure) {
        this.whatfigure = whatfigure;
    }

}
