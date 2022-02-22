package stringCalcurator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Application {
    public static int answer = 0;

    public static void main(String[] args) {
        System.out.println("start!");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String custom;
        String[] num;
        if (inputNull(input)) {
            custom = findCustom(input);
            input = CutCustom(input,custom);
            System.out.println(custom);
            System.out.println(input);
            num = splitString(input,custom);
            answer = sumNumber(num);
        }
        System.out.println(answer);
    }

    public static boolean inputNull(String str) {
        if (str == null || str.isEmpty()) {
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

    public static String CutCustom(String input, String custom) {
        if (custom != null) {
            input = input.substring(1+2+custom.length());
        }
        return input;
    }

    public static String[] splitString(String input,String custom) {
        String[] notCustom = input.split(",|:");
        if (custom == null || custom.isEmpty()) {
            return notCustom;
        }
        ArrayList<String> splitCustom = new ArrayList<>();
        for (String str : notCustom) {
            splitCustom.addAll(List.of(str.split(custom)));
        }
        notCustom = new String[splitCustom.size()];
        for (int i = 0; i < notCustom.length; i++) {
            notCustom[i] = splitCustom.get(i);
        }
        return notCustom;
    }

    public static int sumNumber(String[] num) {
        int total = 0;
        for (String n : num) {
            checkNumber(n);
            total += Integer.parseInt(n);
        }
        return total;
    }

    public static void checkNumber(String n) {
        if (Integer.parseInt(n) < 0) {
            throw new RuntimeException("[ERROR]");
        }

    }

    public static String printString(String input,String custom) {
        return Arrays.toString(splitString(input, custom));
    }
}
