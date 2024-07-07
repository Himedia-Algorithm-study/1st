import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        getDivisors(n);
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
}