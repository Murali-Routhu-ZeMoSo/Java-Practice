package com.codewithmurali.streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Slicing {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("a",10),
                new Movie("b",20),
                new Movie("c",2)
        );
       movies.stream().limit(2).forEach(m-> System.out.println(m.getTitle()));
       movies.stream().skip(2).forEach(m-> System.out.println(m.getTitle()));
       movies.stream().takeWhile(m->m.getLikes()<20).forEach(movie -> System.out.println(movie.getTitle()));
       movies.stream().dropWhile(m->m.getLikes()<20).forEach(movie -> System.out.println(movie.getTitle()));
    }
}
