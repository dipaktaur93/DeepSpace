import java.util.Scanner;

public class One {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Dipak");
            } else if (i % 3 == 0) {
                System.out.println("Dinkar");
            } else if (i%5==0) {
                System.out.println("Taur");
            }else {
                System.out.print(i+" ");
            }
            }
        }
    }
