package string;

import java.util.Scanner;

public class String06 {
	/* 중복 문자 제거
	 * 소문자로 된 한 개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
	 * 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
	 * 첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.
	 * 첫 줄에 중복문자가 제거된 문자열을 출력합니다.*/
	
	public String solution(String str) {
		String answer = "";
		for(int i = 0; i<str.length(); i++) {
			//System.out.println(str.charAt(i)+" "+ i +" "+str.indexOf(str.charAt(i)));
			/*	ksekkset 입력 시 결과 값 : 
			 	k 0 0
				s 1 1
				e 2 2
				k 3 0
				k 4 0
				s 5 1
				e 6 2
				t 7 7
			 */
			if(str.indexOf(str.charAt(i))==i) //i번째 문자열이 i번(int)과 같을 경우만 누적
				//indexOf()는 특정 문자나 문자열이 앞에서부터 처음 발견되는 인덱스를 반환하며 만약 찾지 못했을 경우 "-1"을 반환
				answer += str.charAt(i);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		String06 s = new String06();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(s.solution(str));
	}

}
