public class Sorting {
    // Use this class to do the IK work - Selection Sort, etc
    public static void print(int i){
        System.out.println(i);
    }

    public static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i<n - 1; i++){ // n - 1 ensures no extra iteration
            int min = i; //assume the first index is the minimum
            for(int j = i+1; j<n; j++){
                if(arr[j] < arr[min]){
                    min = j; // find the min element but don't swap in real time
                }
            }
            //swap should happen outside the inner loop when min has been found
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void main(String[] args) {
        int[] myarr = { 3, 7, 1, 4, 9, 2, 8, 5, 0, 6, 11, 13, 15, 17, 19, 12, 14, 10, 16, 18 };
        selectionSort(myarr);
        for (int number : myarr) {
            System.out.print(number + " ");
        }
    }
}
