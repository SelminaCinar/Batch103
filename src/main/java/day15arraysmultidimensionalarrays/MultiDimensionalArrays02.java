package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays02 {

    public static void main(String[] args) {

        //MultiDimensional Array kısa yoldan nasıl olusturulur ?
        char arr[][] = {{'a', 'b'}, {'C', 'D', 'E'}, {'?'}};

        System.out.println(Arrays.deepToString(arr));//[[a, b], [C, D, E], [?]]

        //Example 1:Bir String multidimensional arrayde icinde "a" olan elemanlari konsola yazdiriniz.

        String brr[][] = {{"learn", "java", "it"}, {"is", "easy"}};

        for(String[] w : brr){

            for(String k : w){

                if(k.contains("a")){
                    System.out.println(k + " ");
                }
            }
        }

    }
}
