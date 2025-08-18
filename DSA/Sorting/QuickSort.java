class QuickSort {

    public static void swap(int arr[], int a, int b){
        int temp = arr[a] ;
        arr[a] =arr[ b]; 
        arr[b] = temp ;
    }

    public static int partition( int[] arr, int l , int up ){
       int p = arr[l];
       int start = l ;
       int end = up ;
        while ( start < end ){
            
            while ( start < end && arr[start] <= p ){
                start++;
            }
            while ( arr[end] > p){
                end-- ;
            }
            if ( start < end ){
              swap(arr, start, end);
            }
        }
        swap(arr, l, end);
        return end;
      

    }

    public static void quickSort(int []arr, int l, int r){
        if ( l < r ){
            int p = partition(arr, l , r);
            // System.out.print(p);
            quickSort(arr, l, p - 1);
            quickSort(arr, p + 1, r);
        }
    }
    
    public static void main(String... args){
        int arr[] = {23,43,98,23,54,28,83,42};
        quickSort(arr, 0, arr.length - 1);

        for (int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
