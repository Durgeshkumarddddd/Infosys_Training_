
// String... -> Java Variable Object
class findLargest {
    public static void main(String... args){
        int []arr = { 12,5,52,65,87,57,76,45 };
        int largest = Integer.MIN_VALUE ;

        // for (int i = 0 ; i < arr.length ; i++){
        //     if (arr[i]> largest){
        //         largest = arr[i];

        //     }
        //     i++ ;
        // }

        // Now by using for- each loop  it is not similar to forEach() -> it is use in arrayList not arrays.
        for (int num : arr){
            if (num > largest){
                largest = num ;
            }
        }
        System.out.println(largest);
    }
}
