package arthmatic;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cal = sc.nextInt();
        switch (cal){

            case 1:
                System.out.println("Addition");
                System.out.println("Enter the two digits :");
                int x= sc.nextInt();
                int y=sc.nextInt();
                int add;
                add=x+y;
                System.out.println("The addition is :"+add);
                break ;

            case 2:
                System.out.println("Subtraction");
                System.out.println("Enter the two digits :");
                int p= sc.nextInt();
                int q=sc.nextInt();
                int sub;
                sub=p-q;
                System.out.println("The subtraction is :"+sub);
                break ;

            case 3:
                System.out.println("Multiplication");
                System.out.println("Enter the two digits :");
                int m= sc.nextInt();
                int n=sc.nextInt();
                int mul;
                mul=m*n;
                System.out.println("The multiplication is :"+mul);
                break ;

            case 4:
                System.out.println("Division");
                System.out.println("Enter the two digits :");
                int a= sc.nextInt();
                int b=sc.nextInt();
                int div;
                div=a/b;
                System.out.println("The addition is :"+div);
                break ;

            default:{
                System.out.println("you entered invalid number");
            }




        }

    }
}