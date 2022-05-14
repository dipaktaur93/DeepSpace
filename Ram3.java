import java.util.Scanner;

public class Ram3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if(a==b){
            System.out.println("Dipak");
        }else if(a==c){
            System.out.println("Akash");
        }else if(b==c){
            System.out.println("Smita");
        }else if(c==d){
            System.out.println("rakesh");
        }else{
            System.out.println("Not found");
        }
    }
}
