package ba.unsa.etf.rpr.predavanje03;

import java.util.Scanner;

public class Main {

    private static int sumaCifara(int n){
        int suma=0;
        for(int i=n; i!=0; i/=10){
            suma += i%10;
        }
        return suma;
    }

    public static void main(String[] args) {

            Scanner skener = new Scanner(System.in);

            System.out.println("Unesite broj n: ");

            int n;

            n= Integer.valueOf(skener.next());

            System.out.println("Suma cifara broja n je: " + sumaCifara(n));


            // Nova iymjena
    }
}
