package com.github.maxim.chess.Figures;

import com.github.maxim.chess.BoardPosition.BoardPosition;
import com.github.maxim.chess.MoveExceptions.ImpossibleMoveException;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends Piece {

    public Pawn(boolean isWhite, BoardPosition position) {
        super(isWhite, position);
    }

    @Override
    public boolean possibleMove(BoardPosition bp) {
        if(getisWhite()==true) {
            if (bp.getHorizontal() <= 8 && bp.getHorizontal() >= 1 && bp.getVertical() <= 8 && bp.getVertical() >= 1) {
                if ((bp.getVertical() == getPosition().getVertical()) && getPosition().getHorizontal() !=1) {
                    if (getPosition().getHorizontal() == 2 && getPosition().getHorizontal() + 2 == bp.getHorizontal() || getPosition().getHorizontal() + 1 == bp.getHorizontal()) {
                        return true;
                    } else {
                        throw new ImpossibleMoveException();
                    }
                }
            }
        }
        else{
            if (bp.getHorizontal() <= 8 && bp.getHorizontal() >= 1 && bp.getVertical() <= 8 && bp.getVertical() >= 1) {
                if(bp.getVertical()==getPosition().getVertical() && getPosition().getHorizontal()!=8){
                    if(getPosition().getHorizontal()==7 && getPosition().getHorizontal()-2==bp.getHorizontal() || getPosition().getHorizontal()-1==bp.getHorizontal()){
                        return true;
                    }
                    else{
                        throw new ImpossibleMoveException();
                    }
                }
            }
        }
            throw new ImpossibleMoveException();
    }

    @Override
    public List<BoardPosition> trace(BoardPosition p) {
        List<BoardPosition> bp = new ArrayList<>();
        if(possibleMove(p)){
            if(getisWhite()){
                if(Math.abs(p.getHorizontal()-getPosition().getHorizontal())==2){
                    bp.add(new BoardPosition(getPosition().getVertical(),3));
                }
            }
            else{
                if(Math.abs(getPosition().getHorizontal()-p.getHorizontal())==2){
                    bp.add(new BoardPosition(getPosition().getVertical(),6));
                }
            }
        }
        return bp;
    }

    @Override
    public char getUnicodeSymbol() {
        if(getisWhite()){
            return '\u2659';
        }
        else{
            return '\u265F';
        }
    }
}
