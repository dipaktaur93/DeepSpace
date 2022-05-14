import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        if(0<a){
            System.out.println("Number is Positive");
        }else if(0>a){
            System.out.println("Number is negative");
        }else{
            System.out.println("Number is Zero");
        }
    }
}
