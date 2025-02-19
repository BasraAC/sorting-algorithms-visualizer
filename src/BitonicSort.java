import java.util.*;
public class BitonicSort{
    public static void bitonicSort(List<Integer> list, boolean ascending) {
        if (list.size() <= 1) return;
        bitonicSortRecursive(list, 0, list.size(), ascending);
    }

    private static void bitonicSortRecursive(List<Integer> list, int low, int count, boolean ascending) {
        if (count > 1) {
            int k = count / 2;
            bitonicSortRecursive(list, low, k, true);
            //Utils.tick(list); // Tick after sorting the first half
            bitonicSortRecursive(list, low + k, k, false);
            //Utils.tick(list); // Tick after sorting the second half
            bitonicMerge(list, low, count, ascending);
            //Utils.tick(list);
        }
    }

    private static void bitonicMerge(List<Integer> list, int low, int count, boolean ascending) {
        if (count > 1) {
            int k = count / 2;
            for (int i = low; i < low + k; i++) {
                if ((list.get(i) > list.get(i + k)) == ascending) {
                    Utils.swapAndTick(list, i, i + k);
                    
                }
            }
            bitonicMerge(list, low, k, ascending);
            //Utils.tick(list);
            bitonicMerge(list, low + k, k, ascending);
            //Utils.tick(list);
        }
    }
}