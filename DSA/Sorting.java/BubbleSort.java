class BubbleSort {
    public void BubbleSort( int []arr, int len ){
        for ( int i = 1 ; i < len ; i++){
            for (int j = 1; j < len - i  ; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j] ; 
                    arr[j] = arr[j + 1] ;
                    arr[j+ 1] = temp;
                }
            }
        }
    }

    public static void main(String args[]){
        int arr[] = {23,26,98,86,31,53,82,63};
        
        BubbleSort b = new BubbleSort();
        b.BubbleSort(arr, arr.length);

        for (int i = 0 ; i < arr.length - 1 ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
