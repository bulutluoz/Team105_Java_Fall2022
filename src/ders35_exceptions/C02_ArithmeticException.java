package ders35_exceptions;

public class C02_ArithmeticException {
    public static void main(String[] args) {

        // Verilen iki tamsayiyi birbirine bolup
        // sonucun tamsayi kismini yazdirin

        int sayi1=20;
        int sayi2=0;

        try {
            // riskli oldugunu ongordugumuz kodlar
            System.out.println(sayi1/sayi2);
            System.out.println("Bakalim bu satir calisacak mi ?");

        } catch (ArithmeticException e) {
            // catch (ArithmeticException e)  ongordugumuz risk
            System.out.println("Sayi sifira bolunemez");
            // catch(0 'den sonraki { } catch blogu denir
            // beklenen risk gerceklesirse calisacak kodlar
        }


        /*
          Bazi exception'lar if else ile handle edilebilir ancak
          tum exception'lar icin if else yeterli olmaz

         */

    }
}
