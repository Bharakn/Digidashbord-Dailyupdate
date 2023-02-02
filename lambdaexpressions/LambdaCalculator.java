package lambdaexpressions;

public class LambdaCalculator {
    Calculator add=(a,b)->System.out.println(a+b);
    Calculator sub=(a,b)->System.out.println(a-b);
    Calculator mul=(a,b)->System.out.println(a*b);
    Calculator div=(a,b)->System.out.println(a/b);

    public static void main(String[] args) {
        LambdaCalculator l=new LambdaCalculator();
        l.add.cal(10,200);
        l.sub.cal(20,300);
        l.mul.cal(0,120000);
        l.div.cal(100,20);
    }
}

interface Calculator{
    public void cal(int a,int b);
}

