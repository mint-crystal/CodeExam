package string;

import java.util.Scanner;

public class String02 {
	/* 대소문자 변환
	 * 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로, 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요. */
	public String solution(String str) {
		String result = "";
		
//		for(char c : str.toCharArray()) { //문자열을 분리하여 배열로 변환
//			if(Character.isLowerCase(c)) //소문자가 있는지 검사. 배열에 소문자가 있으면 true를 반환한다
//				result+=Character.toUpperCase(c); //검사 후 소문자를 대문자로 변경하여 result에 누적
//			else
//				result+=Character.toLowerCase(c); //소문자를 대문자로 
//		}
		
		//아스키코드표를 활용한 풀이 : 대문자(65~90), 소문자(97~122)
		for(char c : str.toCharArray()) {
			if(c>=97 && c<=122) //문자가 소문자일 때
				result += (char)(c-32); //97-65=32 -> 대문자와 소문자 아스키넘버의 차이. 따라서 소문자에서 -32를 하면 대문자가됨
			else
				result += (char)(c+32); //대문자에 +32를 하면 소문자로 변환
			//문자형태로 출력하기 위해 (char) 형변환. 안 하면 숫자가 출력됨.
		}
		return result;
	}
	
	public static void main(String[] args) {
		String02 s = new String02();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(s.solution(str));
	}

}
