package ders04_matematikselIslemeler_incrementDecrement;

public class C01_DataCasting {
    public static void main(String[] args) {

        int sayi1= 20;
        int sayi2= 6;

        System.out.println(sayi1/sayi2); // 3
        // bolunen ve bolen ikisi de tamsayi ise, java sonucun sadece tamsayi kismini alir

        double sayi3=6;

        System.out.println(sayi1/sayi3); // 3,33333333333333335 int / double java genis olana gore davranir


    }
}
