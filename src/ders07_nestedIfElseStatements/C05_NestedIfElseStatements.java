package ders07_nestedIfElseStatements;

public class C05_NestedIfElseStatements {
    public static void main(String[] args) {
        // Soru 2- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20, 10 urunden az ise  %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15, 10 urunden az ise  %10 indirim yapin

        int urunAdedi = 25;
        boolean kartVarMi = false;
        double listeFiyati = 20;
        double toplamFiyat = 0;

        // ana degisken kart olsun
        
        if (kartVarMi){
            // kart var
            if (urunAdedi<0){
                System.out.println("hatali urun adedi girisi");
            } else if (urunAdedi<10) {
                toplamFiyat= urunAdedi*listeFiyati*0.85;
                System.out.println("%15 indirimli toplam fiyat : " + toplamFiyat + " tl");
            }else{
                toplamFiyat= urunAdedi*listeFiyati*0.80;
                System.out.println("%20 indirimli toplam fiyat : " + toplamFiyat+ " tl");
            }


        } else {
            // kart yok
            if (urunAdedi<0){
                System.out.println("hatali urun adedi girisi");
            } else if (urunAdedi<10) {
                toplamFiyat= urunAdedi*listeFiyati*0.90;
                System.out.println("%10 indirimli toplam fiyat : " + toplamFiyat+ " tl");
            }else{
                toplamFiyat= urunAdedi*listeFiyati*0.85;
                System.out.println("%15 indirimli toplam fiyat : " + toplamFiyat+ " tl");
            }
            
        }

    }
}
