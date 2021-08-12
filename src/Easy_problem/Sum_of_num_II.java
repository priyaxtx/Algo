package Easy_problem;
import java.util.*;
public class Sum_of_num_II {
public int[] twoSum(int[] nums, int target) {
	Map<Integer,Integer>m=new HashMap<>();
	boolean flag = false;
for(int i=0;i<=nums.length-1;i++)
{
	if(flag==false) {                                           
	int tempt=target-nums[i];
	if(m.containsKey(tempt)&&(i!=m.get(tempt)))
	{ 
		System.out.println(m.get(tempt)+" "+i);
		flag=true;
		}
	else
	{
		m.put(nums[i],i);
	}}
	
}

if(target!=((Object) m).getValue())  
	{
	
	}
	}
public static void main(String args[])
{
int[] nums= {3,5,3};
int target=6;
Sum_of_num_II obj=new Sum_of_num_II();

obj.twoSum(nums, target);
	
}
}
