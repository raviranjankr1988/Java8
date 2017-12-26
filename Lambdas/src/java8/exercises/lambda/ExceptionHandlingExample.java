package java8.exercises.lambda;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

    public static void main(String[] args){
        int[] someNumbers = new int[] {1,2,3,4,5,6};
        int key =0;

//        process(someNumbers,key,(k,v) -> {
//            try{
//                System.out.println(k/v);
//            } catch (Exception ex){
//                System.out.println(ex);
//            }
//        });

        process(someNumbers,key,wrapperLambda((v,k) -> System.out.println(v/k)));

    }

    public static void process(int[] nums, int key, BiConsumer<Integer,Integer> biConsumer){
        for(int i: nums) {
            biConsumer.accept(i,key);
        }
    }

    private static BiConsumer<Integer,Integer> wrapperLambda(BiConsumer<Integer,Integer> biConsumer) {
        return (v,k) -> {
            try {
                biConsumer.accept(v,k);
            } catch (Exception ex){
                System.out.println(ex);
            }
        };
    }
}
