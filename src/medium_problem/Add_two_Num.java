package medium_problem;

//import data_structure.LinkedList.Node;

public class Add_two_Num {
	int sum=0;
	 public class ListNode {
	    int val;
	    ListNode next;
	   
	    ListNode()
	    {
	    	
	      
	    }
	    ListNode(int val) 
	    {
	        this.val = val;
	        sum=sum*10+val; 
	    }
	    ListNode(int val, ListNode next) 
	    {
	        this.val = val;
	        this.next = next;
	    }
	}
	
	   /* 	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	
	    int num=l1.size();
	        int num1=l2.size();
	         int val2,sum=0;
	         int val3,sum1=0;
	        if(num>=1){
	       val2=l1.get(num);
	       sum=sum*10+val2;
	        num--;
	        }
	        if(num1>=1){
	       val3=l1.get(num);
	       sum1=sum1*10+val2;
	        num--;
	        }*/
		
	     /*   int SUM_OF_TWO_NUM=sum+sum1;
	         ListNode l3=new ListNode();
	        if(SUM_OF_TWO_NUM!=0)
	        {
	            int r=SUM_OF_TWO_NUM%10;
	           l3.add(r);
	        SUM_OF_TWO_NUM=SUM_OF_TWO_NUM/10;
	        }
	        return l3;

	    }	        */
	 
	 
	 
	 
	

public static void main(String a[])
{
	ListNode l1=new ListNode();
	ListNode head = new ListNode(1);
	ListNode second = new ListNode(2);
	ListNode third = new ListNode(3);

	System.out.println(sum);
	ListNode l2=new ListNode();
	
}
}

