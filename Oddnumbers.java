package assignments.w1d2;

public class Oddnumbers {
public static void main(String[] args) {
	int x=10;
	System.out.println("The odd numbers from 1 to 10 is,");
	for(int i=1;i<=x;i++) {
		if(i%2!=0)
		{
			System.out.print(i+ " ");
		}
	}
}

}