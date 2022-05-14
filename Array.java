import java.util.Scanner;

public class Array {
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int Size =sc.nextInt();

    int[] number= new int[Size];
//    mark[0]=94;
//    mark[2]=84;
//    mark[3]=74;
//    mark[4]=54;
//    mark[1]=64;
    for(int i=0;i<Size;i++){
      number[i]=sc.nextInt();
    }
     for(int i=0;i<Size;i++){

       System.out.print(number[i]+ " ");
     }
  }
}

