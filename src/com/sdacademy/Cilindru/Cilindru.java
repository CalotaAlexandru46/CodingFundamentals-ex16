package com.sdacademy.Cilindru;

public class Cilindru {
    private double raza;
    private double h;

    public Cilindru(double raza, double h){
        this.raza=raza;
        this.h=h;
    }

    public  double Aria(){
        return 2*Math.PI*raza*(raza+h);
    }
    public double Volum(){
        return Math.PI*Math.pow(raza,2)*h;
    }

    public String toString() {
        return "Cilindrul cu raza "+raza+" si inaltimea " +h+". ";
    }
}
