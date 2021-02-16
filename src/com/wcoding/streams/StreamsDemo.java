package com.wcoding.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {
    private static List<Movie> movies = List.of(
            new Movie("Street Kings", 10),
            new Movie("Lion King",10),
            new Movie("Peaceful Warrior", 31),
            new Movie("Gladiator", 10),
            new Movie("Warrior", 121)
    );

    public static void show(){

        // Imperative Programming
        int count = 0;
        for(Movie movie : movies){
            if(movie.getLikes() > 10)
                count++;
        }

        //Declarative (Functional) Programming
        long movieCount = movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .count();
        System.out.println(movieCount);
    }

    //Array Stream Demo
    public static void ArrayStreamDemo(){
        int[] numbers = {1,23,34,56};
        Arrays.stream(numbers)
                .forEach(System.out::println);
    }

    //Infinite stream generation
    public static void InfiniteStreamDemo(){
        //First way
        Stream stream = Stream.generate(Math::random);
        stream.limit(10)
                .forEach(System.out::println);

        //Second way
        Stream.iterate(1, n -> n+1)
                .limit(10)
                .forEach(System.out::println);
    }

    //Map functional interface demo
    public static void MapStreamDemo(){

        movies.stream()
                .map(movie -> movie.getName())
                .forEach(title -> System.out.println(title));
    }

    // Slicing streams
    // limit(n) -> limits the collection for a given number
    // skip(n) -> skips the number of elements in the collection
    // takeWhile(predicate) -> takes the element from the collection until the condition is met
    // dropWhile(predicate) -> drops the element from the collection until the condition is met

    public static void SlicingStreamsDemo(){
        movies.stream()
                .limit(2)
                .forEach(m-> System.out.println(m.getName()));

        movies.stream()
                .skip(1)
                .forEach(m -> System.out.println(m.getName()));

        movies.stream()
                .dropWhile(m -> m.getLikes() < 30)
                .forEach(m -> System.out.println(m.getName()));

    }

    // Get unique elements from the stream
    public static void GetUniqueElements (){
        movies.stream()
                .map(Movie::getLikes)
                .distinct()
                .forEach(System.out::println);
    }

    // Reducing streams

    // count() -> counts the number of elements in the stream
    // anyMatch() -> returns boolean if any element in the collection match the predicate
    // allMatch() -> returns boolean if all elements in the collection match the predicate
    // noneMatch(predicate) -> returns boolean if none in the collection match the predicate

    // findFirst() -> returns the first element in the stream that matches the predicate
    // findAny() -> returns the element in any order that matches the predicate

    // max(comparator) ->
    // min(comparator) ->
}
