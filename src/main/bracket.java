package org.example;

import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

import java.io.BufferedReader;
import java.io.IOException;

public class bracket {
    public static void main(String[] args) throws IOException {
        // 입력을 받기 위해 BufferedReader를 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 출력을 모아서 처리하기 위해 StringBuilder를 사용
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;

        // 테스트 케이스의 개수를 입력
        int count = Integer.parseInt(br.readLine());

        // 케이스 반복
        for (int i = 0; i < count; i++) {
            // 각 괄호 문자열을 처리하기 위해 스택을 생성
            Stack<Character> stack = new Stack<>();

            // 한줄 입력 받음
            st = new StringTokenizer(br.readLine(), "\n");
            String input = st.nextToken();

            // 입력 문자열의 길이를 저장
            int inputLength = input.length();

            // 입력 문자열의 각 문자 반복
            for (int j = 0; j < input.length(); j++) {
                // 문자열을 문자 배열로 변환
                char[] inputArray = input.toCharArray();
                // 현재 문자가 '('인 경우 스택에 푸시
                if (inputArray[j] == '(') {
                    stack.push('(');
                } else {
                    // 현재 문자가 ')'인 경우
                    if (stack.empty()) break; // 스택 비면 반복문을 종료
                    else stack.pop(); // 스택이 비어있지 않으면 스택에서 하나를 pop함.
                }
                inputLength--; // 입력 문자열의 길이를 하나 줄임.
            }

            // 스택이 비어있고 입력 문자열의 길이가 0이면 YES를 출력.
            if (stack.empty() && (inputLength == 0)) {
                System.out.println("YES");
            } else {
                // 그렇지 않으면 NO를 출력
                System.out.println("NO");
            }
        }
    }
}

/*
[괄호]
난이도가 매우 심각함니다. 넘 어렵지 않슴니까 코치님..ㅠ
인텔리제이가 어색해서 이클립스에 돌리고 채점후에 가져왔슴니다.
설명은 일요일에 같이 하시죠. 위에 주석보고 참고 부탁드림니다.
 */