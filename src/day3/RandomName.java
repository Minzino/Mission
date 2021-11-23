package day3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class RandomName {
	/*
	 * to do list - 랜덤함수를 이용함. - 만약에 사람 이름이 중복이 된다면 다시 랜덤함수를 통해 다른 사람을 뽑음 - 마지막 사람
	 * 이름 뒤에는 , 표시를 하지 않음 지정한 숫자만큼 코코아 멤버들의 이름을 랜덤 출력한다. 몇 명의 멤버를 출력할까요? 5 BC, Who,
	 * 피오, 노리, Jun
	 * 
	 */
	public static void main(String args[]) {
		Member member = new Member();
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 명의 멤버를 출력할까요?");
		int number = sc.nextInt();
		sc.close();

		member.randomPrint(number);

	}
}
