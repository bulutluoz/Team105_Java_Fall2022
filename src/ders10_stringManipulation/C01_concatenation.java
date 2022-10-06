package ders10_stringManipulation;

public class C01_concatenation {

    public static void main(String[] args) {

        String str1= "Java";
        String str2= "Guzeldir";
        boolean bl= true;
        int sayi= 20;
        double dbl= 3.54;

        System.out.println(str1+bl+sayi); // Javatrue20

        // System.out.println(bl+sayi);
        // String disindaki data turlerinde toplama yapmamiza izin vermeyebilir

        System.out.println(sayi + dbl); // 23.54

        // System.out.println(str1.concat(bl));
        // concat() sadece String variable'lari birlestirmek icin kullanilir
        System.out.println(str1.concat(" ").concat(str2)); // Java Guzeldir
    }
}
