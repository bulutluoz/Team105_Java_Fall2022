package ders43_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C01_Deque {

    public static void main(String[] args) {

        Deque<String> dq1= new LinkedList<>();

        dq1.add("K");
        dq1.add("B"); // [K, B]
        dq1.addLast("F"); // [K, B, F]
        dq1.addFirst("A"); // [A, K, B, F]

        System.out.println(dq1.getFirst()); // A
        System.out.println(dq1.getLast()); // F

        System.out.println(dq1.remove()); // A
        System.out.println(dq1.poll()); // K
        System.out.println(dq1.removeLast()); // F
        System.out.println(dq1.remove()); // B artik deque bos

        //dq1.remove(); // NoSuchElementException
        System.out.println(dq1.poll()); // null
        // bos deque olmasina ragmen exception firlatmaz, eleman silemadigi icin bize null döndürür

        dq1.add("K");
        dq1.add("B"); // [K, B]

        dq1.push("F"); //  [F, K, B]
        // deque'in basina element ekler
        // eger deque ile ilgili sinirlandirma varsa ve yer kalmamissa
        // illegalStateException verir

        System.out.println("pop : "+dq1.pop());  // F
        // F ilk elementi siler ve bize döndürür removeFirst() ile ayni islevi gorur

        System.out.println(dq1.element()); // K
        // ilk elementi silmeden bize dondurur. Bos deque'de calisirsa exception firlatir

        System.out.println(dq1.peek()); // K
        // ilk elementi silmeden bize dondurur. Bos deque'de calisirsa null döndürür
        System.out.println(dq1.peekFirst()); // K
        System.out.println(dq1.peekLast()); // B

        System.out.println(dq1.offer("C")); // true  liste ==> [K, B, C]
        System.out.println(dq1.offerFirst("M")); // true  liste ==> [M, K, B, C]



        System.out.println(dq1);
    }
}
