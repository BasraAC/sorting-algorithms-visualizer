import java.util.*;
public class Utils{

    public static void sleepMs(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore the interrupted status
            System.err.println("Thread was interrupted!");
        }
    }

    public static List<Boolean> compareLists(List<Integer> list1, List<Integer> list2) {
        // Ensure both lists are the same size
        
        List<Boolean> result = new ArrayList<>();

        // Compare the values in the lists
        for (int i = 0; i < list1.size(); i++) {
            boolean isDifferent = !list1.get(i).equals(list2.get(i));
            result.add(isDifferent);  // If different, add 'true', otherwise 'false'
            
            
        }

        return result;
    }

    public static void swapAndTick(List<Integer> arr, int index1, int index2) {
        // Create a snapshot of the current state before swapping
        
        
        // Swap the elements at index1 and index2 in the original list
        Collections.swap(arr, index1, index2);
        Globals.lo = index1;
        Globals.hi = index2;

        // Update the global array (if that's required by your application logic)
        Globals.array = arr;
        
        // Call tick with the previous state to compare with the new state
        tick(Globals.array);
    }

    public static void tick(List<Integer> arr){
    
       
        Globals.ticks++;
        Interface.updateGraphics();
        if(Globals.GLOBAL_SLEEP > 0){
            sleepMs(Globals.GLOBAL_SLEEP);
        }
        
    }

}