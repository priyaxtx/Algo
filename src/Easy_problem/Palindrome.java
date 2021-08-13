package Easy_problem;

public class Palindrome {
	public static void main(String a[])
	{
		Palindrome p=new Palindrome();	
		p.isPalindrome(2147483647);
}
		  public boolean isPalindrome(int x){
			  System.out.println(x);
		    int reverse=0;
		  int duplicate_x=x;
		    for(int i=0;i<=x;i++)
		       {
		      int r=x%10;
		      reverse=(reverse*10)+r;
		      x=x/10;
		     
		      
		        }
		    
		    System.out.println(reverse);
		        if(x>=1){
		         reverse=(reverse*10)+x;
		        }
		        System.out.println(reverse);
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

