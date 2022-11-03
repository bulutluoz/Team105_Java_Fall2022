package ders28_varargs_stringBuilder;

public class C01_Varargs {

    public static void main(String[] args) {

        topla(5,6); // 2 sayi 11
        topla(5,3,8); // 3 sayi 16
        topla(2,4,6,8); // 4 sayi 20

        // parametre sayisi degistikce bizden yeni method olusturmamizi ister

    }

    private static void topla(int sayi1, int sayi2, int sayi3, int sayi4) {
        System.out.println("4 sayinin toplami : " + (sayi1+sayi2+sayi3+sayi4));
    }

    private static void topla(int sayi1, int sayi2, int sayi3) {
        System.out.println("3 sayinin toplami : " + (sayi1+sayi2+sayi3));
    }

    public static void topla(int sayi1, int sayi2) {

        System.out.println("2 sayinin toplami : " + (sayi1+sayi2));
    }
}
