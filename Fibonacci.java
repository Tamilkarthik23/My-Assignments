package assignments.w1d2;

public class Fibonacci {
	public static void main(String[] args) {
		
int n=8,r1=0,r2=1;
System.out.println("The Fibonacci series for the range " +n+ " is");
for(int i=1;i<=n;++i)
{
	int nextTerm = r1+r2;
	r1=r2;
	r2=nextTerm;
	System.out.print(r1 +",");
}

}
}

