package com.codewithmurali.streams;

import java.util.List;

public class PeekAndUnique {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("b",10),
                new Movie("a",10),
                new Movie("c",2)
        );
        movies.stream().map(m->m.getLikes()).distinct().forEach(System.out::println);
        movies.stream().filter(m->m.getLikes()>5).peek(m-> System.out.println("filtered "+ m.getTitle()))
                .map(Movie::getTitle).peek(t->System.out.println("mapped "+t))
                .forEach(System.out::println);
    }
}
