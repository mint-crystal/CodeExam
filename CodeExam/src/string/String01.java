package string;

import java.util.Scanner;

public class String01 {
	/*	문자 찾기
  	한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
	대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.		*/

	//강의 풀의
	public int solution(String str, char t) {
		int answer = 0;
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
//		for(int i=0; i<str.length(); i++)
//			if(str.charAt(i)==t) answer++;
		
		//향상된 for문 사용
		for(char x : str.toCharArray()) //toCharArray : 문자를 분리해 문자 배열을 생성
			if(x==t) answer++;
		return answer;
	}

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		//강의풀이 이어서
		String01 T = new String01();
		String str = sc.next();
		char c = sc.next().charAt(0);
		System.out.println(T.solution(str, c));
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		
		//내가 푼 문제 풀이
		System.out.print("문자열 입력 : ");
		String word = sc.next();
		if(word.length()>100)
			System.out.println("100글자 이하의 문자열만 입력 가능");
		else {
			System.out.print("특정문자 입력 : ");
			char alphabet = sc.next().charAt(0);
			//입력받은 문자들을 대문자로 변환
			word = word.toUpperCase();
			alphabet = Character.toUpperCase(alphabet);
			int sum = 0;
			for(int i=0; i<word.length(); i++) {
				if(word.charAt(i)==alphabet)
					sum++; //입력받은 특정문자가 존재할때 ++
			}
			System.out.println(sum);
		}
		
	}

}
