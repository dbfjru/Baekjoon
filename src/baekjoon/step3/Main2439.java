package baekjoon.step3;
import java.util.Scanner;
public class Main2439 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            for(int j=0; j<num-1-i;j++){//공백 출력
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){ // 별 출력
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
