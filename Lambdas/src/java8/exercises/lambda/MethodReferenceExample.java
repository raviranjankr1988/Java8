package java8.exercises.lambda;

public class MethodReferenceExample {

    public static void main(String[] args){
        Thread thread1 = new Thread(MethodReferenceExample::printMessage);
        thread1.start();

        Thread thread2 = new Thread(() -> printMessage());
        thread2.start();

    }

    public static void printMessage() {
        System.out.println("Hello!");
    }
}
