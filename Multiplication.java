import java.util.Scanner;

public class Multiplication {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=0;
        int sum=0;

        for(int i=1;i<=10;i++){
            m= i*n;
            System.out.print(m + " ");
        }

    }
}
