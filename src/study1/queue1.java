package study1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class queue1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            String command = sc.nextLine();

            switch (command) {
                case "pop":
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(queue.remove());
                    }
                    break;

                case "size":
                    System.out.println(queue.size());
                    break;

                case "empty":
                    System.out.println(queue.isEmpty() ? 1 : 0);
                    break;

                case "front":
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(queue.peek());
                    }
                    break;

                case "back":
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(((LinkedList<Integer>) queue).getLast());
                    }
                    break;

                default:
                    if (command.startsWith("push")) {
                        try {
                            int X = Integer.parseInt(command.split(" ")[1]);
                            queue.add(X);
                        } catch (Exception e) {
                            // push 명령어에서 에러가 발생하면 아무 동작도 하지 않습니다.
                        }
                    }
                    break;
            }
        }
        sc.close(); // Scanner를 닫습니다.
    }
}
