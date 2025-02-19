import java.util.*;

public class Shuffler {
    public static void Shuffle(){
        
        List<Integer> arr = Globals.array;
        // Fisher-Yates Shuffle Algorithm
        Random r = new Random();
        for (int i = arr.size() - 1; i > 0; i--) {
            
            // Random index from 0 to i
            int j = r.nextInt(i + 1);
          
            // Swap elements at i and j
            int t = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, t);
           
            
            Globals.array = arr;
            Interface.updateGraphics();
           
        }

    } 
}
