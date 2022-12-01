package day32maps;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");

        //for each loop kullanarak her elemanin sonuna ! ekleyiniz.
   // Note:Loop'lar kendi baslarina collection'lari update edemezler.
        //Bu yuzden Java iterator'leri olusturdu.
        //Iterator'lar Collectionlari update etmek icin kullanilir.
        for (String w : myList) {
            w = w+"!";

        }
        System.out.println(myList);

        ListIterator<String> itr = myList.listIterator();

        while (itr.hasNext()){
            String el = itr.next();
            itr.set(el + "!");
        }
        System.out.println(myList);//[Z!, K!, A!, J!, M!]
    }
}
