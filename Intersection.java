package assignment.w1d3;

public class Intersection {
	public static void main(String[] args) {
		int[] array1= {2,3,5,8,9,7};
		int[] array2= {3,4,6,7,8,9};
		System.out.print("Matching items are:  ");
		for (int num1:array1)
		{
			for(int num2:array2)
			{
				if (num1 == num2)
				{
					System.out.print(num1);
					System.out.print(", ");
					break;
				}
			}
		}
		
	}

}
