package String;

import java.util.Scanner;

public class CharactersSame {
    public static void main(String[] args) {
        System.out.println(isAllCharactersSame(""));
        System.out.println(!isAllCharactersSame("aab"));
        System.out.println(isAllCharactersSame("aaa"));
        System.out.println(isAllCharactersSame("1111"));
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Input word to check: ");
            System.out.println(isAllCharactersSame(scanner.next()));
            System.out.println("Do you want to continue? (Y/N)");
            String inputChoice = scanner.next();
            if(inputChoice.equalsIgnoreCase("N") || !inputChoice.equalsIgnoreCase("Y")){
                System.out.println("Bye!");
                break;
            }
        }
    }

    public static boolean isAllCharactersSame(String s){
        for (int i = 1; i < s.length(); i++) {
            s = s.toLowerCase();
            if(s.charAt(i) != s.charAt(0) ){
                return false;
            }
        }
        return true;
    }

}
