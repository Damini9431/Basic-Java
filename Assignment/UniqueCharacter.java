package com.assignment;
import java.util.HashMap;
import java.util.Scanner;
public class UniqueCharacter {
	public static void findUniqueCharacters(String str) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        System.out.print("Unique characters: ");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (charCountMap.get(ch) == 1) {
                System.out.print(ch);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        findUniqueCharacters(inputString);

        scanner.close();
    }
}

