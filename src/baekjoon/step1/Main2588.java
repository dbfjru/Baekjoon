package baekjoon.step1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main2588 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int num2_100 = num2/100;
        int num2_10 = (num2%100)/10;
        int num2_1 = num2%10;
        System.out.println(num1*num2_1);
        System.out.println(num1*num2_10);
        System.out.println(num1*num2_100);
        System.out.println(num1*num2);
    }
    //결과를 재활용 해서 마지막 출력문을 고친다면 연산속도가 빨라질까?
}
