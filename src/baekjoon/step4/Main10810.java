package baekjoon.step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10810 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        int size = Integer.parseInt(temp[0]);
        int times = Integer.parseInt(temp[1]);

        int[] baskets = new int[size]; //바스켓 만들었음
        //이제 필요한 건 바스켓에 공을 채우는 과정
        for(int i=0; i<times;i++){
            String[] temp_input = br.readLine().split(" ");
            for(int j=Integer.parseInt(temp_input[0]); j<=Integer.parseInt(temp_input[1]); j++){
                baskets[j-1] = Integer.parseInt(temp_input[2]);
            }
        }
        for(int a : baskets)
            System.out.print(a + " ");
        br.close();
    }
}
// 좀 더 깔끔하게 짤 수 없는지 고민해보자. String[] temp, temp_input 등 너무 우아하지않음.