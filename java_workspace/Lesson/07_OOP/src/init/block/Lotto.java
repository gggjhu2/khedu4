package init.block;

public class Lotto {
	
	private int[] lotto = new int[6];
	{
		// 객체 생성과동시에 난수 6개를가진 lotto필드 체우기

		for (int i = 0; i < 6; i++) {

			lotto[i] = (int) (Math.random() * 45) + 1;
		}
	}
	
	
}
