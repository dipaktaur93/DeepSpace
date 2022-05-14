public class Array1 {
    public static void main(String[]args){
        int[] arr = {10,30,40,60,50,100};
        int max =0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]<50)
              max =arr[i];


        }
        System.out.println(max);
    }
}
