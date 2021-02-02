package com.javapractice;

import netscape.javascript.JSUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<String> someBingoNumbers = Arrays.asList(
                "N40", "N36", "B12", "B6",
                "G53", "G49", "G60", "G50", "g64",
                "I26", "I17", "I29", "O71");

        List<String> gNumbers = new ArrayList<>();

//        someBingoNumbers.forEach(number -> {
//            if(number.toUpperCase().startsWith("G")) {
//                gNumbers.add(number);
//            }
//        });
//
//        gNumbers.sort((String o1, String o2) ->  o1.compareTo(o2));
//        gNumbers.forEach((String s) -> System.out.println(s));

        someBingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .sorted()
                .forEach(System.out::println);

        Stream<String> ioNumberStream = Stream.of("I26", "I17", "I29", "O71");
        Stream<String> inNumberStream = Stream.of("N40", "N36", "I26", "I17", "I29", "O71");
        Stream<String> concatStream = Stream.concat(ioNumberStream, inNumberStream);
        System.out.println("-------------------------------");
        System.out.println(concatStream
                .distinct()
                .peek(System.out::println)
                .count());

        Runnable runnable = () -> {
            String myString = "asd sal dad klsad";
            String[] parts = myString.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };

        runnable.run();

        System.out.println(EverySecondCharacater(everySecondChar,"1234567890"));

        Supplier<String> iLoveJava = () -> "I love Java";

        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);

        List<String> topNames2015 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );

        topNames2015.stream()
                .map(s->s.substring(0,1).toUpperCase() + s.substring(1,s.length()))
                .peek(System.out::println)
                .sorted(String::compareTo)
                .collect(Collectors.toList());

//        long nanmesWithA = topNames2015.stream()
//                .map(s->s.substring(0,1).toUpperCase() + s.substring(1,s.length()))
//                .filter(s->s.startsWith("A"))
//                .count();
//
//        System.out.println("Number of names beginning with A : " + nanmesWithA);

//        topNames2015.stream()
//                .filter(s->s.startsWith("A"))
//                .count();



    }

    static Function<String,String> everySecondChar = s -> {
        StringBuilder returnVal = new StringBuilder();
        for (int i=0; i < s.length(); i++) {
            if (i % 2 == 1) {
                returnVal.append(s.charAt(i));
            }
        }
        return returnVal.toString();
    };


    public static String EverySecondCharacater(Function<String, String> func, String cad) {
        return func.apply(cad);
    }

}





