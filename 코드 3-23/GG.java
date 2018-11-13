import java.util.Scanner;

public class GG{
	public static void main(String [] args){
		double a, b ;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("화씨 : ");
		a = s.nextDouble();
		
		b = 5/9.0*(a-32); //5나 9 중 하나 .0붙여서 실수형으로 바꾸거나
		//실수형으로 casting
		
		System.out.println("섭씨 "+b+"입니다.");
		
	}
}