package string;

import java.util.Scanner;

public class String08 {
	/* 유효한 팰린드롬
	 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
	 * 문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 "NO"를 출력하는 프로그램을 작성하세요.
	 * 단, 회문을 검사할 때 알파벳만 가지고 회문을 검사하며 대소문자를 구분하지 않습니다.
	 * 알파벳 이외이 문자들은 무시합니다. */
	
	public String solution(String str) {
		String answer = "NO";
		//replaceAll은 정규식 사용 가능
		str = str.toUpperCase().replaceAll("[^A-Z]",""); //A-Z가 아니면 ""로 
		//System.out.println(str);
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equals(tmp)) answer = "YES";
		return answer;
	}
	
	public static void main(String[] args) {
		String08 s = new String08();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(); //문자열에 띄어쓰기가 포함될 수 있으므로 nextLine()
		System.out.println(s.solution(str));
	}
}