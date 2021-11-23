package Random;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Member {
	public static void randomPrint(int number) {

		Set<Integer> set = new HashSet<>(); //HashSet을 이용하여 랜덤함수의 중복제거

		Random random = new Random();
		StringBuilder sb = new StringBuilder();
		String[] member = { "김태수", "정상준", "송민제", "강승우", "이준선", "김민욱", "송형근", "김경민" };
		while (set.size() < number) {
			set.add(random.nextInt(member.length));
		}
		
		Iterator<Integer> randomNumber = set.iterator();
		while (randomNumber.hasNext()) {
			if (number == 1) {
				sb.append(member[randomNumber.next()]);
				break;
			}
			sb.append(member[randomNumber.next()] + ",");
			number--;
		}
		System.out.println(sb);
	}
}
