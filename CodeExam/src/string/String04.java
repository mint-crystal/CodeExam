package string;

import java.util.ArrayList;
import java.util.Scanner;

public class String04 {
	/* 단어 뒤집기
	 * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
	 * 첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
	 * 두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
	 * N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.*/
	
	public ArrayList<String> solution(int n, String[] str){
		ArrayList<String> answer = new ArrayList<>();
		
//		//StringBuilder를 사용해 뒤집는 방법
//		for(String x : str) {
//			//x를 StringBuilder객체로 만들고 reverse시킨 후 String으로 변환
//			String tmp = new StringBuilder(x).reverse().toString(); 
//			/* String은 불면이므로 변경 시 마다 객체가 새롭게 만들어지지만  StringBuilder는  처음 만들어진 객체를 계속 사용하여 메모리의 낭비를 줄인다.
//			 * String 연산이 많아지면 StringBuilder를 사용하기도 한다. */
//			answer.add(tmp);
//		}
		
		//양 끝을 짝으로 묶어 뒤집어 구현하는 방법
		for(String x : str) {
			char[] s = x.toCharArray();
			int lt = 0, rt = x.length()-1; //lt는 0번째 인덱스, rt는 마지막  인덱스를 가리킴
			while(lt<rt) { //lt가 rt보다 커지면 문자는 다 뒤집힘
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
			//문자 배열 s를 String화 시켜줌. valueOf는 static으로 선언된 클래스 메소드
			String tmp = String.valueOf(s); 
			answer.add(tmp);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		String04 s = new String04();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] str = new String[n];
		for(int i = 0; i<n; i++) 
			str[i]=sc.next();
		for(String x : s.solution(n, str)) 
			System.out.println(x);
	}
	
}
