package lambdaexpressions;
interface  EvenOdd{
    public void number(int a);
}

public class LambdaEvenOdd {
    EvenOdd eo=a->{
        if(a%2==0){
            System.out.println("Number is even");
        }else {
            System.out.println("Number is odd");
        }
    };
    public static void main(String[] args) {
        LambdaEvenOdd l=new LambdaEvenOdd();
        l.eo.number(1);
    }
}
