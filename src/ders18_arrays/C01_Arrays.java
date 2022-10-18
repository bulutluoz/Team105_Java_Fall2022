package ders18_arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        int[] arr1 = {2,4,6,8,10};

        // array'in bir elementine ulasmak ve update etmek istersek

        System.out.println(arr1[2]); // 6

        arr1[3]=20;

        System.out.println(arr1[3]); // 20


        System.out.println(arr1.length); // 5

        // son elementi yazdirin
        System.out.println(arr1[arr1.length-1]); // 10


        // array'in tum elementlerini yazdirin

        for (int i = 0; i <arr1.length ; i++) {

            System.out.print(arr1[i] +" ");

        }


        // array'in uzunlugu sonradan degistirilemez
        // eger array'de olmayan bir index'e atama yapmak isterseniz
        // ArrayIndexOutOfBoundsException
        // bu hata Compile Time Error CTE degil
        // Run time error'dur

        // arr1[5]=35;
    }
}
