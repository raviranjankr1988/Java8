package java8.exercises.lambda;

public class HelloWorldGreeting implements Greeting{
    @Override
    public void perform() {
        System.out.println("Hello World!");
    }
}
