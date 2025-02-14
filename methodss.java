import java.util.Scanner;
public class methodss {
    public static void main(String[] args) {
    sum();
    }
    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = sc.nextInt();
        int sum = num1 + num2 ;
        System.out.println("The sum is" + sum);
    }
}
