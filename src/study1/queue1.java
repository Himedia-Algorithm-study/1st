package study1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class queue1 {

    public static void main(String[] args) {
        // 정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
        //
        //명령은 총 여섯 가지이다.
        //
        //push X: 정수 X를 큐에 넣는 연산이다.
        //pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        //size: 큐에 들어있는 정수의 개수를 출력한다.
        //empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
        //front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        //back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            String command = sc.nextLine();


            switch (command) {
                case "pop":
                    try {
                        int value = queue.remove();
                        System.out.println(value);

                    } catch (Exception e) {
                        System.out.println(-1);

                    }
                    break;

                case "size":
                    System.out.println(queue.size());
                    break;

                case "empty":
                    if (queue.isEmpty()) {
                        System.out.println(1);

                    } else {
                        System.out.println(0);
                    }
                    break;

                case "front":
                    if (queue.peek() != null) {
                        System.out.println(queue.peek());

                    } else {
                        System.out.println(-1);

                    }
                    break;

                case "back":
                    if (queue.isEmpty()) {
                        System.out.println(-1);

                    } else {
                        System.out.println(((LinkedList<Integer>) queue).getLast());

                    }

                default:
                    if (command.substring(0, 4).equals("push")) {
                        int X = Integer.parseInt(command.split(" ")[1]);
                        try {
                            queue.add(X);
                        } catch (Exception e) {
                        }
                    }
                    break;
            }
        }
    }
}
