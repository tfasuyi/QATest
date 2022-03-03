package com.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VowelCounter {

    public List<CountResult> getVowelListWithCount(String[] args) {
        if (args.length >= 5) {
            System.out.println("Extra arguments passed.");
            return null;
        } else {
            List<String> argumentList = Arrays.asList(args);
            List<CountResult> vowelCount = new ArrayList<>();
            argumentList.forEach(argument -> vowelCount.add(new CountResult(argument, getVowelCount(argument))));
            return vowelCount;
        }
    }

    public String getConsonantListWithCount(String args) {
        if (args.length() >= 5) {
            System.out.println("Extra arguments passed.");
            return null;
        } else {
            String[] inputChar = args.split("");
            for (String value : inputChar) {
                if (value.matches("[bcdfghjklmnpqrstvwxyz]")) {
                    getCounsonantCount(args);

                }
            }
        }
        return "CountResult{" +
                "word='" + args + '\'' +
                ", consonantCount=" + getCounsonantCount(args) +
                '}';

    }

    public String getVowelAndConsonantListWithCount(String args) {
        if (args.length() >= 5) {
            System.out.println("Extra arguments passed.");
            return null;
        } else {
                String[] inputChar = args.split("");
                for (String value : inputChar) {
                    if (value.matches("[bcdfghjklmnpqrstvwxyz]")) {
                        getCounsonantCount(args);
                    } else if (value.matches("[aeiou]")) {
                        getVowelCount(value);

                    }

            }

        }
        return "CountResult{" +
                "word='" + args + '\'' +
                ", vowelCount=" + getVowelCount(args) +
                ", consonantCount=" + getCounsonantCount(args) +
                '}';
    }






    private Integer getVowelCount(String input) {
        String[] inputChars = input.split("");
        return (int) Arrays.stream(inputChars).filter(inputChar -> inputChar.matches("[aeiou]")).count();
    }

    private Integer getCounsonantCount(String input) {
        String[] inputChars = input.split("");
        return (int) Arrays.stream(inputChars).filter(inputChar -> inputChar.matches("[bcdfghjklmnpqrstvwxyz]")).count();
    }

}
