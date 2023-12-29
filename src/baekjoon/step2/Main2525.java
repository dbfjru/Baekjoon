package baekjoon.step2;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Main2525 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input_now = br.readLine().split(" ");
        String input_cooking = br.readLine();

        int hour = Integer.parseInt(input_now[0]);
        int minute = Integer.parseInt(input_now[1]);
        int cooking = Integer.parseInt(input_cooking);

        int temp_h = (minute + cooking)/60;
        int temp_m = (minute + cooking)%60;

        minute = temp_m;
        hour = (hour+temp_h)%24;
        System.out.println(hour + " " + minute);
        br.close();
    }
}
//나누기와 나머지로 처리한 것이 아주 효과적이었다. 굿 아이디어!