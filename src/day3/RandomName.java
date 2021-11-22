package day3;

import java.util.Random;
import java.util.Scanner;

public class RandomName {
	/*
	 * to do list - 랜덤함수를 이용함. 
	 * - 만약에 사람 이름이 중복이 된다면 다시 랜덤함수를 통해 다른 사람을 뽑음 
	 * - 마지막 사람 이름 뒤에는 , 표시를 하지 않음 
	 * 지정한 숫자만큼 코코아 멤버들의 이름을 랜덤 출력한다. 
	 * 몇 명의 멤버를 출력할까요? 5 
	 * BC, Who, 피오, 노리, Jun
	 * 
	 */
	public static void memberPrint(int number) {

		Random random = new Random();
		StringBuilder sb = new StringBuilder();
		String[] member = { "김태수", "정상준", "송민제", "강승우", "이준선", "김민욱", "송형근", "김경민" };
		do {
			sb.append(member[random.nextInt(member.length)] + ",");
			number--;
		} while (number > 1);
		{
			sb.append(member[random.nextInt(member.length)]);
		}
		System.out.println(sb);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 명의 멤버를 출력할까요?");
		int number = sc.nextInt();

		memberPrint(number);

	}
}
