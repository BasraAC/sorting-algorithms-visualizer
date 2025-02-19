import java.util.*;

public class BubbleSort{
    public static void bubbleSort(){
        List<Integer> arr = Globals.array;
        int size = arr.size();


        // Outer loop for each pass through the list
        for (int i = 0; i < size - 1; i++) {
            // Inner loop to compare adjacent elements
            for (int j = 0; j < size - 1 - i; j++) {
                // Swap if the current element is greater than the next
                if (arr.get(j) > arr.get(j + 1)) {
                    Utils.swapAndTick(arr, j, j + 1);
                                        
                }
            }
        }
    }

}