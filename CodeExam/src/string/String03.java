package string;

import java.util.Scanner;

public class String03 {
	/* 문장 속 단어
	 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요. 문장속의 각 단어는 공백으로 구분됩니다.
	 * 첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.
	 * 첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한 단어를 답으로 합니다. */
	public String solution(String str) {
		String answer = ""; //가장 길이가 긴 단어 저장

		int m = Integer.MIN_VALUE; //가장 작은 값으로 초기화?
		String[] arr = str.split(" ");
		for(String x : arr) {
			int len = x.length(); //각각의 단어의 길이를 len에 대입
			if(len>m) { // >=로 하면 뒤쪽에 위치한 단어가 답이 되기때문에 >로 해줘야한다.
				m = len; //최대값으로 갱신
				answer = x; //긴 단어로 교체
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		String03 s = new String03();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(); //공백을 포함한 문자열을 입력받기 위해 nextLine
		System.out.println(s.solution(str));
	}

}
