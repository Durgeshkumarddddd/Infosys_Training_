package Core_Java.Constructor;

class PrivateConstructor {

    private PrivateConstructor() {
        System.out.println("private constructor:");
    }

    private PrivateConstructor(int a, int b) {
        System.out.println(a + b);
    }
    
    public static void main(String args[]) {
        PrivateConstructor p = new PrivateConstructor(5,9);   
    }
}
