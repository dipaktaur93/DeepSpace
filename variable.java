import java.util.Scanner;

public class variable {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d= sc.nextByte();
        int sum = a+b+c+d;
        int percentage = sum/4;
        System.out.print(percentage);
        sc.close();
    }
}
