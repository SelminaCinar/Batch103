package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays02 {

    public static void main(String[] args) {

        // Example 1: [0, 2, 3, 0, 12, 0] put the zeros to the end(sifirlari sona koyunuz)
        //            [2, 3, 12, 0,  0,  0]

        int original[] = {0, 2, 3, 0, 12, 0};
        int yeni[] = new int[original.length];

        int idx = 0;

        for (int i = 0; i < original.length; i++) {

            if (original[i] != 0) {
                yeni[idx] = original[i];
                idx++;

            }

        }
        System.out.println(Arrays.toString(yeni));

        //Example 2 : Bir Arrayin icinde herhangi bir elemanın olup olmadigini ve kac kere tekrarlandigini gosteren kontrol eden kodu yaziniz.
        //            [2,1,2,-3,2]==> Kullanici 2yi sordu : 2 elemani var ve 3 kere tekrarlandi.


        int arr[] = {2, 1, 2, -3, 2};

        int eleman = 2;

        int counter = 0;//"flag" : Bazi durumlarin olup olmadigini kontrol etmek icin flag kullanilir

        for (int w : arr) {

            if (w == eleman) {
                counter++;

            }
        }
        if (counter > 0) {
            System.out.println(eleman + " array'de " + counter + " defa var ");
        } else {
            System.out.println(eleman + " array'de yok");
        }

        //Example 3 : Size verilen bir cumledeki en uzun kelimeyi bulan kodu yaziniz.
        //           "Java kolaydir calisana,ne kolay ki calismayana"

        String sentence = "Java kolaydir calisana, ne kolay ki calismayana.";
        System.out.println(sentence);

        sentence = sentence.replaceAll("\\p{Punct}", "");
        System.out.println(sentence);

        String words[] = sentence.split(" ");

        Arrays.sort(words, Comparator.comparingInt(String::length));


        System.out.println(Arrays.toString(words));

        System.out.println(words[words.length-1]);


    }
}
