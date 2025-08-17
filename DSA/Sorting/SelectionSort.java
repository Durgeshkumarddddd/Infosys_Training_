class SelectionSort {
    public void SelectionSort(int[] arr){
        int s = 0 ;
        for ( int i = 0 ; i < arr.length - 1 ; i++){
             int min = arr[i + 1 ];
            for (int j = i+ 1 ; j < arr.length   ; j++ ){
                s = j ;
                if (min > arr[j]){
                    min = arr[j] ;
                    s = j ;
                }
            }
            if ( arr[i] > min){

                int temp = arr[s];
                arr[s] = arr[i];
                arr[i] = temp ;
            }
        }
    }

    public static void main(String s[]){
        int arr[] = {21,99,46,62,64,98,24};
        SelectionSort selection = new SelectionSort();
        selection.SelectionSort(arr);

        for (int i = 0 ; i < arr.length - 1 ;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
