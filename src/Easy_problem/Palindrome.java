package Easy_problem;

public class Palindrome {
	public static void main(String a[])
	{
		Palindrome p=new Palindrome();	
		p.isPalindrome(1122211);
}
		  public boolean isPalindrome(int x){
		    int reverse=0;
		  int duplicate_x=x;
		    for(int i=0;i<=x;i++)
		       {
		      int r=x%10;
		      reverse=(reverse*10)+r;
		      x=x/10;
		        }
		        if(x>=1){
		         reverse=(reverse*10)+x;
		        }
		         if(reverse==duplicate_x)
		            {
		        	 System.out.println("it is palindrome");
		              return true;
		             }
		            else
		            {
		            	System.out.println(" not a palindrome");
		           return false; 
		            }
		          }
		}

