package baekjoon.step3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main10951 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input ={,}; //size two String array for input
        int a = 0;
        int b = 0;
        String temp;
        while(true){
            temp = br.readLine();
            if(temp == null || temp.equals("")){ //EOF check! added for IDE '\n' input
                break;
            }else {
                input = temp.split(" ");
                a = Integer.parseInt(input[0]);
                b = Integer.parseInt(input[1]);
                System.out.println(a + b);
            }
        }
        br.close();
    }
}
