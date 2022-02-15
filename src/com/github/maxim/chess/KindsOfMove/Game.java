package com.github.maxim.chess.KindsOfMove;

import com.github.maxim.chess.Figures.King;
import com.github.maxim.chess.Figures.Pawn;
import com.github.maxim.chess.Figures.Piece;
import com.github.maxim.chess.Figures.Rook;
import com.github.maxim.chess.BoardPosition.BoardPosition;

import java.util.ArrayList;
import java.util.List;

public class Game {

    static List<Piece> piece = new ArrayList<>();

    public void handle(Move m) {
        if (m instanceof StandartMove) {
            handleStandardMove((StandartMove) m);
        }
        if (m instanceof PawnTransformation) {
            handlePawnTransformation((PawnTransformation) m);
        }
        if(m instanceof SCastling){
            handleshortCastling((SCastling)m);
        }
        if(m instanceof LCastling){
            handlelongCastling((LCastling)m);
        }

    }

    private void handleStandardMove(StandartMove sm) {
        boolean check = false;
        boolean check1 = false;
        boolean check2 = false;
        Piece toRemove = null;
        for (Piece p : piece) {
            if (p.getPosition().getHorizontal()==sm.getFpos().getHorizontal() && p.getPosition().getVertical()==sm.getFpos().getVertical()) {
                check1 = true;
                if (p.possibleMove(sm.getLpos()) == true) {
                    List<BoardPosition> bp = p.trace(sm.getLpos());
                    for (BoardPosition t : bp) {
                        for (Piece p1 : piece) {
                            if (t.getHorizontal()==p1.getPosition().getHorizontal() && t.getVertical()==p1.getPosition().getVertical()) {
                                check2 = true;
                            }
                        }
                    }
                    if (check2 == true) {
                        System.out.println("The figure interferes with the move!");
                    }
                    else {
                        for (Piece s : piece) {
                            if (sm.getLpos().getHorizontal()==s.getPosition().getHorizontal() && sm.getLpos().getVertical()==s.getPosition().getVertical()) {
                                if (s.getisWhite() != p.getisWhite()){
                                    if(p instanceof Pawn) {
                                        System.out.println("Pawn can not move in this position");
                                    }
                                    else {
                                        p.setPosition(new BoardPosition(sm.getLpos().getVertical(), sm.getLpos().getHorizontal()));
                                        toRemove = s;
                                        s.setHasMoved(true);
                                    }
                                    check = true;
                                    break;
                                } else {
                                    System.out.println("This figures can not move in this position");
                                    check = true;
                                    break;
                                }
                            }
                        }
                        if (check == false) {
                            p.setPosition(new BoardPosition(sm.getLpos().getVertical(), sm.getLpos().getHorizontal()));
                        }
                        check = false;
                    }
                }
                else{
                    System.out.println("The figure can not find  in this position ");
                }
            }
        }
        piece.remove(toRemove);
        if(check1==false){
            System.out.println("The figure can not in this position ");
        }
    }


    private void handlePawnTransformation(PawnTransformation pt){
        boolean test = false;
        Piece shRemove = null;
        pt.getWhatfigure().setPosition(pt.getLpos());
        for(Piece p : piece){
            if (p.getPosition().equals(pt.getFpos()) && (p.getPosition().getHorizontal()==7) && p.getisWhite()!=true) {
                shRemove = p;
                test = p.getisWhite();
            }
            if(p.getPosition().equals(pt.getFpos()) && p.getPosition().getHorizontal()==2 && p.getisWhite()==false){
                shRemove = p;
                test = p.getisWhite();
            }
        }
        if(shRemove instanceof Piece) {
            piece.add(pt.getWhatfigure());
        }
        piece.remove(shRemove);
        pt.getWhatfigure().setisWhite(test);
    }

    private void handleshortCastling(SCastling sc) {
        if (sc.getIsWhite() == true) {
            if (takePiece(new BoardPosition(6, 1)) == null && takePiece(new BoardPosition(7, 1)) == null) {
                for(Piece p : piece) {
                    if(p instanceof King && p.getisWhite()==true) {
                        if (p.getPosition().equals(new BoardPosition(5,1)) && p.getHasMoved()!=true) {
                            p.setPosition(new BoardPosition(7, 1));
                        }
                    }
                    if(p instanceof Rook){
                        if(p.getPosition().equals(new BoardPosition(8,1)) && p.getHasMoved()!=true){
                            p.setPosition(new BoardPosition(6,1));
                        }
                    }
                }
            }
        }
        else{
            if(takePiece(new BoardPosition(6,8))==null && takePiece(new BoardPosition(7,8))==null){
                for(Piece p : piece){
                    if(p instanceof King && p.getisWhite()==false){
                        if(p.getPosition().equals(new BoardPosition(5,8)) && p.getHasMoved()!=true){
                            p.setPosition(new BoardPosition(7,8));
                        }
                    }
                    if(p instanceof Rook){
                        if(p.getPosition().equals(new BoardPosition(8,8)) && p.getHasMoved()!=true){
                            p.setPosition(new BoardPosition(6,8));
                        }
                    }
                }
            }
        }
    }

    private void handlelongCastling(LCastling lc){
        if(lc.getIsWhite()==true){
            if(takePiece(new BoardPosition(2,1))==null && takePiece(new BoardPosition(3,1))==null && takePiece(new BoardPosition(4,1))==null){
                for(Piece p : piece){
                    if(p instanceof King && p.getisWhite()==true){
                        if(p.getPosition().equals(new BoardPosition(5,1)) && p.getHasMoved()!=true){
                            p.setPosition(new BoardPosition(3,1));
                        }
                    }
                    if(p instanceof Rook){
                        if(p.getPosition().equals(new BoardPosition(1,1)) && p.getHasMoved()!=true){
                            p.setPosition(new BoardPosition(4,1));
                        }
                    }
                }
            }
        }
        else{
            if(takePiece(new BoardPosition(2,8))==null && takePiece(new BoardPosition(3,8))==null && takePiece(new BoardPosition(4,8))==null){
                for(Piece p : piece){
                    if(p instanceof King && p.getisWhite()==false){
                        if(p.getPosition().equals(new BoardPosition(5,8)) && p.getHasMoved()!=true){
                            p.setPosition(new BoardPosition(3,8));
                        }
                    }
                    if(p instanceof Rook  ){
                        if(p.getPosition().equals(new BoardPosition(1,8)) && p.getHasMoved()!=true){
                            p.setPosition(new BoardPosition(4,8));
                        }
                    }
                }
            }
        }
    }

    static Piece takePiece(BoardPosition bp){
        for(Piece p : piece){
            if(p.getPosition().equals(bp)) {
                return p;
            }
        }
        return null;
    }

    public List<Piece> getPiece() {
        return piece;
    }

    public void setPiece(List<Piece> piece) {
        this.piece = piece;
    }

}