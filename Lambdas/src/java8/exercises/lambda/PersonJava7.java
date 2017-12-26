package java8.exercises.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PersonJava7 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("a", "aa", 1),
                new Person("b", "bb", 2),
                new Person("c", "cc", 3),
                new Person("d", "dd", 4)
        );

        //sort list by last name
        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getLastName().compareTo(o1.getLastName());
            }
        });

        //print the list
        PrintAll(people);

        //print on condition
        PrintOnCondition(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("c");
            }
        });
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
