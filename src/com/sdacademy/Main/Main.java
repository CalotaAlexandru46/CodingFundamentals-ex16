package com.sdacademy.Main;

import com.sdacademy.Cilindru.Cilindru;

public class Main {
    public static void main(String[] args) {

        Cilindru c1= new Cilindru(4,3);
        Cilindru c2= new Cilindru(6,4);

        System.out.print(c1);
        System.out.printf("Aria: %.2f ",c1.Aria());
        System.out.printf("Volum: %.2f ",c1.Volum());

        System.out.println();

        System.out.print(c2);
        System.out.printf("Aria: %.2f ",c2.Aria());
        System.out.printf("Volum: %.2f \n",c2.Volum());
        
    }
}
