/*
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

첫째 줄에 A+B를 출력한다.
*/

import java.util.Scanner; // 스캐너를 사용하기 위해

public class Main { // Main 클래스
    public static void main(String[] args){ // main() 메소드
        Scanner one=new Scanner(System.in);
        int A, B;
        
        A=one.nextInt();
        B=one.nextInt();
        
        System.out.println(A+B);
         
        one.close();
    }
}
