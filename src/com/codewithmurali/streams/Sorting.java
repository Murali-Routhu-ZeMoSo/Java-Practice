package com.codewithmurali.streams;

import java.util.Comparator;
import java.util.List;

public class Sorting {


    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("b",10),
                new Movie("a",20),
                new Movie("c",2)
        );
        movies.stream()
//                .sorted((a,b)->b.getTitle().compareTo(a.getTitle()))
                .sorted(Comparator.comparing(Movie::getTitle).reversed())
                .forEach(m-> System.out.println(m.getTitle()));
    }
}
