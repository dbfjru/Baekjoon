package baekjoon.step2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main1330 {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         String[] input = null;
         try{
             input = br.readLine().split(" ");
         }catch(IOException e){
             e.printStackTrace();
         }
         int n1 = Integer.parseInt(input[0]);
         int n2 = Integer.parseInt(input[1]);
         if(n1 == n2){
             System.out.println("==");
         }else if(n1 > n2){
             System.out.println(">");
         }else{
             System.out.println("<");
         }
    }
}
