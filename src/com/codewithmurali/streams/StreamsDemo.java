package com.codewithmurali.streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("a",10),
                new Movie("b",20),
                new Movie("c",2)
        );

        int count =0; //Imperative Programming how to count the movies > 10
        for(var movie : movies){
            if(movie.getLikes()>=10){
                count++;
            }
        }
        //functional programming what to count(declarative)
        var count2 = movies.stream().filter(movie -> movie.getLikes()>=10).count();
        System.out.println(count2+count);
        movies.stream()
                .map(movie ->movie.getTitle() )
                .forEach(name -> System.out.println(name));
    }
}
