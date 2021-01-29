package practice;

public class ROUND {
public static void main(String[] args) {

//	for(int i = 1; i <= 9; i++) {
//		for(int j=1; j <= 9; j++) {
//			System.out.println(i + " * " + j + " = " + i * j);
//			} System.out.println(); 
//			} 
//
//	
//	System.out.println("내가만든 구구단 ");
//	
//	for(int dan =1 ; dan<=9;dan++) {
//		for(int j =1;j<=9;j++) {
//			
//			System.out.println(dan+"단:"+dan+"X"+j+" ="+dan*j);
//		}
//		System.out.println(dan+"단 끗 \n");
//	}
//}

//	int num;
//	for(num=0, System.out.println("num은0부터시작\n========="
//			+ "");num<10;num++) {
//		System.out.println("num="+num);
//		System.out.println("====");
//		for(int j = 0 ; j<10;j++) {
//			
//			System.out.println(num+"의 j는"+j);
//		}
//	}
	int dan =1;
	for(dan =1,  System.out.println("구구단 시작\n"
			+ "");dan<10;dan++) {
		System.out.println("===============");
		System.out.println(dan+"단입니다!");
		System.out.println("==============");
		for(int num2=1;num2<10;num2++) {
			System.out.println(dan+"X"+num2+"="+dan*num2);
		}
	}
	System.out.println("\nfor문 누계 구하기===\n===============");
	
	int sum =0;
	for(int num=1 ;num<=10;num++) {
		sum+=num;
		
	}
	System.out.println("1부터 10의 누계는="+sum);
	
	System.out.println("");
	System.out.println("1~5까지의 곱하기");
	
	
	int d =0;
	do {System.out.println("a"+d); d++; }
	while(d ==0);

	System.out.println("======");
	int  ar1[] ;
	ar1 =new int [5];
	ar1[0] =20;
	ar1[1]=20;
	
	ar1[2] =20;
	ar1[3] =20;
	ar1[4] =20;
	
	int total =ar1[0]+ar1[1]+ar1[2]+ar1[3]+ar1[4];
	int total2;
	int total3;
	int sum2=0;
	System.out.println("total2======");
	for(int i2=0 ;i2<5;i2++) {
		total2= ar1[i2];
		sum2 +=total2;
		
		System.out.println(sum2);
		
	}
	System.out.println("============");
	double avr =(double)total/5;
	System.out.println(total);
	System.out.println(avr);
	
	for(int i=0;i<5;i++) {
		System.out.println(ar1[i]);
	}
	
	int c='a';
	System.out.println(c );
}

}

