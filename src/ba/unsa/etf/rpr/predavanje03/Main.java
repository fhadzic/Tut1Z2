package ba.unsa.etf.rpr.predavanje03;

import java.util.Scanner;

public class Main {

    private static int sumaCifara(int n){
        if(n<0) n*=(-1);
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


            for(int i=1; i<=Math.abs(n); i++){
                if(n<0) {
                    if (i % sumaCifara(i) == 0 && i != 1) System.out.println(", -" + i);
                    else if (i % sumaCifara(i) == 0 && i == 1) System.out.println("-"+i);
                }else {
                    if (i % sumaCifara(i) == 0 && i != 1) System.out.println(", " + i);
                    else if (i % sumaCifara(i) == 0 && i == 1) System.out.println(i);
                }
    }
            System.out.println( "." );

    }
}
