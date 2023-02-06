package lambdaexpressions;

interface MyFunctionalInterface{
    public double someCalculation(double a,double b);
}

public class LambdaDoubleArgument {

    MyFunctionalInterface fi=(a,b)->{
       double c=a+b;
       double d=c*a*b;
       return d+a+b;
    };

    public static void main(String[] args) {
        LambdaDoubleArgument ld=new LambdaDoubleArgument();
     System.out.println(   ld.fi.someCalculation(10,20));
    }


}
