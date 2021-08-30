package Easy_problem;
import java.util.Scanner;
public class Operation_wintout_sign {
public static void main(String ar[])
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter two number:");
	int num1=scan.nextInt();
	int num2=scan.nextInt();
	System.out.println(num1>num2?num1:num2);
}
}
