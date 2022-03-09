package com.codewithmurali.streams;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Reducers {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("a",10),
                new Movie("b",20),
                new Movie("c",2)
        );
        Predicate<Movie> isPopular = m-> m.getLikes()>10;
        var anyMatch = movies.stream().anyMatch(isPopular);
        var allMatch = movies.stream().allMatch(isPopular);
        var noMatch = movies.stream().noneMatch(isPopular);
        System.out.println(anyMatch);
        System.out.println(allMatch);
        System.out.println(noMatch);
        var first = movies.stream().findFirst().orElse(new Movie("a",10));
        var any = movies.stream().findAny().orElse(new Movie("a",10));
        var max = movies.stream().max(Comparator.comparing(Movie::getLikes)).orElse(new Movie("a",10));
        var min = movies.stream().min(Comparator.comparing(Movie::getLikes)).orElse(new Movie("a",10));

        try{
            System.out.println(first.getTitle());
            System.out.println(any.getTitle());
            System.out.println(max.getTitle());
            System.out.println(min.getTitle());
        }catch (NullPointerException ne){
            System.out.println(ne.getMessage());
        }

        var sum = movies.stream().map(Movie::getLikes).reduce(0,(a,b)->a+b);
        var sum2 = movies.stream().map(Movie::getLikes).reduce(Integer::sum);
        System.out.println(sum);
        System.out.println(sum2.orElse(0));
    }
}
