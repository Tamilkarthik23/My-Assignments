package assignment.w1d4;

public class RemoveDupwords {
	    public static void main(String[] args) {
	        String text = "We learn Java basics as part of java sessions in java week1";

	        // Splitting the text into an array of words using space as the delimiter
	        String[] words = text.split(" ");
	        
	        int count = 0; // Variable to keep track of duplicate word count

	        // Nested loops to compare each word with every other word
	        for (int a = 0; a < words.length; a++) {
	            for (int b = a + 1; b < words.length; b++) {
	                // Comparing words ignoring case
	                if (words[a].equalsIgnoreCase(words[b]) && !words[a].isEmpty()) {
	                    words[b] = ""; // Replacing duplicate word with empty string
	                    count++; // Incrementing count of duplicates found
	                }
	            }
	        }

	        // Printing modified words array if duplicates are found
	        if (count > 0) {
	            System.out.println("The text after removing the duplicated words: ");
	            for (String dupWord : words) {
	                if (!dupWord.isEmpty()) {
	                    System.out.print(dupWord + " ");
	                }
	            }
	        } else {
	            System.out.println("No duplicate words found in the text.");
	        }
	    }
	}


