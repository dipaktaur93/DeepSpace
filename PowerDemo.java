import java.util.Scanner;

public class PowerDemo {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int base;
        int power;
        int Result=1;
        System.out.println("Entered base Number:");
        base= sc.nextInt();
        System.out.println("Entered power Number");
        power=sc.nextInt();
        for(int i=1;i<=power;i++){
           Result *= base;
        }
        System.out.println("Result  "  + Result);
    }
}
