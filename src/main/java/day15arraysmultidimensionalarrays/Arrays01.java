package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        //binarySearch() Method:Bu methodu kullanarak bir elemanın Array'de olup olmadigini anlariz.
        // Bu methodu kullanmadan önce mutlaka Arrays.sort kullanılmalıdır.
        //binarySearch methodu aradiginiz eleman Arrayde varsa o elemanin indexini return eder.
        //binarySearch methodu aradiginiz eleman Arrayde yoksa "-a" şeklinde bir negatif sayi alirsiniz.
        //Bu sayidaki "-" isaretinin anlami bu eleman Arrayde yok demektir "a"nin anlamı olsaydi kacinci sırada olurdu demektir.

        //NOT:binarySearch methodu tekrarlayan elemanlar icin kullanilmaz.

        int arr[] = {12, 31, 43, 14};

        int sayi1 = 43;

        Arrays.sort(arr);//[12,14,31,43]

        int idx1 = Arrays.binarySearch(arr, sayi1);
        System.out.println("idx1 = " + idx1);//3

        int sayi2 = 58;
        int sonuc = Arrays.binarySearch(arr, sayi2);
        System.out.println(sonuc);


    }
}
