public class EvenOddSegregation {

    private int[] arr; // Array to store numbers

    // Constructor to initialize the array
    public EvenOddSegregation(int[] arr) {
        this.arr = arr;
    }

    // Method to segregate even and odd numbers
    public void segregateEvenOdd() {
        int l = 0; // Left pointer
        int r = arr.length - 1; // Right pointer

        while (l <= r) {
            boolean lchk = arr[l] % 2 == 1; // Check if left element is odd
            boolean rchk = arr[r] % 2 == 0; // Check if right element is even

            if (lchk && rchk) {
                // Swap elements when left is odd and right is even
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;

                // Move both pointers inward
                l++;
                r--;
            } else if (lchk) {
                // If left is odd, move the right pointer inward
                r--;
            } else {
                // If left is even, move the left pointer inward
                l++;
            }
        }
    }

    // Method to print the array
    public void printArray() {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {12, 34, 45, 9, 8, 90, 3}; // Example input array

        // Create an instance of EvenOddSegregation class
        EvenOddSegregation evenOddSegregation = new EvenOddSegregation(arr);

        System.out.println("Original Array:");
        evenOddSegregation.printArray();

        // Segregate even and odd numbers
        evenOddSegregation.segregateEvenOdd();

        System.out.println("Array after segregation:");
        evenOddSegregation.printArray();
    }
}
