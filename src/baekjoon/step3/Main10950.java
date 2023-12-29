package baekjoon.step3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10950 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseNum = Integer.parseInt(br.readLine());
        int left, right;
        for(int i=0; i<caseNum; i++){
            String[] input = br.readLine().split(" ");
            left = Integer.parseInt(input[0]);
            right = Integer.parseInt(input[1]);
            System.out.println(left+right);
        }
        br.close();
    }
}
