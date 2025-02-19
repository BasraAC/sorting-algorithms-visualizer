import java.util.*;
public class OddEvenSort {
    public static void oddEvenSort(List<Integer> list) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            
            // Odd indexed swaps
            for (int i = 1; i < list.size() - 1; i += 2) {
                if (list.get(i) > list.get(i + 1)) {
                    Utils.swapAndTick(list, i, i + 1);
                  
                    sorted = false;
                }
            }

            // Even indexed swaps
            for (int i = 0; i < list.size() - 1; i += 2) {
                if (list.get(i) > list.get(i + 1)) {
                    Utils.swapAndTick(list, i, i + 1);
                    
                    sorted = false;
                }
            }
        }
    }
}