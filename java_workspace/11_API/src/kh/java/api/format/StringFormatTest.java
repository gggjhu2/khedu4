package kh.java.api.format;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//
// 날짜 :java.text.SimpleDateFormat
// 숫자 :java.text.DecimalFormat
//
//
//
public class StringFormatTest {
	public static void main(String[] args) {
		StringFormatTest s =new StringFormatTest();
//		s.test1();
		s.test2();
	}
	
	
	//SimpleDateFormat
	public void test1() {
		
		Date d =new Date();
															//시간소문자는 12시간
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
															//시간 대문자는 24시기준
		SimpleDateFormat sdf2 =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String result =sdf.format(d);
		String result2 =sdf2.format(d);
						//12시간기준
		System.out.println(result);
						//24시간기준
		System.out.println(result2);			
														//E는 요일을 출력해준다
		SimpleDateFormat sdf3 =new SimpleDateFormat("yyyy-MM-dd(E요일) HH:mm:ss");
		String result3 =sdf3.format(d);
		System.out.println(result3);
		
		
	}
	
	//
	//DecimalFormat
	//
	//	# 해당자리에 데이터가없는경우 , 생략
	//	0 해당자리에 데이터가 없는경우, 0으로 표시
	public void test2() {
		
		double num =123456789.123456;
										//세자리마다 점을찍고싶다.
										//정수만출력하기떄문에 소수점은날라간다.
		DecimalFormat df =new DecimalFormat("#,###");
		System.out.println(df.format(num));
			//소수점까지 모두 출력
				
		df.applyPattern("#.###"); 
		System.out.println(df.format(num));
		
						//추가된00000의자리수만큼 출력되고 값이없으면0을출력해준다
		df.applyPattern("#.0000000000"); 
		System.out.println(df.format(num));
		
						//#은 #숫자만큼 출력을해주고 빈자리는 출력생략해준다.
		df.applyPattern("#.##############"); 
		System.out.println(df.format(num));
		
										//금액을표현할떄 이렇게해주면 편하다
		DecimalFormat df2 =new DecimalFormat("￦"+"#,###원");
		System.out.println(df2.format(num));

		
	}
}
