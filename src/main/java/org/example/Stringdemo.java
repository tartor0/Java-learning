package org.example;

public class Stringdemo {
    public static void main(String[] args) {
        String school_name = "Aptech PortHarcourt";

        char c = school_name.charAt(2);
        System.out.println(c);

        int t = school_name.indexOf("t");
        System.out.println(t);

        System.out.println(greet("kesi".concat(" uche\nMike \t\t ade")));
        System.out.println(greet("kesi"));

        String str = new String("This is lovely");

        String name = "Zion";

        // Change STEPHLINE → Stephline
        System.out.println(firstLetter("STEPHLINE"));


        String[] allStudentName = getAllStudentNames("michael, steph, fakuade");
        for (String all : allStudentName) {
            System.out.println(all.trim()); // trim removes spaces
        }

        // Example of type casting
        int price = 123456;
        String s = String.valueOf(price);
        System.out.println(s);
        int i = Integer.parseInt(s);
        System.out.println(i);

        StringBuilder sb = new StringBuilder("love is wicked");
        sb.append(" Valorant");
        System.out.println(sb);
        System.out.println(sb.reverse());

        System.out.println(reverseWords("God is Good"));

        String input = "abcabcbb";
        System.out.println("Input: " + input);
        System.out.println("longest substring without repeating characters: " + lengthOfLongestSubstring(input));

        String word = "Mike";
        int[] result = countVowelsAndConsonants(word);
        System.out.println("[" + result[0] + "," + result[1] + "]");
    }

    public static String greet(String name) {
        return "Hello, " + name + "!";
    }

    public static char first_letter(String name) {
        return name.charAt(0);
    }

    public static String firstLetter(String name) {
        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }

    public static String[] getAllStudentNames(String names) {
        return names.split(",");
    }


    public static String reverseWords(String words) {
        String[] s = words.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = s.length - 1; i >= 0; i--) {
            sb.append(s[i]).append(" ");
        }
        return sb.toString().trim();
    }

    public static int lengthOfLongestSubstring(String substr) {
        int maxLength = 0;

        for (int i = 0; i < substr.length(); i++) {
            String current = "";

            for (int j = i; j < substr.length(); j++) {
                char c = substr.charAt(j);

                if (current.indexOf(c) != -1) {
                    break;
                }

                current += c;

                maxLength = Math.max(maxLength, current.length());
            }
        }

        return maxLength;
    }


    public static int[] countVowelsAndConsonants(String input) {
        input = input.toLowerCase();

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;
            }
            else if (c >= 'a' && c <= 'z') {
                consonants++;
            }
        }

        return new int[] { vowels, consonants };
    }


    public static int[] countVowelsandConsonants(String str){
        String vowels = "aeiou";
        int vcount = 0;
        int ccount = 0;

        for (int i = 0; i < str.length(); i++) {
            if(vowels.indexOf(str.charAt(i)) !=-1){
                vcount++;
            }
        }
    }
}