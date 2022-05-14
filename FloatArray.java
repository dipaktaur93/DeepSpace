public class FloatArray {
    public static void main(String[] args) {
        float[] marks = {78.9f, 89.0f, 78.1f, 67.9f, 65.4f};
        float sum = 0;
        for (float element : marks) {
            sum = sum + element;
        }
        System.out.println(sum);
    }
}
