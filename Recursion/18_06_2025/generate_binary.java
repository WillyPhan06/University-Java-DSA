public class Main {
    public static void main(String[] args) {
        int [] arr = {0, 0, 0};

        generateBinary(arr, 0);
    }

    public static void generateBinary(int[] arr, int index) {
        if (index == arr.length) {
            printArray(arr);
            return;
        }
        arr[index]=0;
        generateBinary(arr, index+1);
        arr[index] = 1;
        generateBinary(arr, index + 1);

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}