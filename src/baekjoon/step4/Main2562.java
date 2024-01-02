package baekjoon.step4;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Main2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] inputs = new int[9];
        for (int i = 0; i < 9; i++) {
            inputs[i] = Integer.parseInt(br.readLine());
        }
        int max = inputs[0];
        int index = 0;
        for (int i = 0; i < 9; i++) {
            if (max < inputs[i]) {//최댓값 찾고 그때의 인덱스 저장!
                max = inputs[i];
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index + 1); //인덱스+1 해줘야 원하는 출력
        br.close();
    }
}
