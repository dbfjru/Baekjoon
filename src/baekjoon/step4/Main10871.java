package baekjoon.step4;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Main10871 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input_1 = br.readLine().split(" "); // N, X 입력받기
        int num = Integer.parseInt(input_1[0]); // N -> num
        int target = Integer.parseInt(input_1[1]); // X -> target

        String[] input_2 = br.readLine().split(" "); // 수열 A 입력받기
        int[] arrays = new int[num]; //수열을 위한 정수 배열 생성
        for(int i=0; i<num;i++) //수열 a의 문자열을 정수로 변환
            arrays[i] = Integer.parseInt(input_2[i]);

        int[] result = new int[num]; //비교 결과 저장 배열
        int j=0; // 결과 저장소의 인덱스를 위한 j 선언, 또한 결과 저장소에 유효한 값이 어디까지 들어있는지 사이즈를 알려주기도함
        for(int i=0; i<num;i++){
            if(arrays[i] < target) {
                result[j] = arrays[i]; // 비교결과 result 에 저장
                j++; // result의 인덱스 증가
            }
        }
        for(int i =0; i<j;i++)
            System.out.print(result[i]+" ");
        br.close();
    }
}
