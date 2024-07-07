package study1;

import java.util.*;

public class stack1 {
    public int[] solution(int[] arr) {
        int[] answer = {};

        List<Integer> temp = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                temp.add(arr[0]);
            } else if (arr[i] != arr[i - 1]) {
                temp.add(arr[i]);
            }
        }

        answer = temp.stream().mapToInt(Integer::intValue).toArray();
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
