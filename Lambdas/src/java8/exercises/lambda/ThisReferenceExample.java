package java8.exercises.lambda;

public class ThisReferenceExample {

    public void doProcess(int i, ClosuresExample.Process p){
        p.process(i);
    }

    public void execute(){
        doProcess(20, i -> {
            System.out.println("Value of i is " + i);
            System.out.println(this); //this will not work here in lambda function
        });
    }

    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
        thisReferenceExample.doProcess(10, new ClosuresExample.Process() {
            @Override
            public void process(int i) {
                System.out.println("Value of i is " + i);
                System.out.println(this); //this will work here
            }
        });

        thisReferenceExample.doProcess(20, i -> {
                System.out.println("Value of i is " + i);
                //System.out.println(this); //this will not work in lambda function static context
        });

        thisReferenceExample.execute();

    }
}
