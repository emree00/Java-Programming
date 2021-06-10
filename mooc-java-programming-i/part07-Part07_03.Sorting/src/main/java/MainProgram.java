import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
       // indices:       0  1  2  3   4
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }
    
    public static int smallest(int[] array){
        int small = array[0];
        for(int i=0; i<array.length;i++){
            if(array[i] < small){
                small = array[i];
            }
        }
        return small;
    }
    
    public static int indexOfSmallest(int[] array) {
        int small = array[0];
        int index = 0;
        for(int i=0; i<array.length;i++){
            if(array[i] < small){
                small = array[i];
                index = i;
            }
        }
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        // write your code here
        int placeOfSmallest = startIndex;
        
        for(int i = startIndex; i<table.length; i++){
            if(table[i] < table[placeOfSmallest]){
                placeOfSmallest = i;
            }
        }
        return placeOfSmallest;
    
    }
    
    public static void swap(int[] array, int index1, int index2) {
    // write your code here
    // variable marche pas car changement pas fait direct sur le tableau.
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;  
    }
    
    public static void sort(int[] array) {
        for(int i = 0; i< array.length - 1; i++){
            System.out.println(Arrays.toString(array));
            int a = indexOfSmallestFrom(array, i); // return index = 4
            swap(array,a,i);
        }
    }

}
