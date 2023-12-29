package baekjoon.step3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main25304 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i=0; i<N; i++){
            String[] input = br.readLine().split(" ");
            int temp_price = Integer.parseInt(input[0]);
            int temp_quantity = Integer.parseInt(input[1]);
            sum += temp_quantity*temp_price;
        }
        if(sum == X){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        br.close();
    }
}
