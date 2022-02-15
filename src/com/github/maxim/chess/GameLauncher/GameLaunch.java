package com.github.maxim.chess.GameLauncher;
import com.github.maxim.chess.FiguresParsing.MoveParsing;
import com.github.maxim.chess.BoardPosition.BoardPosition;
import com.github.maxim.chess.DrawBoard.Consoledraw;
import com.github.maxim.chess.Figures.*;
import com.github.maxim.chess.KindsOfMove.*;
import com.github.maxim.chess.MoveExceptions.ImpossibleMoveException;

import java.util.ArrayList;
import java.util.Scanner;

public class GameLaunch {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        Game g = new Game();
        Consoledraw c = new Consoledraw();
        ArrayList<Piece> pieces = new ArrayList<>();
        for (int i = 0; i < 9; i++) {

            Pawn p = new Pawn(false, new BoardPosition(i, 7));
            Pawn pa = new Pawn(true, new BoardPosition(i, 2));
            pieces.add(pa);
            pieces.add(p);
        }

        Queen q = new Queen(true, new BoardPosition(4, 1));
        Queen qu = new Queen(false, new BoardPosition(4, 8));
        pieces.add(q);
        pieces.add(qu);

        Rook r = new Rook(true, new BoardPosition(1, 1));
        Rook r1 = new Rook(true, new BoardPosition(8, 1));
        Rook ro = new Rook(false, new BoardPosition(1, 8));
        Rook ro1 = new Rook(false, new BoardPosition(8, 8));
        pieces.add(r);
        pieces.add(ro);
        pieces.add(r1);
        pieces.add(ro1);

        Knight kn = new Knight(true, new BoardPosition(2, 1));
        Knight kni = new Knight(false, new BoardPosition(2, 8));
        Knight kn1 = new Knight(true, new BoardPosition(7, 1));
        Knight kni1 = new Knight(false, new BoardPosition(7, 8));

        pieces.add(kn);
        pieces.add(kni);
        pieces.add(kn1);
        pieces.add(kni1);

        Bishop b = new Bishop(true, new BoardPosition(3, 1));
        Bishop bi = new Bishop(false, new BoardPosition(3, 8));
        Bishop b1 = new Bishop(true, new BoardPosition(6, 1));
        Bishop bi1 = new Bishop(false, new BoardPosition(6, 8));

        pieces.add(b);
        pieces.add(bi);
        pieces.add(b1);
        pieces.add(bi1);

        King k = new King(true, new BoardPosition(5, 1));
        King ki = new King(false, new BoardPosition(5, 8));
        pieces.add(k);
        pieces.add(ki);

        g.setPiece(pieces);
        c.drawBoard(g);

        while (true) {
            try {
                String s = in.nextLine();
                g.handle(MoveParsing.parrsing(s));
                c.drawBoard(g);
            }
            catch (ImpossibleMoveException ime){
                System.out.println("It is an impossible move");
            }
        }
    }
}