class QuickSort {

    public static void swap(int a, int b){
        int temp = a ;
        a = b; 
        b = temp ;
    }

    public static int partition( int[] arr, int l , int r ){
       int p = arr[l];
        while ( l < r ){
            
            while ( arr[l] <= p ){
                l++;
            }
            while ( arr[r ] > p){
                r-- ;
            }
            if ( l < r ){
              swap(arr[l], arr[r]);
            }
        }
        swap(arr[r], p);
        return r;
      

    }

    public static void quickSort(int []arr, int l, int r){
        if ( l < r ){
            int p = partition(arr, l , r);
            System.out.print(p);
            quickSort(arr, l, p - 1);
            quickSort(arr, p + 1, r);
        }
    }
    
    public static void main(String... args){
        int arr[] = {23,43,98,23,54,28,83,42};
        quickSort(arr, 0, arr.length - 1);

        for (int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]);
        }
    }
}
