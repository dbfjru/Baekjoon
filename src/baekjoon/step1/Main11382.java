package baekjoon.step1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main11382 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        long a = Long.parseLong(input[0]);
        long b = Long.parseLong(input[1]);
        long c = Long.parseLong(input[2]);
        System.out.println(a+b+c);
    }
}
