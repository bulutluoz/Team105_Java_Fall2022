package ders06_IfElseStatements;

import java.util.Scanner;

public class C04_IfElseStatements {

    public static void main(String[] args) {
        // Soru 4- Kullanicidan bir karakter girmesini isteyin,
        // girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char krk=scan.next().charAt(0);

        if (krk >='A' && krk <='Z'){
            System.out.println("Buyuk harf");
        }else {
            System.out.println("Buyuk harf degil");
        }
    }
}
