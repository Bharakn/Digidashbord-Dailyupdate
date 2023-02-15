package basics;

public class ReverseAString2 {
    public static void main(String[] args) {
        String str="Amar";
        StringBuilder s=new StringBuilder(str);
        s.reverse();
        System.out.println(s);
    }
}
