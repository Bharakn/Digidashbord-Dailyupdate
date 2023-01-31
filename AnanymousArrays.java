package arrays;

public class AnanymousArrays {

    public static void sum(int[] arr){
        int total=0;
        for (int ele:arr) {
            total=total+ele;
        }
        System.out.println(total);
    }

    public static void main(String[] args) {
     sum( new int[] {1,2,3,4} ); //ananymous array
    }

}
