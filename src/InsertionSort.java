public class InsertionSort {
    public static void sort(int[] arr) {
        // insertion sort - it's like getting dealt a card each time and comparing with what you got before
        for (int i=0; i<arr.length; i++){
            //get card
            int temp = arr[i];
            int leftIndex = i-1;
            while (leftIndex >= 0 && arr[leftIndex] > temp ){
                arr[leftIndex+1] = arr[leftIndex];
                leftIndex--;
            }
            arr[leftIndex + 1] = temp;
        }
    }
    public static void main (String[] args) {
        System.out.println("Before sort");
        int[] initialArr = { 3, 7, 1, 4, 9, 2, 8, 5, 0, 6, 11, 13, 15, 17, 19, 12, 14, 10, 16, 18 };
        Helper.printIntArr(initialArr);
        System.out.println("");
        sort(initialArr);
        System.out.println("After sort");
        Helper.printIntArr(initialArr);

    }
}
