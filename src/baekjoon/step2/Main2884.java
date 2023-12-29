package baekjoon.step2;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Main2884 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int hour = Integer.parseInt(input[0]);
        int minute = Integer.parseInt(input[1]);

        if(minute >= 45){
            minute -= 45;
        }else{
            if(hour > 0){
                hour -= 1;
            }else {
                hour = 23;
            }
            minute += 15;
        }
        System.out.println(hour + " " + minute);
        br.close();
    }
}
