package basics;

public class TryCatchException {

    public static void main(String[] args) {
        try {
            double c=1/0;
            System.out.println(c);
        } catch (Exception e) {
           System.out.println("Exception got handled");
        }finally {
            System.out.println("From finally block");
        }
    }
}
