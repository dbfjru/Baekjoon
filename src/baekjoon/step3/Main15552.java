package baekjoon.step3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main15552 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int test_case = Integer.parseInt(br.readLine());

        int a = 0 ;
        int b = 0;
        String result="";
        for(int i=0; i<test_case;i++){
            String[] input = br.readLine().split(" ");
            for(int j=0; j< input.length; j++)
                System.out.println(input[j]);
//            a = Integer.parseInt(input[0]);
//            b = Integer.parseInt(input[1]);
//            result = Integer.toString(a+b);
//            bw.write(result+"\n"); // 개행하는 과정 필요!
            //BufferedWriter의 write 메소드는 문자 또는 스트링 출력만 지원!
            //따라서 숫자를 그대로 출력하고 싶다면 문자열로 바꿔주는 과정이 필요하다.
        }
        br.close(); // flush 하는 과정에서 한번에 출력됨
        bw.close();
    }
}
