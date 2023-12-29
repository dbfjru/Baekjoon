package baekjoon.step3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main25314 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int num = N/4;

        for(int i=0; i<num; i++){
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
