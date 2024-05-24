package assignments.w1d2;


public class IsPrime {

public static void main(String[] args) {
	int Number = 20;
	boolean prime = true;
	for (int i = 2;i < Number; i++) 	{
			if (Number%i==0) {
		prime = false;
			}
}
if (prime==true) {
	
	System.out.println(Number+"  is a prime number");
}
else
	{
		System.out.println(Number+"  is not a prime number");
	}
}
}




	
