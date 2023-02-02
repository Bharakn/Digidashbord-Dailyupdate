package lambdaexpressions;

public class LambdaIntroduction {
    public static void myName(){
        System.out.println("Bharath");
    }
    Name myname=()->System.out.println("Bharath from lambda");

    public static void main(String[] args) {
     myName();
     LambdaIntroduction l=new LambdaIntroduction();
     l.myname.myName();


    }
}
