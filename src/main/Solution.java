package org.example;

import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(arr[0]);

        int i = 1;
        while (i < arr.length) {
            if (stack.peek() == arr[i]) {
                i++;
                continue;
            } else {
                stack.push(arr[i]);
            }
            i++;
        }

        answer = new int[stack.size()];
        for (int j = stack.size() - 1; j >= 0; j--) {
            answer[j] = stack.pop();
        }

        return answer;
    }
}
