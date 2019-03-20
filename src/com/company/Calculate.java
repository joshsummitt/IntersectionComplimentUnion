package com.company;

import java.util.HashSet;
import java.util.Set;

public class Calculate
{
    public static Set<Integer> calculateIntersection(Set<Integer> fileOne, Set<Integer> fileTwo)
    {
        Set<Integer> intersection = new HashSet<>();
        intersection.addAll(fileOne);
        intersection.retainAll(fileTwo);

        return intersection;
    }

    public static Set<Integer> calculateCompliment(Set<Integer> fileOne, Set<Integer> fileTwo)
    {
        Set<Integer> compliment = new HashSet<>();
        compliment.addAll(fileTwo);
        compliment.removeAll(fileOne);
        return compliment;
    }

    public static Set<Integer> calculateUnion(Set<Integer> fileOne, Set<Integer> fileTwo)
    {
        Set<Integer> union = new HashSet<>();
        union.addAll(fileOne);
        union.addAll(fileTwo);

        return union;
    }
}
