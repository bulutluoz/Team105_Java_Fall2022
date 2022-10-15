package ders17_scope;

public class C04_ClassVariables {

    public static void main(String[] args) {
        // C03 deki hastane ismini yazdirmak istesek
        System.out.println(C03_ObjectVariables.hastaneismi); // Yildiz hastanesi

        System.out.println(C03_ObjectVariables.hastaSayisi); // 23453

        C03_ObjectVariables.hastaSayisi++;
        C03_ObjectVariables.hastaSayisi++;
        method1();

        System.out.println(C03_ObjectVariables.hastaSayisi); // 23456

    } // kod takibi main method'dan baslar
      // main method'un sonuna gelindiginde hersey biter
      // tum degisimler resetlenir
      // variable degerleri bastaki hallerine doner

    public static void method1(){
        C03_ObjectVariables.hastaSayisi++;

    }




    /*
     Java Runtime programdir
     calismaya basladiginda variable'lara atanan degerleri isler
     calistigi muddetce yapilan degisikleri kaydeder
     ama calismasi bittiginde degisen degerler reset'lenir

     */
}
