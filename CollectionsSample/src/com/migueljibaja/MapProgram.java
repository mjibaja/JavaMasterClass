package com.migueljibaja;
import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "a compiled high level, object-oriented, platform independant language");
            System.out.println("Java added");
        }

        languages.put("Python", "an interpreted, object-oriented, high level programming language with dynamic semantics");
        languages.put("Algol" , "an algorithmic language");
        languages.put("BASIC", "Beginners All Purpose Symbolic Instruction Code");
        languages.put("Lisp", "Therein lies madness");

        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java" , "this course is ok");
        }

        languages.remove("Lisp");
        if (languages.remove("Algol", "cualquier cosa")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed");
        }

        System.out.println("=========================================================");
        for(String key: languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
