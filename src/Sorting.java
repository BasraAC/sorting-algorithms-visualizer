public class Sorting{
    public static void bubbleSort(){
        BubbleSort.bubbleSort();
    }

    public static void bitonicSort() {
        BitonicSort.bitonicSort(Globals.array, true);   
    }
    public static void cockTailShakerSort(){
        CocktailShakerSort.cocktailShakerSort(Globals.array);
    }
    public static void oddEvenSort(){
        OddEvenSort.oddEvenSort(Globals.array);
    }
    public static void quickSort(){
        QuickSort.quickSort(Globals.array, 0, Globals.array.size()- 1);
    }
}