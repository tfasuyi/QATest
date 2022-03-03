package com.exercise;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        VowelCounter counter = new VowelCounter();
        List<CountResult> results = counter.getVowelListWithCount(new String[]{"do", "s","hello"});
        System.out.println(results);
    }
}
