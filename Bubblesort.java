public class Bubblesort {
    public static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
    }
    }
             //bubble sort
        public static void main (String[]args){
            int[] arr = {7, 6, 8, 9, 1, 2, 5, 4, 3};
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        //swap
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            printArray(arr);
        }
    }

