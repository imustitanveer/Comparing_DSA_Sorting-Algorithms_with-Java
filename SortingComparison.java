import java.util.Scanner;

public class SortingComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input array elements
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Choose sorting algorithm
        System.out.println("Choose a sorting algorithm:");
        System.out.println("1. Insertion Sort");
        System.out.println("2. Bubble Sort");
        System.out.println("3. Selection Sort");
        int choice = scanner.nextInt();

        long startTime, endTime;
        switch (choice) {
            case 1:
                startTime = System.nanoTime();
                insertionSort(array);
                endTime = System.nanoTime();
                System.out.println("Sorted array using Insertion Sort:");
                printArray(array);
                System.out.println("Time taken: " + (endTime - startTime) + " nanoseconds");
                break;
            case 2:
                startTime = System.nanoTime();
                bubbleSort(array);
                endTime = System.nanoTime();
                System.out.println("Sorted array using Bubble Sort:");
                printArray(array);
                System.out.println("Time taken: " + (endTime - startTime) + " nanoseconds");
                break;
            case 3:
                startTime = System.nanoTime();
                selectionSort(array);
                endTime = System.nanoTime();
                System.out.println("Sorted array using Selection Sort:");
                printArray(array);
                System.out.println("Time taken: " + (endTime - startTime) + " nanoseconds");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    // Insertion Sort
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
