package string;

import java.util.Scanner;

public class String10 {
	/* 가장 짧은 문자거리
	 * 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
	 * 첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어진다.
	 * 문자열의 길이는 100을 넘지 않는다.
	 * 첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
	 * 예시 입력 : teachermode e / 예시 출력 : 1 0 1 2 1 0 1 2 2 1 0 */
	
	public int[] solution (String s, char t) {
		int[] answer = new int[s.length()]; //넘겨받은 s의 길이만큼 크기 지정
		//예시 입력의 왼쪽 e로 부터 떨어진 거리
		int p = 1000; //p는 거리를 나타냄. 문자열의 길이보다 큰 수로 잡음
		//예시 입력에서 t의 왼편에 e가 없으므로 1을 증가한 1001로 시작
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==t) {
				p = 0;
				answer[i] = p;
			} else {
				p++;
				answer[i] = p;
			}
		} //여기까지 출력했을 때 값 : 1001 0 1 2 3 0 1 2 3 4 0 
		
		//예시 입력의 오른쪽 e로 부터 떨어진 거리
		p = 1000;
		for(int i = s.length()-1; i>=0; i--) { //s의 마지막 인덱스부터 시작
			if(s.charAt(i)==t) p=0;
			else {
				p++;
				answer[i] = Math.min(answer[i], p); //기존 값과 p를 비교했을 때 작은 값으로
			}
		}
		return answer;
	}
	
	public static void main (String[] args) {
		String10 s = new String10();
		Scanner sc = new Scanner(System.in);
		String str = sc.next(); //문자열 읽음
		char c = sc.next().charAt(0); //문자 읽음
		for(int x : s.solution(str, c)) //문자열과 문자를 넘겨 리턴받은 배열 출력
			System.out.print(x+" ");
	}
}
