package java8.exercises.lambda;

public class TypeInferenceExample {

    public static void main(String[] args){
        StringLengthLambda stringLength = s -> s.length();
        System.out.println(stringLength.getLength("Hello Lambda"));
        PrintLambda(stringLength, "Hello World");
        PrintLambda(s -> s.length(),"Hellow World Without interface");
    }

    public static void PrintLambda(StringLengthLambda sll,String s){
        System.out.println(sll.getLength(s));
    }




    interface StringLengthLambda {
        int getLength(String s);
    }
}
