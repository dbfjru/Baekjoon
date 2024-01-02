package baekjoon.step4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10807 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        String target = br.readLine();
        int count = 0;
        for(String s : input){
            if(target.equals(s)){
                count++;
            }
        }
        System.out.println(count);
        br.close();
    }
}
