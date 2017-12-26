package java8.exercises.lambda;

import java.util.Arrays;
import java.util.List;

public class StreamsExample {

    public static void main(String[] args){
        List<Person> people = Arrays.asList(
                new Person("a", "aa", 1),
                new Person("b", "bb", 2),
                new Person("c", "cc", 3),
                new Person("d", "dd", 4)
        );
        people.stream()
                .filter(p->p.getFirstName().startsWith("c"))
                .forEach( p -> System.out.println(p.getFirstName()));

        System.out.println(people.stream().filter(p->p.getFirstName().startsWith("c")).count());

    }
}
