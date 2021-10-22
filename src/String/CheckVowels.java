package String;

import java.util.Scanner;

public class CheckVowels {
    public static void main(String[] args) {
        System.out.println(!hasVowels("This is a string"));
        System.out.println(hasVowels("Hello world"));
        System.out.println(hasVowels("Java is fun"));
        System.out.println(!hasVowels("123hi"));
        System.out.println(hasVowels("Coding vs Programming"));
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Input word to check: ");
            System.out.println(hasVowels(scanner.nextLine()));
            System.out.println("Do you want to continue? (Y/N)");
            String inputChoice = scanner.nextLine();
            if(inputChoice.equalsIgnoreCase("N") || !inputChoice.equalsIgnoreCase("Y")){
                System.out.println("Bye!");
                break;
            }
        }
    }

    public static boolean hasVowels(String input) {
        if (input.matches("[AEIOUaeiou]")){
            countVowels(input);
            return true;
        }
        return false;
    }

    public static void countVowels(String input) {
        input = input.toLowerCase();
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a'
                    || input.charAt(i) == 'e'
                    || input.charAt(i) == 'i'
                    || input.charAt(i) == 'o'
                    || input.charAt(i) == 'u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
