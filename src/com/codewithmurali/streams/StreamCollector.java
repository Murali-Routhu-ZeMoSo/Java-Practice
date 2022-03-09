package com.codewithmurali.streams;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamCollector {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("a",10),
                new Movie("b",20),
                new Movie("c",2)
        );
        Predicate<Movie> isPopular = m-> m.getLikes()>5;
        var list = movies.stream().filter(isPopular)
                .collect(Collectors.toList());
        var set = movies.stream().filter(isPopular).collect(Collectors.toSet());
        var map = movies.stream().filter(isPopular)
                .collect(Collectors.toMap(Movie::getTitle, Function.identity()));
        System.out.println(list);
        System.out.println(set);
        System.out.println(map);
        var sumLikes = movies.stream().filter(isPopular)
                .collect(Collectors.summarizingDouble(Movie::getLikes));
        System.out.println(sumLikes);
        var movieNames = movies.stream().filter(isPopular)
                .map(Movie::getTitle)
                .collect(Collectors.joining(", "));
        System.out.println(movieNames);
    }
}
