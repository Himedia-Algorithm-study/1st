import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int nums[] = {1,2};
        System.out.println(nums.length);

//        getDivisors(n);
        solution(n);
    }

    // 약수 구하기
    public static int[] getDivisors(int n) {
        ArrayList answer = new ArrayList();

        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                answer.add(i);
            }
        }
        System.out.println(answer);

        return answer.stream().mapToInt(x->(int)x).toArray();
    }

    // 에라토스테네스의 체 소수구하기
    public static int solution(int n) {
        int answer = 0;

        List<Boolean> primeList = new ArrayList<>(n+1);
        primeList.add(false);
        primeList.add(false);

        for(int i=2; i*i<=n; i++){
            // primeList.get(i)가 true라면,
            // 그 배수들은 전부 그 숫자를 약수로 가지게 되므로 false 처리
            if (primeList.get(i)) {
                for (int j = i * i; j <= n; j+=i) {
                    primeList.set(j, false);
                }
            }
        }

        List<Integer> temp = new ArrayList<>();

        //PrimeList에서 true인 값들을 숫자 배열로 변환
        for (int i = 0; i < primeList.size(); i++) {
            if(primeList.get(i)){
                temp.add(i);
            }
        }

        // 값을 넣을 때마다 answer를 증가시켜 소수의 갯수 카운트
        int[] primeArray = new int[temp.size()];

        for (int i = 0; i < temp.size(); i++) {
            primeArray[i] = temp.get(i);
            answer++;
        }

        return answer;
    }

}