package study1;

import java.util.Scanner;
import java.util.Stack;

public class stack2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            String input = sc.nextLine();
            Stack<Character> stack = new Stack<>();
            boolean isVPS = true;

            for (char c : input.toCharArray()) {
                if (c == '(') {
                    stack.push(c);

                } else {
                    if (stack.isEmpty()) {
                        isVPS = false;
                        break;

                    } else {
                        if (c == ')') {
                            stack.pop();

                        }
                    }
                }

            }

            if (!stack.isEmpty()) {
                isVPS = false;

            }

            System.out.println(isVPS ? "YES" : "NO");
        }
    }
}
