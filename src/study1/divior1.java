package study1;

import java.util.*;

public class divior1 {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> temp = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            if(n%i==0) temp.add(i);
        }

        answer = temp.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}
