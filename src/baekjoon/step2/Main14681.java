package baekjoon.step2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main14681 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str_x = br.readLine();
        String str_y = br.readLine();
        int x = Integer.parseInt(str_x);
        int y = Integer.parseInt(str_y);

        if(x>0){
            //1,4
            if(y>0){
                System.out.println(1);
            }else{
                System.out.println(4);
            }
        }else{
            //2,3
            if(y>0){
                System.out.println(2);
            }else{
                System.out.println(3);
            }
        }
        br.close();
    }
}
