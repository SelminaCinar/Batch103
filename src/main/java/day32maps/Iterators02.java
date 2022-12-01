package day32maps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators02 {
        /*
    ListIterator da
    i)hasNext()
    ii)next()
    iii)set
    iv)hasPrevious
    v)previous
    remove
     */


    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");

        //Example 1: Iterators kullanarak list elemanlarini tersten consola yazdiriniz.

        ListIterator<String> itr = myList.listIterator();

        //hashNext() methodu pointer dan sonra eleman varsa true yoksa false dondürür
//next()methodu ise pointeri bir sonraki elemanin onune koyar ve ustunden tladigi elemani return eder
        while (itr.hasNext()){

            itr.next();
        }

        //hasPrevious() method'u pointer önce eleman varsa "true", yoksa "false" return eder.
        //previous() method'u pointer'ı bir önceki elemanın sonuna koyar ve üstünden atladığı elemanı return eder.
        while (itr.hasPrevious()){
          String el=  itr.previous();
            System.out.println(el+" ");

        }

        //Example 2:Listteki tum elemanlari siliniz.

        while (itr.hasNext()){
            itr.next();
            itr.remove();
        }

        System.out.println(myList);


        /*
        Iteratorda i)hasNext ii)next() iii)remove methodlari vardier.
         */




        List<String> yourList = new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");

        Iterator<String> iterator = yourList.iterator();

        while (iterator.hasNext()){
            String el= iterator.next();
            System.out.println(el);
        }





    }





}
