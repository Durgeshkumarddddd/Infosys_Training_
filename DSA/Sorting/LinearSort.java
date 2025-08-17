// Linear sort in this sorting algorithm we take one index elemenet and 

class LinearSort {
    public void LinearSort(int []arr, int len){
        for (int i = 0 ; i < len ; i++){
            for (int j = i + 1 ; j < len ; j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp ;
                }
            }
        }
    }

    public static void main(String... args){
        int arr[] = {34,74,23,63,43,12,28,30};
        LinearSort l = new LinearSort();
        l.LinearSort(arr, arr.length);

        for (int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+ "  ");
        }
    }
}
