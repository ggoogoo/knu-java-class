import java.util.Scanner;
//Random number ����
//1.Math Ŭ���� ���(java.lang.Math)

public class RandomNumber{
	public static void main(String [] args){
		double ss = Math.random();
		int random;
		double radius, l, a;
		
		Scanner s = new Scanner(System.in);
		
		random = (int)ss;
		System.out.println(ss);
		System.out.println(Math.random()*13);//0�̻� 13�̸� �Ǽ��� ����
		System.out.println((int)Math.random()*13); //0�̻� 13�̸��� ������ ���� //0�� ����, �켱������ ���׿����ڰ� ���� ����.
		System.out.println((int)(Math.random()*14));//0�̻� 13������ ������ ������ ����� ���ؼ��� 14�� �����ش�.
		System.out.println((int)(Math.random()*16)+7);//7�̻� 23�̸��� ������ ���� ����
		
		
		//����ڷκ��� ������ �Է¹޾� ���� �ѷ�/���� ����ϱ�
	
		System.out.print("������: ");
		radius = s.nextDouble();
		
		l=  2*Math.PI*radius;
		a= Math.PI*radius*radius;
		
		System.out.printf("���� �ѷ��� %.2f�̰� ���� ���̴� %.2f�Դϴ�.", l, a);

	}
}