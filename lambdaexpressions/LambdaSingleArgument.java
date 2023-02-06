package lambdaexpressions;

interface MyInterface{
    public void Welcome(String s);
}

public class LambdaSingleArgument {
    MyInterface inter=s->System.out.println("Welcome "+s);
    public static void main(String[] args) {
       // MyInterface inter=s->System.out.println("Welcome "+s);
        LambdaSingleArgument ls=new LambdaSingleArgument();
        ls.inter.Welcome("Bharath");
        ls.inter.Welcome("Ramesh");

    }
}
