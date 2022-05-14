public class ArrayPresent {
    public static void main(String[] args) {
        int [] arr={10,30,20,40,50,60};
        int n =20;
        boolean isInArray=false;

        for (int elements:arr) {
            if (n==elements ) {
            isInArray=true;
            break;
        }
        }
        if (isInArray){
            System.out.println("elements is present");
        }else{
            System.out.println("elements is not present");
        }
    }
}
