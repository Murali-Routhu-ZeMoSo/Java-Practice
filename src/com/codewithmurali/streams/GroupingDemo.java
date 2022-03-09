package com.codewithmurali.streams;

import java.util.List;
import java.util.stream.Collectors;

public class GroupingDemo {
    public static void main(String[] args) {
        List<MovieWithGenre> movies = List.of(
                new MovieWithGenre("a",10,Genre.THRILLER),
                new MovieWithGenre("b",20,Genre.ACTION),
                new MovieWithGenre("c",2,Genre.ACTION)
        );
        System.out.println(movies.stream().collect(Collectors
                .groupingBy(MovieWithGenre::getGenre,
                        Collectors.mapping(
                                MovieWithGenre::getTitle,Collectors.joining(", ")
                        ))));
    }
}
