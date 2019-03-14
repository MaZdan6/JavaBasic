package org.zdanek.org.zdanek.utils;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class UTF8PolishCharConverter {



    public static void main(String[] args){
        String input="Organ, na żądanie którego została dokonana Blokada Rachunku, Blokada środków na Rachunku lub organ egzekucyjny, który dokonał Zajęcia wierzytelności z Rachunku.";
        System.out.println(input);
        String output= convertPolishCharsToUTF8(input);

        System.out.println("======");
        System.out.println(output);
    }


    private static HashMap<String,String> map;

    private static String convertPolishCharsToUTF8(String input) {
        map= getCodeMap();
        //map.entrySet().stream().forEach(character -> System.out.println(character));
        StringBuilder builder=new StringBuilder(input);

        for (Map.Entry<String, String> character : map.entrySet()) {
            input=StringUtils.replace(input,character.getKey(), character.getValue());
        }

        return input;
    }

    private static HashMap<String, String> getCodeMap() {
        map= new HashMap<String,String>();
        map.put("ą","\\u0105");
        map.put("ć","\\u0107");
        map.put("ę","\\u0119");
        map.put("ł","\\u0142");
        map.put("ń","\\u0144");
        map.put("ó","\\u00F3");
        map.put("ś","\\u015B");
        map.put("ź","\\u017A");
        map.put("ż","\\u017C");
        map.put("Ą","\\u0104");
        map.put("Ć","\\u0106");
        map.put("Ę","\\u0118");
        map.put("Ł","\\u0141");
        map.put("Ń","\\u0143");
        map.put("Ó","\\u00D3");
        map.put("Ś","\\u015A");
        map.put("Ź","\\u0179");
        map.put("Ż","\\u017B");
        map.put("„","\\u201E");
        map.put("”","\\u201D");
        return map;
    }


}
