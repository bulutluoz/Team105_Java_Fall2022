package ders21_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_ArraydenTekrarlariSilme {

    public static void main(String[] args) {
        // verilen bir array'deki tekrar eden sayilari
        // bir kere olacak sekilde array'i duzenleyin

        int[] arr = {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};

        // bu soruyu array'le yapmak cok zor
        // bunun yerine bu array'in elemanlarini tek tek inceleyip
        // tekrarsiz olanlari bir list'e atalim

        List<Integer> tekrarsizListe= new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {

            if (!tekrarsizListe.contains(arr[i])){
                tekrarsizListe.add(arr[i]);
            }
        }
        System.out.println("tekrarsiz liste : " + tekrarsizListe); // [1, 2, 4, 3, 5]
        // en son o list'deki elementleri array'e atamak gerekir
        // bunun icin once array'e yeni ve bos bir array degeri atayip
        // sonra list'deki elementleri array'e tasiyalim

        arr= new int[tekrarsizListe.size()];  // [0, 0, 0, 0, 0]


        for (int i = 0; i < arr.length; i++) {

            arr[i] = tekrarsizListe.get(i);

        }

        // array istenen hale geldi

        System.out.println("Array'in tekrarsiz hali : "+Arrays.toString(arr));
    }
}
