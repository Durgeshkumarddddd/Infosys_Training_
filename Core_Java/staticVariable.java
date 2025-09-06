

class staticVariable {

    int normalVariable = 0;
    static int staticVariable = 0;
    
    staticVariable() {
        normalVariable++;
        staticVariable++;
    }
    

    public static void main(String args[]) {
        staticVariable a = new staticVariable();
        System.out.println("no is :"+a.normalVariable + ", "+a.staticVariable);
        staticVariable b = new staticVariable();
        System.out.println("no is :" + b.normalVariable + ", " + b.staticVariable);
        staticVariable c = new staticVariable();
        System.out.println("no is :" + c.normalVariable + ", " + c.staticVariable);
        staticVariable d = new staticVariable();
        System.out.println("no is :" + d.normalVariable + ", " + d.staticVariable);
                 d = new staticVariable();
                 d = new staticVariable();
                System.out.println("no is :" + d.normalVariable + ", " + d.staticVariable);


    }

}
