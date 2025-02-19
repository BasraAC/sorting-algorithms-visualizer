import java.util.*;
public class QuickSort {

    // Quick sort method that works on a List<Integer>
    public static void quickSort(List<Integer> list, int low, int high) {
        if (low < high) {
            // Partition the list and get the pivot index
            int pivotIndex = partition(list, low, high);
            // Recursively sort the sublists
            quickSort(list, low, pivotIndex - 1);
            
            quickSort(list, pivotIndex + 1, high);
            
        }
    }

    // Partition method that rearranges the list around the pivot element
    private static int partition(List<Integer> list, int low, int high) {
        int pivot = list.get(high);  // Choosing the last element as pivot
        int i = low - 1;             // Index of the smaller element

        for (int j = low; j < high; j++) {
            // If current element is less than pivot, swap it to the left part
            if (list.get(j) < pivot) {
                i++;
                Utils.swapAndTick(list, i, j);
            }
        }
        // Place the pivot element in its correct position
        Utils.swapAndTick(list, i + 1, high);
        return i + 1;
    }
}
    