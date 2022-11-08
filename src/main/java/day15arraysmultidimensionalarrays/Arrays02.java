package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        //Example 1:Size verilen pozitif ve negatif sayilar iceren bir integer arraydeki
        // "en buyuk negatif" ve "en kucuk pozitif elemani bulunuz.

        int arr[] = {-12, 18, -5, 23, -2, 0};

        Arrays.sort(arr);

        int maxNegative = arr[0];
        int minPozitif = arr[arr.length - 1];

        for (int w : arr) {

            if (w < 0) {
                Math.max(maxNegative, w);
            }
            if (w > 0) {
               minPozitif= Math.min(minPozitif, w);
            }

        }
        System.out.println(maxNegative + " / " + minPozitif);


    }
}
