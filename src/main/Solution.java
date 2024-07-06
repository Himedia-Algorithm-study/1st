package org.example;

import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        // Stack 생성: 중복 제거한 숫자 저장하기 위해 스택을 사용
        Stack<Integer> stack = new Stack<Integer>();
        // 배열의 첫 번째 요소를 스택에 추가
        stack.push(arr[0]);

        // while문으로 arr[i]와 stack.peek() 비교
        int i = 1; // 인덱스 변수 초기화
        while (i < arr.length) { // 배열의 끝까지 반복
            if (stack.peek() == arr[i]) {
                // 스택의 최상단 요소와 현재 배열 요소가 같으면 중복 -> 패스
                i++; // 다음 요소 이동
                continue;
            } else {
                // 중복 아니면 현재 배열 요소 스택에 추가
                stack.push(arr[i]);
            }
            i++; // 다음 요소 이동
        }

        // 스택의 크기만큼 배열을 생성
        answer = new int[stack.size()];
        // stack.pop()은 거꾸로 꺼내짐.for문으로 재정렬 (스택은 LIFO 구조이므로 실배열의 역순으로)
        for (int j = stack.size() - 1; j >= 0; j--) {
            answer[j] = stack.pop();
        }

        // 중복이 제거된 배열을 반환
        return answer;
    }
}


/*
[배열]
중복을 제거한 숫자들을 저장하기 위해 stack 생성하여 사용함.
배열의 첫번째 요소는 무조건 스택에 추가함.
while문으로 배열을 순회하며 끝까지 반복해 스택의 최상위 요소와 현재 배열요소를 비교. 중복제거
스택의 크기만큼 배열 생성하고, 스택에서 요소를 꺼내 배열에서 . 스택은 LIFO 구조임. 꺼낼때는 반대로
중복이 제거된 배열을 반환해야 제값이 나옴. 하나씩 지워보세용. for문으로 하는게 쉬움.
 */