package java8.exercises.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PersonJava8 {

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
        PrintAll(people);

        Condition condition = (p) -> p.getLastName().startsWith("c");

        //print on condition
        PrintOnCondition(people, condition);
    }

    public static void PrintOnCondition(List<Person> lperson,Condition condition) {
        for(Person p : lperson){
            if(condition.test(p))
                System.out.println(p);
        }

    }

    public static void PrintAll(List<Person> lperson) {
        for(Person p : lperson){
            System.out.println(p);
        }
    }

    interface Condition{
        boolean test(Person p);
    }

}
