package java8.exercises.lambda;

public class ClosuresExample {

    interface Process {
        void process(int i);
    }

    public static void doProcess(int i, Process p){
        p.process(i);
    }

    public static void main(String[] args){
        int a = 10;
        int b= 20;
        doProcess(a, new Process() {
            @Override
            public void process(int i) {
                System.out.println(a + b);
            }
        });

        doProcess(a, i -> System.out.println(i+b));
    }
}
