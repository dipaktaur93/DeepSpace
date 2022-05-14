public class ArrayAvarage {
    public static void main(String[] args) {
        int[] marks={99,34,56,45,66};
        int sum=0;
        for(int elements:marks){
            sum =elements+sum;
        }
        System.out.println("Avarage of Marks"+" "+ sum/marks.length);
    }
}
 