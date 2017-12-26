package java8.exercises.lambda;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {

    public static void main(String[] args){
        List<Person> people = Arrays.asList(
                new Person("a", "aa", 1),
                new Person("b", "bb", 2),
                new Person("c", "cc", 3),
                new Person("d", "dd", 4)
        );

        people.forEach(p->System.out.println(p));

        people.forEach(System.out::println);
    }

}
