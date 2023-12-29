package baekjoon.step2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main2480 {
    static int maxOfThree(int a, int b, int c){
        //항상 a,b,c가 다를 때만 호출됨
        if(a>b){
            if(a>c){
                return a;
            }else{
                return c;
            }
        }else {
            if (b > c) {
                return b;
            } else {
                return c;
            }
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int reward;
        if(a==b){
            if (b == c) { //a==b==c
                reward = 10000 + a*1000;
            }else {//a==b, b!=c
                reward = 1000 + a * 100;
            }
        }else{ //a!=b
            if(b==c){ //a!=b && b==c
                reward = 1000 + b*100;
            }else{//a!=b, b!=c
                if(a==c){ // a==c;
                    reward = 1000+ a*100;
                }else {
                    //Finding Largest Number
                    reward = 100 * maxOfThree(a, b, c);
                }
            }
        }
        System.out.println(reward);
        br.close();
    }
}
