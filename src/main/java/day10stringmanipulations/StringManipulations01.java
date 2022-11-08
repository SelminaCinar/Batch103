package day10stringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {

        String a = "Java kolaydir";

        //startsWith("kola", 5) kodu ilk 5 karakter'den sonraki String'e bakar ve o String'in "kola" ile baslayip baslamadigini kontrol eder.
        //"kola" ile basliyorsa "true", baslamiyorsa "false" return eder.
        boolean b = a.startsWith("va", 2);
        System.out.println("b = " + b);

        //replaceFirst("a", "*"); kod String deki ilk "a" yi "*" e cevirir.
        //replace("a", "*"); kod String deki tum "a" lari "*" e cevirir.
        String c = a.replaceFirst("a", "*");
        System.out.println("c = " + c);
        //concat() methodu iki tane Stringi birbirine yapıştırmaya yarar.
        //Concatenation işlemi iki türlü yapılabilir; i)+ ile yapılabilir ii)concat() ile yapılır.
        //Java bir işlem için method üretmişse o methodu kullanmak "best practice"dir.
        String d = a.concat(" Anladin mi?");
        System.out.println("d = " + d);
        String e = "   Tom Hanks   ";
        System.out.println("e = " + e);
        //trim() methodu bir Stringin baş ve sonundaki space karakterlerini siler,
        //aradaki "space" karakterlerine dokunmaz.

        String f = e.trim();
        System.out.println("f = " + f);
        
        //compare.To() kodu iki tane Stringi alfabetik(lexicographic)olarak karsilastirir.
        //Büyük harf kucuk harfe duyarlidir.
        //Buyuk harf kucuk harfe duyarlı olmasını istemiyorsan compareToIgnoreCase kullanabilirsin.
        //Bu kodda "h'nin alfabetik sırasından i'nin alfabetik sırası çıkarılır.
        String h = "Java";
        String i = "java";
        int k = h.compareTo(i);
        System.out.println("k = " + k);

        //repeat(5) kodu a stringini yanyana 5 kere yazar.
        //repeat(0) empty String return eder.
        //Windows ==> ctrl e basili tutun.
        String n = a.repeat(5);
        System.out.println("n = " + n);




    }
}
