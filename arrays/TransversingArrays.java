package arrays;

public class TransversingArrays {

    public static void main(String[] args) {
        //Transvering 1D array
        //type 1
        int[] arr1={10,20,30,40,50,60};
        for (int e:arr1) {
            System.out.println(e);
        }
        for(int i=0;i< arr1.length;i++){
            System.out.println("index "+i+"  "+"value "+arr1[i]);
        }

        //type 2
        int [] arr2=new int[5];
        arr2[0]=10;arr2[1]=20;arr2[2]=30;arr2[3]=40;arr2[4]=50;

        for(int e:arr2){
            System.out.println(e);
        }
        for (int i=0;i< arr2.length;i++){
            System.out.println("index "+i+" value "+arr2[i]);
        }

        //Transversing 2D Array
        int[][] arr3={{1,2,3,4,5},{11,12,13,14,15}};
        for (int[] arr:arr3){
            for(int e:arr){
                System.out.println(e);
            }

        }

        for(int i=0;i< arr3.length;i++){
            for(int j=0;j<arr3[i].length;i++){
                System.out.println(arr3[i][j]);
            }
        }
    }
}
