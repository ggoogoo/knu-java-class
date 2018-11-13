import java.util.Scanner;
//Random number 생성
//1.Math 클래스 사용(java.lang.Math)

public class RandomNumber{
	public static void main(String [] args){
		double ss = Math.random();
		int random;
		double radius, l, a;
		
		Scanner s = new Scanner(System.in);
		
		random = (int)ss;
		System.out.println(ss);
		System.out.println(Math.random()*13);//0이상 13미만 실수형 난수
		System.out.println((int)Math.random()*13); //0이상 13미만의 정수형 난수 //0만 나옴, 우선순위가 단항연산자가 제일 높다.
		System.out.println((int)(Math.random()*14));//0이상 13이하의 정수형 난수를 만들기 위해서는 14를 곱해준다.
		System.out.println((int)(Math.random()*16)+7);//7이상 23미만의 정수형 난수 생성
		
		
		//사용자로부터 반지름 입력받아 원의 둘레/넓이 출력하기
	
		System.out.print("반지름: ");
		radius = s.nextDouble();
		
		l=  2*Math.PI*radius;
		a= Math.PI*radius*radius;
		
		System.out.printf("원의 둘레는 %.2f이고 원의 넓이는 %.2f입니다.", l, a);

	}
}