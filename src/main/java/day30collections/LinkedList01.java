package day30collections;

import java.util.LinkedList;

public class LinkedList01 {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("Chris");
        names.add("Alexandre");
        names.add("Mark");
        names.add("Tom");
        names.add("Jeremy");
        names.add("Hans");
        System.out.println(names);//[Chris, Alexandre, Mark, Tom, Jeremy, Hans]

        String firstEl = names.peek();//ilk elemani gosterir fakat silmez List bossa null verir.
        System.out.println(firstEl);//Chris

        System.out.println(names);

        LinkedList<String> myList = new LinkedList<>();

        String first = myList.peek();
        System.out.println(first);//null

        names.poll();//Listin ilk elemanini verir bossa null verir.

        String  f = names.element();//ilk elemani verir,silmez bos oldugunda exception atar.
        System.out.println(f);//Alexandre
        System.out.println(names);//[Alexandre, Mark, Tom, Jeremy, Hans]

        //Example 1 : "A ile baslayan tum isimleri "*****" e ceviriniz.

        LinkedList<String> students = new LinkedList<>();

        students.add("Chris");
        students.add("Alexandre");
        students.add("Mark");
        students.add("Tom");
        students.add("Jeremy");
        students.add("Hans");

        for(String w : students){

            if(w.startsWith("A")){
                students.set(students.indexOf(w),"*****");
            }
        }
        System.out.println(students);//[Chris, *****, Mark, Tom, Jeremy, Hans]

        //Interwiew sorusu:
        //Example 2 : Listteki 4 harften cok harf iceren isimleri siliniz.

        for (int i = 0; i < students.size() ; i++) {

            if(students.get(i).length()>4){
                students.remove(students.get(i));

                i--;
            }

        }
        System.out.println(students);
}
}

