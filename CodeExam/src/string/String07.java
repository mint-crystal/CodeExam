package string;

import java.util.Scanner;

public class String07 {
	/* 회문 문자열
	 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
	 * 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 "NO"를 출력하는 프로글매을 작성하세요. 
	 * 단, 회문을 검사할 때 대소문자를 구분하지 않습니다. */
	
	public String solution1(String str) {
		String answer = "YES";
		str = str.toUpperCase(); //대소문자 구분하지 않기 위해 모두 대문자로 변환
		int len = str.length();
		for(int i = 0; i<len/2; i++) { //문자열의 길이를 둘씩 나누어 양 끝을 검사하며 이동
			/* GOOG일 때 0,1번째 인덱스를 2,3번 인덱스와 비교하는 것 */
			if(str.charAt(i)!=str.charAt(len-i-1)) {
				/* 앞으로, 뒤로 이동하면 값을 구함. 
				 * 문자열의 길이가 4이면 i가 0일때 len-i-1은 3 */
				return "NO";
			}
		}
		return answer;
	}
 
	//StringBuilder 사용하는 방법  
	public String solution2(String str) {
		String answer = "YES";
		String tmp = new StringBuilder(str).reverse().toString(); //문자열 뒤집어서 String 변환
		if(!str.equalsIgnoreCase(tmp)) { //equalsIgnoreCase : 대소문자 상관없이 문자열 비교
			answer = "NO";
		}
		return answer;
	}
	
	public static void main(String[] args) {
		String07 s = new String07();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(s.solution1(str));
		System.out.println(s.solution2(str));
	}

}
