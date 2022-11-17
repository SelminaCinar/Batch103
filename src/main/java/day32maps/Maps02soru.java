package day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class Maps02soru {

    public static void main(String[] args) {

        //Size verilen bir kelimede kullanilan harflerin kacar kere kullanildigini gosteren kodu yaziniz.
        //abbcaa==> a=3 b=2 c=1

        String kelime = "abbcca";
        HashMap<String ,Integer> gorunum = new HashMap<>();

        String[] harfler = kelime.split("");
        System.out.println(Arrays.toString(harfler));//[a, b, b, c, c, a]

        for (String w: harfler) {
            Integer gorunumSayisi =gorunum.get(w);

            if (gorunumSayisi==null){
                gorunum.put(w,1);
            }else{
                gorunum.put(w,gorunumSayisi+1);
            }

        }
        System.out.println(gorunum);

    }
}
