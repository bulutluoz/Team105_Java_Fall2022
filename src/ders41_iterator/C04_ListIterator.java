package ders41_iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class C04_ListIterator {

    public static void main(String[] args) {

        List<Integer> sayilar= new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);

        // iterator kullanarak, listenin elementlerini sondan basa dogru yazdirin
        ListIterator lit = sayilar.listIterator();
        // once iterator'i sona goturelim

        while(lit.hasNext()){
            lit.next();
        }

        // simdi sondan basa dogru gidelim, giderken elementleri yazdiralim

        while(lit.hasPrevious()){

            System.out.print(lit.previous() + " ");

        }


        // eger iterator'i nerede biraktigimizi hatirlayamazsak
        // iterator.nextIndex() ile hangi index'in oncesinde oldugumuzu gorebiliriz
        System.out.println("");
        System.out.println(lit.nextIndex());

        // iterator kullanarak, listenin tum elementlerini 5 artirin

        while (lit.hasNext()){

            lit.set((Integer)lit.next()+5);

        }

        System.out.println(sayilar);


        // iterator kullanarak 40'dan kucuk olan elementleri silin

        while(lit.hasPrevious()){

            if ((Integer)lit.previous()<40){

                lit.remove();
            }
        }

        System.out.println(sayilar);
























    }
}
