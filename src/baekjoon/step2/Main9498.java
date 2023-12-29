package baekjoon.step2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main9498 {
    public static void main(String[ ] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int score = Integer.parseInt(input);

        switch (score/10){
            case 10:
                System.out.println("A");
                break;
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
                break;
        }
        br.close();
    }
}
