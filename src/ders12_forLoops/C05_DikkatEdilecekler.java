package ders12_forLoops;

public class C05_DikkatEdilecekler {

    public static void main(String[] args) {

        /*  Sonsuz loop

        for (int i = 0; i >-10; i++) {

            System.out.print(i +" ");
        }
        */


        // ilk degher icin bitis sarti true olmuyorsa
        // for body'si hic devreye giremez
        for (int i = 0; i >10 ; i++) {

            System.out.println(i);
        }


        // bir loop'u sonunu beklemeden bitirmek istersek

        // kullanicinin verdigi bir sayinin asal sayi olup olmadigini bulun
        // asal sayi : 1 ve kendisi disinda hic bir tamsayiya tam bolunmeyen sayi

        int sayi=230;
        boolean bayrak=false;

        for (int i = 2; i <=sayi-1 ; i++) {

            if (sayi % i==0){
                // askimiz bitti
                bayrak=true;
                break;
            }
        }


        System.out.println(bayrak);


        if (bayrak){
            System.out.println("asal sayi degil");
        }else {
            System.out.println("asal sayi");
        }
    }
}
