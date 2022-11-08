package day16multidimensionalarraysarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    /*
    ArrayListler ayni data tipine sahip birden fazla datayı depolamak icin kulanilir.
    Array ile ArrayListin farki nedir?
    1)Array olustururken Arrayin icine kac tane eleman koymamiz gerektigini soylemeliyiz,
    soyledigimiz eleman sayisindan fazla eleman koyamayız.
    Arrayler eleman sayisinda "fixed" dirler.

    ArrayListleri olustururken eleman sayisi soylemeye gerek yok cunku ArrayListler eleman sayisinda "flexible" dirlar.
    2)Arraylerin icine "primitive ve reference" konabilir
      ArrayListlerin icine ise sadece "non primitive" konur.
    3)Arrayler super fasttir.
      Arrayler memoryi cok az kullanilir.
      Note : Eleman sayisi kesin belli olan çoklu datalari depolamak icin  Array kullaniriz
             ama eleman sayisi değişken olan coklu datalar icin Array kullanma riski almayın
     */

    public static void main(String[] args) {

        //ArrayList nasıl olusturulur ?
        //1.Yol
        ArrayList<Integer> ages = new ArrayList<Integer>();
        //2.Yol
        ArrayList<Integer> heights = new ArrayList<>();
        //3.Yol
        List<Integer> nums = new ArrayList<>();

        //ArrayListler nasıl yazdirilir?

        System.out.println(nums);//[]

        //ArrayListlere nasıl eleman eklenir ?
        //add() her zaman elemani en sona ekler.(İnsertion order)
        nums.add(21);
        nums.add(18);
        nums.add(20);
        System.out.println(nums);//[21,18,20]

        nums.add(1,50);
        System.out.println(nums);//[21,50,18,20]

        List<Integer> prices = new ArrayList<>();
        prices.add(23);
        prices.add(185);

        nums.addAll(prices);
        System.out.println(nums);//[21,50,18,20,23,185]
        System.out.println(prices);//[23,185]

        nums.addAll(2,prices);
        System.out.println(nums);//[21,50,23,185,20,23,185]

        //ArrayListlerin eleman sayisi nasıl bulunur.?
        //eleman sayisi için size() kullanmak gerekir.

       int elemanSayisi = nums.size();
        System.out.println(elemanSayisi);//8

        //ArrayListlerde herhangi bir eleman nasil secilir ?
        //get() methodu istenen bir indexteki elemani verir.

        int e1 =nums.get(3);
        System.out.println(e1);//185
        
        //ArrayListin bos olup olmadigini nasil anlariz?
        boolean bosMu =nums.isEmpty();
        System.out.println("bosMu = " + bosMu);//false

        boolean bosMu2 = ages.isEmpty();
        System.out.println(bosMu2);//true

        //ArrayListte bir eleman nasil degistirilir?

        nums.set(3,200);
        System.out.println(nums);//[21,50,23,200,18,20,23,185]

        //Example 1 : nums ArrayListindeki tum tek sayilari 11 artirdiktan sonra ekrana yazdiriniz.

        for(int w : nums){

            if(w%2!=0){

                nums.set(nums.indexOf(w), w+11);

            }
        }
        System.out.println(nums);//[21, 50, 23, 200, 18, 20, 23, 185]
                                 //[32, 50, 34, 200, 18, 20, 34, 196]

        //remove()methodunun icine tamsayi koyarsaniz Java onu index olarak kabul eder.

        //Example 2 : ArrayListten 34 elemaninin ilk gorunumunu siliniz.
        //Note 1 : Tum tamsayilar Java icin aksi soylenmedikce primitive'dir,yani int dir.
        //Note 2 : Primitiveler ArrayListlerin elemani olamazlar.
        //Note 3 : Primitive i Wrapper Classa cevirirseniz non primitive olur ve non primitiveler ArrayListlerin elemani olur index olmaz.

        Integer sayi = 34;
        nums.remove(sayi);
        System.out.println(nums);//[32, 50, 200, 18, 20, 34, 196]











































    }
}
