package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Taceddin");
        System.out.println("names = " + names);


        List<String> cities = new ArrayList<>();
        cities.add("Trump");
        cities.add("Tom");
        cities.add("Taceddin");


        names.removeAll(cities);//removeAll kulandiginizda sadece ilk list degisir,parantezin icindeki list degismez.
        System.out.println(names);//Thomas,Tahsin
        System.out.println(cities);//Trump,Tom,Taceddin

        List<String> myNames = new ArrayList<>();

        myNames.add("Thomas");
        myNames.add("Tahsine");


        boolean sonuc = names.containsAll(myNames);//Bir listin icinde coklu elemanlarin var olup olmadigini kontrol eder.
        //Hepsi varsa true en az biri yoksa false verir.
        System.out.println("sonuc = " + sonuc);//true

        //Example 1 : "a" Listinde "Shoes" elemaninin ilk gorunumunu siliniz.

        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");

        a.remove("Shoes");
        System.out.println(a);//[TV, Radio, Laptop, Shoes, Book, Shoes]

        //Example 2 : "a" Listinde "Shoes" elemaninin tum gorunumlerini siliniz.
        List<String> silinecekler = new ArrayList<>();

        silinecekler.add("Shoes");
        a.removeAll(silinecekler);
        System.out.println(a);//[TV, Radio, Laptop, Book]


        //Example 3 : Bir tane salary listi olusturun,
        // eger salary 10000den az ise %20 10000den cok ise %10 zam yapiniz.

        List<Double> salary = new ArrayList<>();

        salary.add(12345.00);
        salary.add(8674.50);
        salary.add(15000.75);
        salary.add(9500.00);
        salary.add(20500.00);
        System.out.println(salary);

        for (Double w : salary) {

            if (w < 10000) {
                salary.set(salary.indexOf(w), w * 1.2);

            } else {

                salary.set(salary.indexOf(w), w * 1.1);
            }
        }

        System.out.println(salary);

        //Example 4 : Iki ArrayListin esit olup olmadigini kontrol eden kodu yaziniz.
        //Iki ArrayListin esit olabilmesi icin elemanlar esit olmali ayni elemanlar ayni indexte olmali
        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');
        m.add('t');

        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');

        //1.Yol:

        int counter = 0;

        for (int i = 0; i < m.size(); i++) {

            if (m.size() != n.size()) {
                counter++;
                System.out.println("Listler esit degildir");
                break;
            } else if (m.get(i) != n.get(i)) {
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("Listler esittir");
        }

        //2.Yol:
        boolean esitMi = m.equals(n);

        if (esitMi) {
            System.out.println("Listler esittir");
        } else {
            System.out.println("Listler esit degildir");
        }


    }
}






