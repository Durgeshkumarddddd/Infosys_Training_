import java.util.*;

class Calculator {

    public static int precedenceOf(char s) {
        int p = -1;
        switch (s) {
            case '+':
            case '-':
                p = 4;
                break;
            case '*':
            case '/':
                p = 5;
                break;
            case '^':
                p = 6;
                break;

        }
        return p;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the expression : ");
        String string = sc.nextLine();

        char[] str = string.toCharArray();
        char[] opd = new char[256];
        char[] opr = new char[256];

        int j = -1, k = -1;

        for (int i = 0; i < str.length; i++) {

            if (str[i] >= 48 && str[i] <= 57) {
                j++;
                opd[j] = str[i];
            } else {
                if (k == -1) {
                    k++;
                    opr[k] = str[i];
                } else {
                    int a = precedenceOf(str[i]);
                    int b = precedenceOf(opr[k]);

                    while (k >= 0 && a <= b) {
                        j++;
                        opd[j] = opr[k];
                        k--;

                        if (k == -1) {
                            break;
                        }

                        b = precedenceOf(opr[k]);
                    }
                    k++;
                    opr[k] = str[i];
                }
            }

        }
        while (k != -1) {
            j++;
            opd[j] = opr[k--];
        }
        

        // postfix Evaluation 
        int[] stack = new int[10];
        int s = -1 ;

        for (int i = 0; i <= j; i++) {

            if (opd[i] >= 48 && opd[i] <= 57) {
                s++;
                stack[s] = opd[i] - 48;
            } else {
                
                int b = stack[s];
                s--;
                int a = stack[s];
                s--;
                int c = 0;

                if (opd[i] == '+') {
                    c = a + b;
                } else if (opd[i] == '-') {
                    c = a - b;
                } else if (opd[i] == '*') {
                    c = a * b;
                } else if (opd[i] == '/') {
                    c = a / b;
                }
                s++;
                stack[s] = c;
            }
        }
       System.out.println(stack[s]);
       
    }
}