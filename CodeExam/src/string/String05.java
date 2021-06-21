package string;

import java.util.Scanner;

public class String05 {
	/* 특정 문자 뒤집기
	 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고, 
	 * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
	 * 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
	 * 첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
	 */
	
	public String solution(String str) {
		String answer;
		char[] arr = str.toCharArray();
		int lt = 0, rt = str.length()-1;
		while(lt<rt) {
			if(!Character.isAlphabetic(arr[lt])) lt++; //lt가 알파벳이 아닐때 1증가
			else if(!Character.isAlphabetic(arr[rt])) rt--; //rt가 알파벳이 아닐때 1감소
			else { //데이터 교환
				char tmp = arr[lt];
				arr[lt] = arr[rt];
				arr[rt] = tmp;
				lt++;
				rt--;
			}
		}
		answer = String.valueOf(arr); //문자배열을 문자열로 변환
		return answer;
	}

	
	public static void main(String[] args) {
		String05 s = new String05();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(s.solution(str));
	}

}
