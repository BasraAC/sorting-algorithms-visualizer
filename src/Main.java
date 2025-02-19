
import java.util.*;

public class Main{
    public static void main(String [] Args){
        
        int size = 100; // Set the size of the list
        List<Integer> numbers = new ArrayList<>();
       
        
        
        // Fill the list with random values from 1 to 100
        for (int i = 1; i <= size; i++) {
            numbers.add(i);  // Generates a random number between 1 and 100
            Globals.changedElements.add(false);
        }
       
        Globals.array = numbers;
      

        Interface.setInterfaceDrawInformation();
        Interface.updateGraphics();
        Shuffler.Shuffle();
        Sorting.quickSort();
        Interface.sortedComplete();
        
        
        
       
        

        
    }
}