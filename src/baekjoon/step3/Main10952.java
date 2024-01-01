package baekjoon.step3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main10952 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = {,};//input 이 2개씩 들어오는 걸 알고 있으므로!
        int a=0;
        int b=0;
        while(true){
            input = br.readLine().split(" ");
            if(input[0].equals("0") && input[1].equals("0")){
                break;
            }
            a = Integer.parseInt(input[0]);
            b = Integer.parseInt(input[1]);
            System.out.println(a+b);
        }
    }
}
/* 추후에 BufferedWriter를 이용해서 한번에 출력하는 걸로 바꿔보자.
* */