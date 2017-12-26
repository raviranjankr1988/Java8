package java8.exercises.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PersonJava8v2 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("a", "aa", 1),
                new Person("b", "bb", 2),
                new Person("c", "cc", 3),
                new Person("d", "dd", 4)
        );

        //sort list by last name
        people.sort((o1,o2) -> o2.getLastName().compareTo(o1.getLastName()));

        //print the list
        PeformOnCondition(people,p -> true ,p -> System.out.println(p));

        //print on condition
        PeformOnCondition(people, p -> p.getLastName().startsWith("c"),p -> System.out.println(p));

        PeformOnCondition(people, p -> p.getFirstName().startsWith("a"),p -> System.out.println(p));

        PeformOnCondition(people, p -> p.getFirstName().startsWith("a"),p -> System.out.println(p.getAge()));
    }

    public static void PeformOnCondition(List<Person> lperson, Predicate<Person> condition, Consumer<Person> action) {
        for(Person p : lperson){
            if(condition.test(p))
                action.accept(p);
        }

    }

}
