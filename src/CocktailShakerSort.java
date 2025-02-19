import java.util.*;

public class CocktailShakerSort {
    public static void cocktailShakerSort(List<Integer> list) {
        boolean swapped;
        int start = 0, end = list.size() - 1;

        do {
            swapped = false;
            // Forward pass
            for (int i = start; i < end; i++) {
                if (list.get(i) > list.get(i + 1)) {
                    Utils.swapAndTick(list, i, i + 1);
                    
                    swapped = true;
                }
            }
            end--;

            if (!swapped) break; // List is already sorted

            swapped = false;
            // Backward pass
            for (int i = end; i > start; i--) {
                if (list.get(i) < list.get(i - 1)) {
                    Utils.swapAndTick(list, i, i - 1);
                   
                    swapped = true;
                }
            }
            start++;
        } while (swapped);
    }
}