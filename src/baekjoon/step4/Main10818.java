package baekjoon.step4;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main10818 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numbers = Integer.parseInt(br.readLine());
        String[] inputs = br.readLine().split(" ");
        int[] arrays = new int[numbers];
        for(int i=0; i<numbers; i++){
            arrays[i] = Integer.parseInt(inputs[i]);
        }
        int max = arrays[0];
        int min = arrays[0];
        for(int i=0; i<numbers;i++){
            if(max < arrays[i]){
                max = arrays[i];
            }
            if(min > arrays[i]){
                min = arrays[i];
            }
        }
        System.out.println(min + " " + max);
        br.close();
    }
}

// 코드 계산 시간이 508ms로 너무 오래걸림.
//개선의 여지가 있는지 고민해보자
