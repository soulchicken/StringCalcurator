package stringCalcurator;

import java.util.Scanner;

public class Application {
    public static int answer = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        if (inputNull(input)) {
            // null이 아니면 이 안에서 여러 과정이 수행될 예정
        }
        System.out.println(answer);
    }

    public static boolean inputNull(String str) {
        if (str.isEmpty()) {
            return false;
        }
        return true;
    }

}
