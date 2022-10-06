package ders10_stringManipulation;

public class C07_Soru {

    public static void main(String[] args) {
        /*
          Kullanicidan bir cumle ve bir metin alin
          cumlede metnin durumuna gore
          1- cumle metni icermiyor
          2- cumle metni sadece 1 kere iceriyor
          3- cumle metni birden fazla iceriyor
          seceneklerinden uygun olani yazdirin
         */

        String cumle= "Java cok guzeldir cok.";
        String metin= "cok";

        if (!cumle.contains(metin)){
            System.out.println("cumle metni icermiyor");
        }else{
            int ilkIndex= cumle.indexOf(metin); // 5

            int ikinciIndex=cumle.indexOf(metin, ilkIndex+1); // ya -1 olacak ya da bir index

            if (ikinciIndex==(-1)){
                System.out.println("cumle metni sadece 1 kere iceriyor");
            }else {
                System.out.println("cumle metni birden fazla iceriyor");
            }


        }



    }
}
