package baekjoon.step3;
import java.util.Scanner;
public class Main2739 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int result;
        for(int i=1 ; i<10; i++){
            result = input * i;
            System.out.println(input+" * "+ i + " = "+result);
        }
        sc.close();
    }
}
