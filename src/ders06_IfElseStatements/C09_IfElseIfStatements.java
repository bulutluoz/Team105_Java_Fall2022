package ders06_IfElseStatements;

import java.util.Scanner;

public class C09_IfElseIfStatements {

    public static void main(String[] args) {
        // kullanicidan bir tam sayi alin
        // sayi negatif ise "gecersiz sayi"
        // tek basamakli ise "rakam"
        // iki basamakli ise "iki basamakli sayi"
        // bunun disindaki sayilar icin "buyuk sayi" yazdirin

        int sayi= -20;

        if (sayi<0){
            System.out.println("gecersiz sayi");
        }else if(sayi<10){
            System.out.println("rakam");
        } else if (sayi<100) {
            System.out.println("iki basamakli sayi");
        }else {
            System.out.println("buyuk sayi");
        }
    }
}
