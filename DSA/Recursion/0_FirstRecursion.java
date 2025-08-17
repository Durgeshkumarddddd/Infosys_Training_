class FirstRecursion {
    public void recursion(int n){
        if (n > 0 ){
            System.out.println(n);
            recursion( n - 1);
            recursion(n - 1);
        }
    }

    
    public static void main(String... s){
        int n = 3 ;
       new FirstRecursion().recursion(n);
    }
}
