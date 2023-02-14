package functionExample;

import java.util.function.Function;

public class FunctionExample1 {
    public static void main(String[] args) {
        String s="Basics java";
        Function<String,Integer> fun=str->str.length();
       System.out.println( fun.apply(s));
    }
}
