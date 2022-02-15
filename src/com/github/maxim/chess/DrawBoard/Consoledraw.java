package com.github.maxim.chess.DrawBoard;

import com.github.maxim.chess.Figures.Piece;
import com.github.maxim.chess.KindsOfMove.Game;

public class Consoledraw implements Ui{

    @Override
    public void drawBoard(Game game){
        for(int h = 8; h>=1;h--){
            System.out.println();
            for(int v = 1; v <= 8 ;v++){
                boolean chek = false;
                for(Piece p : game.getPiece()) {
                    if (p.getPosition().getHorizontal() == h && p.getPosition().getVertical() == v) {
                        System.out.print(p.getUnicodeSymbol());
                        chek=true;
                    }
                }
                if(chek==false) {
                    if((v+h)%2==0){
                        System.out.print('□');
                    }
                    else{
                        System.out.print('■');
                    }
                }
                System.out.print('\t');
            }
        }
        System.out.println();
    }
}
