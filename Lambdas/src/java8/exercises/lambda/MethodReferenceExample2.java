package java8.exercises.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("a", "aa", 1),
                new Person("b", "bb", 2),
                new Person("c", "cc", 3),
                new Person("d", "dd", 4)
        );

        //print the list
        PeformOnCondition(people,p -> true ,System.out::println);

    }

    public static void PeformOnCondition(List<Person> lperson, Predicate<Person> condition, Consumer<Person> action) {
        for(Person p : lperson){
            if(condition.test(p))
                action.accept(p);
        }

    }
}
