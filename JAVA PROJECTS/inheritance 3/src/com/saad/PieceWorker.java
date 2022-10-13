package com.saad;
// Saad Mukhtar
//sp20-bcs-124
public class PieceWorker extends Employee{
    private int wagePerPiece;
    private int piecesProduced;

    public PieceWorker(int piecesProduced){
        super();
        this.piecesProduced=piecesProduced;
        wagePerPiece=30;
    }

    public double earnings(){
        return (wagePerPiece*piecesProduced);
    }

    @Override
    public String toString() {
        return String.format("%s\nWage Per Piece:%d\nPiece Produced:%d\nSALARY:%.2f",super.toString(),
                wagePerPiece,piecesProduced,earnings());
    }
}
