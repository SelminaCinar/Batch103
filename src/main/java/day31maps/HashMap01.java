package day31maps;

/*
    mapler; key-value structure'ini kullanirlar. mapler'de key kismi tekrarsiz (unique) data barindirir.
    value kismi ise; unique olmak zorunda degildir (non-unique). key kisminda "null" kullanilamaz. ancak value'larda
    "null" mumkundur.

    //metodun sol tarafina key, sag tarafina value denir.;Map ler key value kullanilir.
    //Maplar key value srtuctor ini kullanirlar.
    //Map lerde key kismi tekrarsiz data icerir(unique)
    // value kismi unique olmak zorunda degildir.
    //key lerde null kullanilamaz ama value lerde bu mumkundur.
    //value kisminda null kullanmak munknudur.
    //Null bir cok kere kullanilabilir.
    //coklu datalari depolarken ,bir tane deger depoluyorduk. Oysa burada iki deger var.(key,value)
    //  bu iki deger depolamaya entry demisler
    //mapler hakkinda konusurken eleman demeyin,map in 2 tane entry var deriz

    ******************

    1)Map'ler key-value structure kullanir.
    2)Key'ler uniquedir.
    3)Value'ler tekrarli data icerebilir.
    4)Map'lerde eleman degil EntrySet kullaniriz.
    5)Key'lerde null tekrarsiz kabul eder.
    6)Value'lar null kabul eder.
    7)HashMap'ler EntrySet'leri herhangi bir siralamaya tabi tutmaz'rastgele siralar.
    8)Siralama ile vakit jaybetmedigi icin HashMap'ler cok hizli calisirlar.
     */

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {

    public static void main(String[] args) {

        HashMap<String, Integer> studentAges = new HashMap<>();

        studentAges.put("Ali", 13);
        studentAges.put("Tom", 21);
        studentAges.put("Brad", 12);
        studentAges.put("Ajda", 76);
        studentAges.put("Cuneyt", 75);
        studentAges.put("Ali", 88);//Ayni key degerini tekrar kullandiginizda hata vermez "Overwrite" yapar.
        studentAges.put(null, 55);
        studentAges.put(null, 66);
        studentAges.put("Ayhan Isik", null);
        studentAges.put("Sadri Alisik", null);

        System.out.println(studentAges);//{Tom=21, Ajda=76, Brad=12, Cuneyt=75, Ali=13}
        // {Tom=21, Ajda=76, Brad=12, Cuneyt=75, Ali=88}

        //Map'ten sadece key'ler nasil alinir?

        Set<String> keys = studentAges.keySet();
        System.out.println(keys);//[null, Ayhan Isik, Sadri Alisik, Tom, Ajda, Brad, Cuneyt, Ali]

        //Mapten sadece value nasil alinir?
        Collection<Integer> values = studentAges.values();
        System.out.println(values);//[66, null, null, 21, 76, 12, 75, 88]

        //Belli bir key'e ait value nasil alinir?

        Integer cuneytAge = studentAges.get("Cuneyt");
        System.out.println(cuneytAge);//75

        //Example 1: Tum Integer yaslarin ortalamasini hesaplayan kodu yaziniz.

        Collection<Integer> ages = studentAges.values();
        Integer sum = 0;
        int counter = 0;
        for (Integer w : ages) {

            if (w != null) {
                sum = sum + w;
                counter++;
            }
        }
        System.out.println("Ortalama yas: " + (sum / counter));//Ortalama yas: 56


        //Example 2:A ile baslamayan isimlerin icerdigi toplam karakter sayisini bulan kodu yaziniz.
        Set<String> names = studentAges.keySet();

        int sum1 = 0;


        for (String w : names) {

            if (w != null && !w.startsWith("A")) {

                sum1 += w.length();

            }

        }
        System.out.println(sum1);//25

        //remove(Ajda ,76) key'si Ajda ve value'su 76 olan EntrySet i siler ve size
        boolean sonuc = studentAges.remove("Ajda", 76);
        System.out.println(sonuc);//true

        Integer result = studentAges.remove(null);
        System.out.println(result);

        //Key varsa value'yi ver key yoksa sizin istediginiz degeri verir.

        Integer result1 = studentAges.getOrDefault("Brad", 0);
        System.out.println(result1);//12

        //Value null ise ekleme yapar,value null degilse ekleme yapmaz.

        Integer result2 = studentAges.putIfAbsent("Brad", 100);
        System.out.println(result2);//12

        Integer result3 = studentAges.putIfAbsent("Acun Ilicali", 200);
        System.out.println(result3);//12
        System.out.println(studentAges);

        //replace() methodu value'lari degistirmek icin kullanilir.

        studentAges.replace("Acun Ilicali", 49);
        System.out.println(studentAges);

        //replace() methodu value'lari key ve value'yu kontrol ettikten sonra degistirmek icin kullanilir.


        studentAges.replace("Acun Ilicali", 49, 53);
        System.out.println(studentAges);

        //Example 3 : Map'teki her bir entry'yi ekrana farkli bir satirda olacak sekilde yazdiriniz.

        //entrySet() methodu mapteki elamanlari bir Set'in icine koyarak size verir.
        Set<Map.Entry<String, Integer>> entries = studentAges.entrySet();

        for (Map.Entry<String, Integer> w : entries) {

            System.out.println(w);
        }
           /*
             Ayhan Isik=null
             Sadri Alisik=null
             Tom=21
             Brad=12
             Cuneyt=75
             Acun Ilicali=53
             Ali=88
 */

    }
}
