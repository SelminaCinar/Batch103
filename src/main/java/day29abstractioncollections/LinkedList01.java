package day29abstractioncollections;

import java.util.LinkedList;

public class LinkedList01 {

    /*
    1)LinkedListteki her eleman iki bolumden olusur. i)Data ii)Pointer
    2)LinkedListteki her bir eleman "Node" olarak adlandirilir.
    3)LinkedList'ler eleman ekleme ve silme islemlerinde cok basarilidirlar.
    4)LinkedList'ler eleman arama islemlerinde basarisizdirlar.
    5)3. ve 4. maddelerden dolayi eleman ekleme ve silme islemlerinin cok yapilacagi durumlarda LinkedList kullanilmalidir.
    6)ArrayList'ler index kullanir,LinkedListler index kullanmaz.
    7)Index kullanmak eleman bulan islemlerde cok basarilidir.Bu yuzden eleman bulma islemlerini cok yapacaksaniz ArrayList kullanmalisiniz.

     */

    public static void main(String[] args) {

        LinkedList<String> visitors = new LinkedList<>();
        visitors.add("Tom");
        visitors.add("Hanks");
        visitors.add("Tom Hanks");
        visitors.add("Brad");
        visitors.add("Pitt");
        visitors.add("Brad Pitt");
        visitors.add(2,"Angelina Jolie");
        visitors.add("Brad Pitt");
        visitors.add("Tom Hanks");

        System.out.println(visitors);//[Tom, Hanks, Tom Hanks, Brad, Pitt, Brad Pitt]

        //addListler ekleme ve silme islemlerinde cok basarili olduklarindan ekleme ve silme ile alakali cok fazla method icerir.
        visitors.addLast("Ajda Pekkan");
        visitors.addFirst("Cuneyt Arkin");
        System.out.println(visitors);
        //[Cuneyt Arkin, Tom, Hanks, Angelina Jolie, Tom Hanks, Brad, Pitt, Brad Pitt, Ajda Pekkan]

        visitors.removeLast();
        System.out.println(visitors);
        //[Cuneyt Arkin, Tom, Hanks, Angelina Jolie, Tom Hanks, Brad, Pitt, Brad Pitt]

        visitors.removeFirst();
        System.out.println(visitors);
        //[Tom, Hanks, Angelina Jolie, Tom Hanks, Brad, Pitt, Brad Pitt, Ajda Pekkan]

        visitors.removeFirstOccurrence("Tom Hanks");
        System.out.println(visitors);
        //[Tom, Hanks, Angelina Jolie, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]

        visitors.removeLastOccurrence("Brad Pitt");
        System.out.println(visitors);
        //[Tom, Hanks, Angelina Jolie, Brad, Pitt, Brad Pitt, Tom Hanks]

        String firstEl = visitors.pop();//---> Cut++Paste ==>Ctrl+X
        System.out.println(firstEl);//Tom
        System.out.println(visitors);
        //[Hanks, Angelina Jolie, Brad, Pitt, Brad Pitt, Tom Hanks]

        LinkedList<String> myList = new LinkedList<>();

      //  myList.pop();//NoSuchElementException atti cunku LinkedList bos



    }

}
