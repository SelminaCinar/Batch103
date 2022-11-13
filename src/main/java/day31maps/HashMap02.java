package day31maps;

import java.util.HashMap;

public class HashMap02 {

    /*
    1)Siz HashMap<String,Double> salaries = new HashMap<>(); bu kodu yazdiginizda Java memory'de 16 kutu(bucket) iceren bir yapi
    bu yapidaki her bir kutuya index verir. Index'ler 0 dan 15e kadardir.
    2)Siz salaries.put("QA",110000.00); kodunu yazdiginizda Java,key icin bir HashCode olusturur bu HashCode'u 15e boler ve
    kalani index olarak kullanir ve bu elemani indexe yerlestirir.
    3)Yerlestirirken 4'lu bir yapi olusturur,bu yapinin ilk bolumune "HashCode"u ikinci bolumune "Key"i ucuncu bolumune "pointer"
    koyar.Bu cok bolumlu yapi LinkedList'teki "Node"dur.Yani HashMap, bucket'lara koyduğu data'yı LinkedList olarak depolar.
    4)Java "null" icin hep HashCode "zero" uretir, o yuzden key null oldugunda eleman ilk bucket'a yerlestirilir.Bundan dolayi
    key'si null olan elemanlar map'in icinde genellikle ilk sirada gozukurler.
    5)Java normalde HashCode'lari unique yapar ama bazen trafik kazasi gibi farkli iki eleman icin ayni
    HashCode uretilebilir.Buna "Hash Collision" denir.

     */

    public static void main(String[] args) {

        HashMap<String,Double> salaries = new HashMap<>();

        salaries.put("QA",110000.00);

        salaries.put("Dev",130000.00);

        salaries.put("Salesforce" , 125000.00);
    }
}
