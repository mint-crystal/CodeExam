package string;

import java.util.Scanner;

public class String09 {
	/* 숫자만 추출
	 * 문자와 숫자만 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
	 * 만약 “tge0a1h205er"에서 숫자만 추출하면 0,1,2,0,5이고 이것을 자연수로 만들면 1205가 됩니다.
	 * 추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.*/
	
	//아스키 넘버를 사용하는 방법
	public int solution(String str) {
		int answer = 0;
		for(char x : str.toCharArray()) {
			if(x>=48 && x<=57) //아스키코드에서 0~9는 48~57
				//x가 0이면 48로 연산되므로 실제 값은 0
				answer = answer*10+(x-48);
		}
		return answer;
	}
	
	//String을 사용하는 방법
	public int solution2(String str) {
		String answer = "";
		for(char x : str.toCharArray()) {
			if(Character.isDigit(x)) //isDigit : x가 숫자인지 참/거짓으로 판별
				answer += x;
		}
		return Integer.parseInt(answer); //맨 앞자리 0일때 자연수로 변환
	}
	
	public static void main (String[] args) {
		String09 s = new String09();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(s.solution(str));
		System.out.println(s.solution2(str));
	}
}
