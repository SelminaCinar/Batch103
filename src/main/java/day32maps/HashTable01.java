package day32maps;

import java.util.Hashtable;

public class HashTable01 {

    /*
    1)HashTable bir map'tir.
    2)HashTable entrySetleri herhangi bir siralama yapmaz.
    3)HashTable ,HashMap'lerden daha yavastir.Cunku HashTable'ler thread-safe ve synchronized'dir.
    4)HashTable'larda key null olamaz.Key'i null yaparsaniz NullPointerExceptions atar.
    5)4)HashTable'larda value null olamaz.Value'i null yaparsaniz NullPointerExceptions atar.

      Note:toString methodu objelei console'da detaylari ile gorebilmek icin classlarin icinde olusturulur.
           bu methodu olusturmadan objeyi console'a yazdirirsaniz Java o objenin adresini yazdirir.
     */

    public static void main(String[] args) {

        Hashtable<String , Integer> countryPopulations = new Hashtable<>();

        countryPopulations.put("USA",400000000);
        countryPopulations.put("Germany",83000000);
        countryPopulations.put("Turkey",90000000);
        System.out.println(countryPopulations);

        //countryPopulations.put(null,9000000);
        //countryPopulations.put("France",null);

/*
        INTERWIEW QUESTIONS
        MAP'LER ARASINDAKI FARKLAR
        1) HashMap ve TreeMap ve LinkedHashMap  synchronized ve thread-safe degildir.
                HashTable synchronized ve thread-safe dir.

        2) Treemap'ler natürel order yapar.
        LinkedHashMap giriş sırasına göre listeler.
                HashMap ve Hashtable sıralama yapmaz,rastgele sıralar.

        3) HashMap ve LinkedHashMap'lerde hem key hemde value için null değeri kullanılabilir.
        TreeMap'lerde key'ler icin "null" kullanılmaz.
                HashTable larda ikisi içinde null kullanılmaz.
 */

        Hashtable<String,Students> myStudents = new Hashtable<>();

        myStudents.put("Math", new Students("Tom Hanks","th@gmail.com",21,true));

        System.out.println(myStudents);
        //{Math=[name='Tom Hanks', email='th@gmail.com', age=21, success=true]}

        String name = myStudents.get("Math").name;
        System.out.println(name);//Tom Hanks

        int age = myStudents.get("Math").age;
        System.out.println(age);//21
    }
}
