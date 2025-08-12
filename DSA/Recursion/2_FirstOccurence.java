class FirstOccurence {

    public static int findFirstOccurence(int []arr, int idx, int target){

        if (arr.length  == idx){
           System.out.println("Not found ");
            return -1 ;
        }
        if ( arr[idx] == target ){
            return idx ;
        }
        return findFirstOccurence(arr, idx + 1 , target);
    }
    public static void main(String s[]){
        int arr[] = {2,3,5,6,6,8,19,20};
        
        int result = findFirstOccurence(arr, 0, 8);
        System.out.println(result );
    }
}
