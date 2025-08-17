class SecondRecursion {

    public void recursion(int n ){
        if (n > 0 ){
            recursion( n - 1);
            System.out.print(n);
            recursion( n - 1 );
        }
    }
    
    public static void main(String s[]){
        SecondRecursion sr = new SecondRecursion();
        sr.recursion(3);
    }
}
