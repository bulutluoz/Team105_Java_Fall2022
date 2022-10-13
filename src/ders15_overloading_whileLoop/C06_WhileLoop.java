package ders15_overloading_whileLoop;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {

        /*
        Soru : Kullanicidan sifre isteyin asagidaki sartlari saglamayan sifrelerde hatalari yazdirip,
        kullanicinin yeni sifre girmesi isteyin
        Gecerli bir sifre yazilincaya kadar bu islemi tekrar edin
        gecerli sifre yazilinca “sifreniz basari ile kaydedildi” yazdirin

        sartlar :
        - sifrenin ilk karakteri kucuk harf olmali
        - sifrenin son karakteri sayi olmali
        - sifre en az 8 basamkli olmali

         */

        Scanner scan= new Scanner(System.in);
        boolean sifreGecerliMi=false;
        String sifre="";
        int bayrak=0;

        while(sifreGecerliMi!=true){

            System.out.println("Lutfen sifrenizi giriniz");
            sifre=scan.nextLine();
            bayrak=0;

            if (!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z')){
                System.out.println("Sifrenin ilk karakteri kucuk harf olmali");
                bayrak++;
            }

            if (!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9' )){
                System.out.println("Sifrenin son karakteri sayi olmali");
                bayrak++;
            }

            if (sifre.length()<8){
                System.out.println("Sifre en az 8 karakter olmali");
                bayrak++;
            }

            if (bayrak==0){
                sifreGecerliMi=true;
                System.out.println("Sifreniz basari ile kaydedildi");
            }

        }
    }
}
