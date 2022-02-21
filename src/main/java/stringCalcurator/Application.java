package stringCalcurator;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Application {
    public static int answer = 0;

    public static void main(String args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String custom;
        if (inputNull(input)) {
            custom = findCustom(input);

        }
        System.out.println(answer);
    }

    public static boolean inputNull(String str) {
        if (str.isEmpty()) {
            return false;
        }
        return true;
    }

    public static String findCustom(String input) {
        Pattern pattern = Pattern.compile("//(.)\n(.*)");
        Matcher matcher = pattern.matcher(input);
        if (!matcher.find()) {
            return null;
        }
        String custom = matcher.group(1);
        return custom;
    }
}
