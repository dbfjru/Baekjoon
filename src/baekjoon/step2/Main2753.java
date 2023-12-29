package baekjoon.step2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main2753 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int year = Integer.parseInt(input);

        if((year%4==0) && (year%100 != 0)){
            System.out.println(1);
        }else if(year%400 == 0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
        br.close();
    }
}
