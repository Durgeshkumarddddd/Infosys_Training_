class ThirdRecursion {

    void recursion(int n ){
        if ( n > 0  ){
            recursion(n - 1);
            recursion(n - 1);
            System.out.print(n);
        }
    }
    
    public static void main(String[] as){
        new ThirdRecursion().recursion(4);
    }
}
