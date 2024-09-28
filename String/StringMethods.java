package com.string;

public class StringMethods {
	 public static void main(String[] args) {
	        
	        String str = "Hello, World!";
	        String str2 = "   Java Programming   ";
	        
	        // 1. length(): Returns the length of the string
	        System.out.println("1. Length of the string: " + str.length());
	        
	        // 2. charAt(): Returns the character at the specified index
	        System.out.println("2. Character at index 7: " + str.charAt(7));
	        
	        // 3. substring(): Extracts a substring from the string
	        System.out.println("3. Substring from index 7 to 12: " + str.substring(7, 12));
	        
	        // 4. contains(): Checks if the string contains a specified sequence
	        System.out.println("4. Contains 'World': " + str.contains("World"));
	        
	        // 5. equals(): Compares two strings for equality
	        System.out.println("5. Equals 'Hello, World!': " + str.equals("Hello, World!"));
	        
	        // 6. equalsIgnoreCase(): Compares two strings for equality, ignoring case
	        System.out.println("6. EqualsIgnoreCase 'hello, world!': " + str.equalsIgnoreCase("hello, world!"));
	        
	        // 7. concat(): Concatenates two strings
	        System.out.println("7. Concatenation: " + str.concat(" How are you?"));
	        
	        // 8. replace(): Replaces all occurrences of a character or substring
	        System.out.println("8. Replace 'World' with 'Java': " + str.replace("World", "Java"));
	        
	        // 9. toLowerCase(): Converts the string to lower case
	        System.out.println("9. To Lower Case: " + str.toLowerCase());
	        
	        // 10. toUpperCase(): Converts the string to upper case
	        System.out.println("10. To Upper Case: " + str.toUpperCase());
	        
	        // 11. trim(): Removes leading and trailing whitespaces
	        System.out.println("11. Trimmed string: '" + str2.trim() + "'");
	        
	        // 12. split(): Splits the string into an array of substrings based on a delimiter
	        String[] words = str.split(", ");
	        System.out.println("12. Split by ', ': ");
	        for (String word : words) {
	            System.out.println(word);
	        }

	        // 13. startsWith(): Checks if the string starts with a specified prefix
	        System.out.println("13. Starts with 'Hello': " + str.startsWith("Hello"));

	        // 14. endsWith(): Checks if the string ends with a specified suffix
	        System.out.println("14. Ends with '!': " + str.endsWith("!"));
	        
	        // 15. indexOf(): Returns the index of the first occurrence of a character or substring
	        System.out.println("15. Index of 'o': " + str.indexOf('o'));
	        
	        // 16. lastIndexOf(): Returns the index of the last occurrence of a character or substring
	        System.out.println("16. Last index of 'o': " + str.lastIndexOf('o'));
	        
	        // 17. isEmpty(): Checks if the string is empty
	        System.out.println("17. Is string empty: " + str.isEmpty());
	        
	        // 18. matches(): Checks if the string matches a given regular expression
	        System.out.println("18. Matches regex '[A-Za-z, ]+!': " + str.matches("[A-Za-z, ]+!"));

	        // 19. compareTo(): Compares two strings lexicographically
	        System.out.println("19. Compare 'Hello, World!' with 'Hello, Java!': " + str.compareTo("Hello, Java!"));

	        // 20. valueOf(): Converts different types to a string
	        int num = 42;
	        System.out.println("20. String value of number 42: " + String.valueOf(num));
	    }
}
