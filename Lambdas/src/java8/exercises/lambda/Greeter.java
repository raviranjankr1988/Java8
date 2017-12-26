package java8.exercises.lambda;

public class Greeter {

    public void greet(Greeting greeting){
        greeting.perform();

    }

    public static void main(String[] args){
        Greeter greeter = new Greeter();
        greeter.greet(new HelloWorldGreeting());

        MyLambda myLambda=()->System.out.println("Hello Mylambda");

        Mysum mysum = (int i, int j) ->i+j;

        Greeting myLambdaGreeting = ()->System.out.println("Hello MylambdaGreeting");

        greeter.greet(myLambdaGreeting);
    }


    interface MyLambda{
        void foo();
    }

    interface Mysum{
        int foo(int i, int j);
    }
}