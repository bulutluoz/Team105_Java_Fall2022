package ders37_exceptions;

import java.util.Scanner;

public class C06_ThrowKeyword {

    public static void main(String[] args) {

        // Kullanicidan yasini isteyin
        // eger 0 veya negatif bir sayi girerse
        // uyari olaral IllegalArgumentException uyarisi verin
        // ancak kodumuz normal calismaya devam etsin


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas= scan.nextInt();

        if (yas<=0){

            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
                System.out.println("yas sifir veya negatif OLAMAZ");
            }
        }
    }
}
