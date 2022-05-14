import java.util.Scanner;

public class StepsExecution {
    public static void main(String[]args){
        int number;
        Scanner obj= new Scanner(System.in);
        number = obj.nextInt();
        int i;
        i=(((number+8)/3)%5)*5;
        System.out.print(i);

    }
}
