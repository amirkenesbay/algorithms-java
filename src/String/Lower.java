package String;

public class Lower {
    public static void main(String[] args) {
        String[] strings = {"ABC", "ABC123", "abcAbc", "abc123ABC"};
        for (String s : strings) {
            System.out.println(toLowerCase(s));
        }
    }

    public static String toLowerCase(String s){
        char[] values = s.toCharArray();
        for (int i = 0; i < values.length; i++) {
            if(Character.isLetter(values[i]) && Character.isUpperCase(values[i])){
                values[i] = Character.toLowerCase(values[i]);
            }
        }
        return new String(values);
    }
}
