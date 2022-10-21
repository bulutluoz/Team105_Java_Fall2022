package ders20_multiDimensionalArrays;

import ders18_arrays.C06_KullaniciyaArrayOlusturma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C09_ArrayList {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        C06_KullaniciyaArrayOlusturma obj1= new C06_KullaniciyaArrayOlusturma();


        List<Integer> sayilar = new ArrayList<>();

        // 1- List primitive data kabul etmez
        // 2- List bir interface oldugu icin direk obje olusturulamaz
        //    Onun yerine sag tarafa ArrayList<>() yazariz

        sayilar.add(4);
        sayilar.add(5);

        System.out.println(sayilar); // [4, 5]
    }
}
