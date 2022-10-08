package ders12_forLoops;

public class C03_Faktoryel
{
    public static void main(String[] args) {

        // kullanicinin verdigi sayinin faktoryelini bulalim

        // 5 ! = 5 * 4 * 3 * 2 * 1 = 120

        int sayi = 10;

        int faktoryel= 1;

        for (int i = sayi; i >=1; i--) {

            faktoryel= faktoryel*i ;
        }

        System.out.println(faktoryel);


        // 1'den 100'e (sinirlar dahil)kadar olan sayilari toplayin

        int toplam=0;

        for (int i = 1; i <=100 ; i++) {

            toplam=toplam+i;

        }

        System.out.println(toplam);
    }
}
