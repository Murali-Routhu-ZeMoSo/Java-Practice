package com.codewithmurali.streams;

import java.io.PrintStream;
import java.sql.ClientInfoStatus;
import java.util.List;
import java.util.stream.Stream;

public class Mapping {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("a",10),
                new Movie("b",20),
                new Movie("c",2)
        );

        movies.stream().map(m->m.getTitle()).forEach(title-> System.out.println(title));

        var s = Stream.of(List.of(1,2,3),List.of(4,5,6));
//        s.forEach(list-> System.out.println(list));
//        s.map(list -> list.stream()).forEach(num-> num.forEach(n -> System.out.println(n)));
        s.flatMap(list->list.stream()).forEach(num -> System.out.println(num));

    }
}
