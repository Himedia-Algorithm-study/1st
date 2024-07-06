package org.example;

import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

import java.io.BufferedReader;
import java.io.IOException;

public class bracket {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        StringTokenizer st;

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            Stack<Character> stack = new Stack<>();

            st = new StringTokenizer(br.readLine(), "\n");
            String input = st.nextToken();

            int inputLength = input.length();

            for (int j = 0; j < input.length(); j++) {
                char[] inputArray = input.toCharArray();
                if (inputArray[j] == '(') {
                    stack.push('(');
                } else {
                    // 현재 문자가 ')'인 경우
                    if (stack.empty()) break;
                    else stack.pop();
                }
                inputLength--;
            }


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
설명은 일요일에 같이 하시죠.
 */