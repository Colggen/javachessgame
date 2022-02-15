package com.github.maxim.chess.Figures;

import com.github.maxim.chess.BoardPosition.BoardPosition;
import com.github.maxim.chess.MoveExceptions.ImpossibleMoveException;

import java.util.ArrayList;
import java.util.List;

public class Queen extends Piece {
    List<BoardPosition> bp = new ArrayList<>();

    public Queen(boolean iswhite, BoardPosition position) {
        super(iswhite, position);
    }
    public Queen(){

    }

    @Override
    public boolean possibleMove(BoardPosition bp) {
        if(bp.getHorizontal() <=8 &&  bp.getHorizontal()>=1 &&  bp.getVertical() <=8 && bp.getVertical()>=1){
            if(Math.abs(bp.getHorizontal()-getPosition().getHorizontal()) == Math.abs(bp.getVertical()-getPosition().getVertical())){
                return true;
            }
            if(bp.getHorizontal() == getPosition().getHorizontal() || bp.getVertical() ==getPosition().getVertical()){
                return true;
            }
        }
        throw new ImpossibleMoveException();
    }

    @Override
    public List<BoardPosition> trace(BoardPosition p) {
        int start1 = 0;
        int start2 = 0;
        int end2 = 0;
        if(possibleMove(p)) {
            if(getPosition().getVertical()<p.getVertical()){
                start1 = getPosition().getVertical();
            }
            else{
                start1 = p.getVertical();
            }
            if(getPosition().getHorizontal() < p.getHorizontal()){
                start2 = getPosition().getHorizontal();
                end2 = p.getHorizontal();
            }
            else{
                start2 = p.getHorizontal();
                end2 = getPosition().getHorizontal();
            }
            int counter = Math.abs(getPosition().getVertical() - getPosition().getVertical());
            for (int i = start2+1; i < end2; i++) {
                for (int j = start1+1; j < end2; j++) {
                    if (Math.abs(i - j) == counter) {
                        bp.add(new BoardPosition(j, i));
                    }
                }
            }
        }
        if(possibleMove(p)){
            if(getPosition().getHorizontal()==p.getHorizontal()){
                for(int i = getPosition().getVertical()+1;i < p.getVertical();i++){
                    bp.add(new BoardPosition(i,getPosition().getHorizontal()));
                }
            }
            else{
                for(int i = getPosition().getHorizontal()+1;i < p.getHorizontal();i++){
                    bp.add(new BoardPosition(getPosition().getVertical(),i));
                }
            }
        }
        return bp;
    }

    @Override
    public char getUnicodeSymbol() {
        if(getisWhite()){
            return '\u2655';
        }
        else{
            return '\u265B';
        }
    }
}
