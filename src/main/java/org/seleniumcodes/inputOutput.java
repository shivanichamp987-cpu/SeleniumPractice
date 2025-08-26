package org.seleniumcodes;

import java.util.HashMap;

public class inputOutput {

    public static void main(String[] args) throws InterruptedException {

        // input = "aabbbccdd" , output = "llkkjjjmmnn"

        String input = "aabbbccdd";
        StringBuffer output = new StringBuffer();

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : input.toCharArray()) {

        map.put(ch, map.getOrDefault(ch,0)+1);
        }
    for(char key : map.keySet()){
        output.append(key);
        output.append(map.get(key));


    }
System.out.println("input = "+input+"\nOutput = "+output);

    }

}
