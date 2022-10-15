package ders17_scope;

public class C04_ObjectVariables {

    public static void main(String[] args) {
        // C03 deki hastane ismini yazdirmak istesek
        System.out.println(C03_ObjectVariables.hastaneismi); // Yildiz hastanesi

        System.out.println(C03_ObjectVariables.hastaSayisi); // 23453

        C03_ObjectVariables.hastaSayisi++;
        C03_ObjectVariables.hastaSayisi++;
        method1();

        System.out.println(C03_ObjectVariables.hastaSayisi); // 23456

    }

    public static void method1(){
        C03_ObjectVariables.hastaSayisi++;

    }
}
