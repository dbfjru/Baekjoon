package baekjoon.step3;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Main11022 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        int a = 0;
        int b = 0;
        String result="";
        for(int i=1; i<=T; i++){
            String[] input = br.readLine().split(" ");
            a = Integer.parseInt(input[0]);
            b = Integer.parseInt(input[1]);
            result = Integer.toString(a+b);
            bw.write("Case #"+i+": ");
            bw.write(a +" + " + b +" = "+result+'\n');
        }
        bw.close();
        br.close();
    }
}
