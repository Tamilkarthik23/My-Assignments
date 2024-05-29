package assignment.w1d4;

public class OddIndextoUCase {
	public static void main(String[] args) {
        String word = "changeme";
		char[] charArray = word.toCharArray();
     
        for (int a = word.length()-1;a>=0;a--) {
        	if(a%2!=0) {
        
        	charArray[a]= Character.toUpperCase(charArray[a]);             
        	}
                
        }
        System.out.println(charArray);
	}
}
