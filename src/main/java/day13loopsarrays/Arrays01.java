package day13loopsarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        /*
        Byte boolean short,int gibi ... containerlar iclerinde sadece tek bir deger barindirabilir.Ancak bazen coklu deger
        tasimasini istedigimiz containerlara ihtiyac duyariz.Buna Array denir.
        Icine yerlestirdigimiz Datalarin Data Type'i hep ayni olmalidir
        --Ayni data tipinde coklu datayi depolamak icin Javanin olusturdugu yapilar vardir.
        --Bu yapilardan biriside "Array"lerdir.
         */

        //Array nasıl olusturulur?
        int stdAges[] = new int[7];//[0,0,0,0,0,0,0]

        //Array nasıl yazdırılır ?
        System.out.println(Arrays.toString(stdAges));


        //Array'lere elemanlar nasil eklenir ?
        stdAges[0] = 12;
        stdAges[1] = 11;
        stdAges[2] = 13;
        stdAges[3] = 14;
        stdAges[4] = 10;
        stdAges[5] = 12;
        stdAges[6] = 12;
        System.out.println(Arrays.toString(stdAges));

        //Arraydeki herhangi bir elemani nasil yazdirabiliriz?

        System.out.println(stdAges[4]);

        //Example 1 : Arraydeki en kucuk ve en buyuk elemani ekrana yazdiriniz.
        //sort kucukten buyuge sıralar.
        Arrays.sort(stdAges);
        System.out.println(Arrays.toString(stdAges));

        int ilk = stdAges[0];

        //Note : length() şekilde Stringlerde kullanilir. Length Arraylerde kullanilir.
        int son = stdAges[stdAges.length - 1];

        System.out.println(ilk + son);

        //Example 2 :stdAges Arrayi icindeki tum elemanlarin toplamini yazdiran kodu yaziniz.

        //1.Yol : for loop
        int a = 0;
        int sum = 0;
        for (int i = 0,j=5; i < 3; i++,j+=5) {

            a += 5;
            sum = sum + stdAges[i];
        }
        System.out.println(sum);

        //2.Yol : while loop

        int sum1 = 0;
        int i = 0;

        while (i < stdAges.length) {
            sum1 = sum1 + stdAges[i];
            i++;
        }
        System.out.println(sum1);

        //3.Yol : do while loop

        int k = 0;
        int sum2 = 0;

        do {
            sum2 = sum2 + stdAges[k];
            k++;
        } while (k < stdAges.length);

        System.out.println(sum2);

        //4.Yol : for each loop Arraylerde ve Collections'larda kullanilir.

        int t = 0;
        for (int w : stdAges) {

            t = t + w;
        }
        System.out.println(t);

        //Example 3 : String bir Array olusturunuz.
        //            Bu Arraye 5 tane isim yerlestiriniz.
        //            Bu isimlerdeki karakter sayilarinin toplamini yazdiriniz.

        String stdNames[] = new String[5];
        stdNames[0] = "Ali";
        stdNames[1] = "Tom";
        stdNames[2] = "Veli";
        stdNames[3] = "Kemal";
        stdNames[4] = "Cem";

        int sum3 = 0;
        for (String w : stdNames) {
            sum3 = sum3 + w.length();
        }
        System.out.println(sum3);

        //Example 4 : Char bir array olusturunuz
        //            Bu array'e 5 eleman ekleyiniz.
        //            Bu arraydeki sadece buyuk harfleri yazdiriniz.

        char ch[] = {'A', 'c', 'D', 'k', 'm'};

        for (char w : ch) {

            if (w >= 'A' && w <= 'Z') {
                System.out.print(w);
            }
        }


    }
}
