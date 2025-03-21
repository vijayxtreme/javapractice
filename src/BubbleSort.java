public class BubbleSort {

    public static void bubbleSort(int[] initialArr) {
        //bubble sort review:
        //O(n^2) run time
        //O(1) space - runs in place
        //Compare each right item to the left item, if left is bigger, swap, the bigger goes to the end
        //Run for the length of the array
        int n = initialArr.length;

        for (int i=0; i< n; i++){
            boolean swapped = false; //optimization - if array may already be sorted
            for(int j=0; j<n - 1 - i; j++){ // doing minus i helps because last item is largest, no need to run again
                if(initialArr[j] > initialArr[j+1]){ //check item on left with item on right
                    //swap
                    int temp = initialArr[j+1];
                    initialArr[j+1] = initialArr[j];
                    initialArr[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                Helper.print("No swaps made this round, round: " + i );
                Helper.print("Basically at this iteration everything got sorted");
                break;
            }
        }
    }

    public static void main(String[] args){
        Helper.print("********Bubble Sort**********");
        Helper.print("Before sort");
        int[] initialArr = { 3, 7, 1, 4, 9, 2, 8, 5, 0, 6, 11, 13, 15, 17, 19, 12, 14, 10, 16, 18 };
        Helper.printIntArr(initialArr);
        Helper.print("");
        bubbleSort(initialArr);
        Helper.print("After sort");
        Helper.printIntArr(initialArr);
    }
}
