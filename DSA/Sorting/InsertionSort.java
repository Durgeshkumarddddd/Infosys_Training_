class InsertionSort {

     public static void InsertionSort(int[] arr) {
    
        // since first element is already sorted that's why loop start from 1 to n ;
        for (int i = 1; i < arr.length; i++) {
        
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
    }
}

    public static void main(String s[]){
        int arr[] = {98,23,65,87,42,68,12};

        InsertionSort(arr);

        for (int i = 0 ; i <  arr.length ; i++ ){
            System.out.print(arr[i]+" ");
        }
    }
}
