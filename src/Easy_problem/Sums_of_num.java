package Easy_problem;
import java.util.ArrayList;
import java.util.Collections;
public class Sums_of_num {
	public void twoSum() {
       ArrayList<Integer> nums=new  ArrayList<Integer>();
       int flag=0;
       nums.add(1);          //1
       nums.add(52);        //2
       nums.add(920);      //3
       nums.add(23);      //4
       nums.add(120);    //5
       nums.add(121);   //6
       nums.add(4);    //7
       nums.add(52);  //8
       int target= 143;
       Collections.sort(nums); 
        int nums_length=nums.size();
        for(int i=1;i<=nums_length-1;i++)
        {
            for(int j=1;j<=nums_length-1;j++)
            {
            	if(flag==0) {
               if(nums.get(j-1)+nums.get(i)==target)
                    {
                        System.out.println(j-1+","+i);
                        System.out.print(nums.get(j-1)+","+ nums.get(i)+ " = ");
                        System.out.println(nums.get(j-1)+nums.get(i));
                   flag=1;
                        }}}}}
                    public static void main(String a[]){
	Sums_of_num obj=new Sums_of_num();
     obj.twoSum();
}
}

