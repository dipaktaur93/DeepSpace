import java.util.Scanner;

public class Ram2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b=sc.nextInt();
        if(a==b){
            System.out.println("A is equal to b");
        }else{
            if(a>b){
                System.out.println("A is grater than b");
            }else{
                System.out.println("a is lesser");
            }
        }
    }
}
