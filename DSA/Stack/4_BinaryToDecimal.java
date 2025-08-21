import java.util.* ;
class BinaryToDecimal {
    
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Binary No : ");
        int n = sc.nextInt();
        int sum = 0 , power = 1 ;
        while ( n > 0 ){
            int r = n % 10 ;
            sum = sum + r * power ;
            power = power * 2 ;
            n = n / 10 ;
        }

        System.out.println("No is : "+ sum);
    }
}
