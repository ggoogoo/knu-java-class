import java.util.Scanner;

public class GG{
	public static void main(String [] args){
		double a, b ;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("ȭ�� : ");
		a = s.nextDouble();
		
		b = 5/9.0*(a-32); //5�� 9 �� �ϳ� .0�ٿ��� �Ǽ������� �ٲٰų�
		//�Ǽ������� casting
		
		System.out.println("���� "+b+"�Դϴ�.");
		
	}
}