class twoSum {
    
    public static void main(String args[]) {
        int arr[] = { 1, 3, 2, 4, 5, 7 };
        int target = 6;
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("The idex are : " + i + "," + j);
                }
            }
        }
        
        
    }
}
