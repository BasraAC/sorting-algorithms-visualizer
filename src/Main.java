
import java.util.*;

public class Main{
    public static void main(String [] Args){
        
        int size = 1024; // Set the size of the list
        List<Integer> numbers = new ArrayList<>();
       
        Random random = new Random();

        
        // Fill the list with random values from 1 to 100
        for (int i = 1; i <= size; i++) {
            numbers.add(random.nextInt(10000 - 0 + 1) + 0);
            // Generates a random number between 1 and 100
    
        }
       
        Globals.array = numbers;
      

        Interface.setInterfaceDrawInformation();
        Interface.updateGraphics();
        Shuffler.Shuffle();
        Sorting.quickSort();
        Interface.sortedComplete();
        
        
        
       
        

        
    }
}