package com.codewithmurali.streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilteringAndCreating {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("a",10),
                new Movie("b",20),
                new Movie("c",2)
        );
        Stream.generate(()->Math.random()).limit(10).skip(4).forEach((n)-> System.out.println(n));
        Stream.iterate(2,i->i+2).skip(4).limit(10).forEach(n-> System.out.println(n));
        Predicate<Movie> isPopular = movie -> movie.getLikes() > 10;
        movies.stream().filter(isPopular).forEach(movie -> System.out.println(movie.getTitle()));
    }
}
