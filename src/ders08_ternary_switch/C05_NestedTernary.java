package ders08_ternary_switch;

public class C05_NestedTernary {
    public static void main(String[] args) {

        // Ornek : Kullanicidan bir tamsayi alin.
        //	Sayi pozitifse, cift sayi veya cift sayi degil seceneklerinden uygun olani yazdirin
        //	Sayi pozitif degilse, 3 basamakli veya 3 basamakli degil seceneklerinden uygun olani yazdirin

        int sayi=20;

        if (sayi>0){
            //cift sayi veya cift sayi degil seceneklerinden uygun olani yazdirin

            System.out.println(sayi%2==0 ? "Cift sayi" : "Cift sayi degil");

        }else {

            //3 basamakli veya 3 basamakli degil seceneklerinden uygun olani yazdirin
            System.out.println(sayi<-99 && sayi>-1000 ? "Uc basamakli" : "Uc basamakli degil");
        }


        String sonuc = sayi>0
                       ?
                       sayi%2==0 ? "Cift sayi" : "Cift sayi degil"
                       :
                       sayi<-99 && sayi>-1000 ? "Uc basamakli" : "Uc basamakli degil";


    }
}
