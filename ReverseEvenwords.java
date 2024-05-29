package assignment.w1d4;

public class ReverseEvenwords {
    public static void main(String[] args) {
        String test = "India is my country";

        // Splitting the text into an array of words using space as the delimiter
        String[] words = test.split(" ");
        for (int a = 0; a < words.length; a++) {
        	if(a%2!=0) {
        		char[] charArray = words[a].toCharArray();

                // Reverse the character array
                reverseCharArray(charArray);

                // Print the reversed word
                System.out.print(new String(charArray) + " ");
               
            }
        	else {
        		System.out.print(words[a]);
        	}
        System.out.print(" ");
        }
        
    }


	public static void reverseCharArray(char[] arr) {
		// TODO Auto-generated method stub
		int start = 0;
		int end = arr.length-1;
		while(start<end) {
			char temp = arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
        		
}