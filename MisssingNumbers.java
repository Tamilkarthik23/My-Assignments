package assignment.w1d3;

import java.util.ArrayList;
import java.util.Arrays;

public class MisssingNumbers {

public static void main(String[] args) {
	int[] n = {1,7,4,5,11,8,3};
ArrayList<Integer> missingNumbers= findMissingNumbers(n);
System.out.println("The Missing Numbers are " +missingNumbers);
	
}


private static ArrayList<Integer> findMissingNumbers(int[] n) {
	// TODO Auto-generated method stub
	ArrayList<Integer> missingNumbers = new ArrayList<Integer>();
	Arrays.sort(n);
	for(int i=1;i<n[n.length-1];i++)
	{
		if(Arrays.binarySearch(n,i)<0)
		{
			missingNumbers.add(i);
		}
	
}
	return missingNumbers;
}	
}