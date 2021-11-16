package com.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MaxRepeatCharacter {

    static char characterCount(String inputString) {

        HashMap<Character, Integer> map = new HashMap<>();
        char[] charsStr = inputString.toCharArray();
        int max = 0;

        for (char c : charsStr) {
            if (map.containsKey(c))
                map.put(c, map.get(c) + 1);
            else
                map.put(c, 1);
        }

        int maxCount = 0;
        char maxChar = 0;


        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }
        System.out.println(maxChar + " " + maxCount);

        return maxChar;
    }

    public static void main(String[] args) {
        String str = "helloohellooo";
        characterCount(str);
    }
}
