package com.sda.rares.advanced.collections.map.ex1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ##### Collections MAP Exercise 1
 *
 * Create a map and display its result (data should be provided by the user - console):
 * - Names and surnames
 * - Names and ages.
 * - Names and lists of friends (other names).
 */
public class Main {
    public static void main(String[] args) {
        Map<String, String> surnamesByName  = new HashMap<>();
        surnamesByName.put("mihai","creanga");
        surnamesByName.put("rares", "colf");
        surnamesByName.put("1","2");

        for(Map.Entry<String, String> entry :surnamesByName.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        Map<String, Integer> ageByname = new HashMap<>();
        ageByname.put("mihai", 20);
        ageByname.put("rares", 34);
        ageByname.put("claudiu", 40);

        for (Integer age : ageByname.values()){
            System.out.println(age);
        }

        Map<String, List<String>> friendsByName = new HashMap<>();
//        friendsByName.put("mihai", List.of("alex","bogdan"));
//        friendsByName.put("rares", List.of("mihai", "bogdan"));

        for(String name : friendsByName.keySet()){
            System.out.println(name + " " + friendsByName.get(name));
        }

    }
}
