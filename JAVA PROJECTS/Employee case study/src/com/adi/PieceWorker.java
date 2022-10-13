package com.adi;

public class PieceWorker extends Employee{
    private int wagePerPiece;
    private int piecesProduced;

    public PieceWorker(int piecesProduced,int wagePerPiece){
        super();
        this.piecesProduced=piecesProduced;
        this.wagePerPiece=wagePerPiece;
    }
    public PieceWorker(String name,int empID,double hourlyIncome,Date birthdate,int piecesProduced,int wagePerPiece){
        super(name, empID, hourlyIncome, birthdate);
        this.piecesProduced=piecesProduced;
        this.wagePerPiece=wagePerPiece;
    }


    public double earnings(){
        return (wagePerPiece*piecesProduced);
    }

    @Override
    public String toString() {
        return String.format("\nPiece Worker %s\nWage Per Piece:%d\nPiece Produced:%d\nEarning:%.2f",super.toString(),
                wagePerPiece,piecesProduced,earnings());
    }
}
