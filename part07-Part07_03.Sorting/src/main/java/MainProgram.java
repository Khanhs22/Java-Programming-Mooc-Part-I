
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {3, 2, 5, 4, 8};

//        System.out.println(Arrays.toString(numbers));
//
//        MainProgram.swap(numbers, 1, 0);
//        System.out.println(Arrays.toString(numbers));
//
//        MainProgram.swap(numbers, 0, 3);
//        System.out.println(Arrays.toString(numbers));
    }

    public static int smallest(int[] array) {

        int smallest = array[0];

        for (int number : array) {
            if (smallest > number) {
                smallest = number;
            }
        }

        return smallest;
    }

    public static int indexOfSmallest(int[] array) {

        int index = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] < array[index]) {
                index = i;
            }
        }

        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {

        int index = startIndex;

        for (int i = startIndex; i < table.length; i++) {

            if (table[i] < table[index]) {
                index = i;
            }
        }

        return index;
    }

    public static void swap(int[] array, int index1, int index2) {

        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void sort(int[] array) {
        
        for (int i = 0; i < array.length; i++) {
            
            int indexSmallest = indexOfSmallestFrom(array, i);
            swap(array, indexSmallest, i);
        }
    }
}
