import java.sql.SQLOutput;

public class ArrayElementsSum {
    public static void main(String[]args){
        int[]arr={1,2,3,4,5,6,7,8,9,10};
        int sum =0;
        for(int elements:arr) {
            sum = sum +elements;

    }
        System.out.println(sum);
}
}
