import java.util.*;
import javax.swing.*;
import java.io.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

class TermProject{
	public static void main(String[] args){
		Envi.sentence1();
	}
}
class Envi{
	static Scanner sc = new Scanner(System.in);
	static String input;
	static String yn;
	static int i =0;
	static int cnt =0;
	static void sentence1(){
		System.out.printf("\n ��ϴ��б��� �ٴϴ� ����� �б����� �� �Ÿ��� �ִ� ���� �����ϰ� �ִ�.\n\n �����б�� �ڹ� ���α׷��� ������ ��û�� ����� ������ ���� �������� 5���� ������ �����ִ�.\n\n �ڹ� ������ �������� ������ �ſ� �����ϼż� ���� �ѹ��� �� �� ���� ������ ũ�� ������ �����Ŷ�� �����ϼ̴�.\n\n �������� �� ���� ������ �ѹ��� �������� ������ ���� �������� ������ ������������ �ǹ��̴�.\n\n(�Ϸ� �� ���ΰ��� �ൿ�� ������ �������� ���� �ൿ�� �̷���� �� ���� ������ �����Ͽ� �ð����� ȯ���ϰ�\n\n ���ð��� �˶����� ���ο� ���� �����Ǹ� ���ð��� ���� ���丮�� �޶����ϴ�. \n\n Ư�� �������� ���� �� �������� üũ�մϴ�.)\n\n\n");
		System.out.print("[������ ���� ���α׷��� ���� ������(Y/y)�� ���α׷��� �����Ϸ���(N/n)�� �Է����ּ���.]\n>>");
		while(true){
		yn = sc.next();
		if(yn.equals("y")|| yn.equals("Y")){
			while(i<5){
			KaKao.sentence2();
			i++;
			Late.minute = 120;
			cnt =0;
			}
			try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" [�� �� ��.... ���� ��ǥ��]\n\n");
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		if(Late.numOfLate==0 || Late.numOfLate ==1){
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
			System.out.printf(" [�߰����� �⸻��縦 ��� 100���� ���� ������ �� ���� Ƚ���� %d������ ���� ������ A+�Դϴ�.]\n\n",Late.numOfLate); 
		
			ima.imgg("a");
			break;
		}
		if(Late.numOfLate==0 || Late.numOfLate ==1){
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
			System.out.printf(" [�߰����� �⸻��縦 ��� 100���� ���� ������ �� ���� Ƚ���� %d������ ���� ������ a+�Դϴ�.]\n\n",Late.numOfLate); 
	
			ima.imgg("a");
			break;
		}
		
		if(Late.numOfLate==2 || Late.numOfLate ==3){
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
			System.out.printf(" [�߰����� �⸻��縦 ��� 100���� ���� ������ �� ���� Ƚ���� %d������ ���� ������ b+�Դϴ�.]\n\n",Late.numOfLate); 
		
			ima.imgg("b");
			break;
		}
		if(Late.numOfLate==4){
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
			System.out.printf(" [�߰����� �⸻��縦 ��� 100���� ���� ������ �� ���� Ƚ���� %d������ ���� ������ c+�Դϴ�.]\n\n",Late.numOfLate); 
		
			ima.imgg("c");
			break;
		}
		if(Late.numOfLate>=5){
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
			System.out.printf(" [�߰����� �⸻��縦 ��� 100���� ���� ������ �� ���� Ƚ���� %d������ ���� ������ f�Դϴ�.]\n\n",Late.numOfLate); 
		
			ima.imgg("f");
			break;
		}
		else if(yn.equals("N")|| yn.equals("n")){
			System.out.println("[���α׷��� �����մϴ�.]");
			return;
		}
		else
			System.out.printf(" [�߸��� �Է��Դϴ�. Y/y �Ǵ� N/n�� �Է����ּ���.]\n>>");
		}
	}
	}
	static void play1(){
		File f = new File("��.wav");
		if(!f.exists()){
			System.out.printf(" �ش� ���� ������ �������� �ʽ��ϴ�. �ٽ� �ٿ�ε� �� �ּ���.");
		}
		try{
			AudioInputStream stream = AudioSystem.getAudioInputStream(f);
			Clip c = AudioSystem.getClip();
			c.open(stream);
			c.start();
		
		verse1();
				sc.nextLine();
		System.out.printf(" kakao : �뷡�� �����Ͻ÷��� \"����\"�� �Է����ּ��� ������� ������ ��� ����˴ϴ�.\n>>");
		while(true){
		input = sc.nextLine();
		if(input.equals("����")){
			c.close();
			stream.close();
			break;
		}
		else System.out.printf(" [�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���.]\n>>");
			}
			}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	static void play2(){
		File f = new File("��.wav");
		if(!f.exists()){
			System.out.printf(" �ش� ���� ������ �������� �ʽ��ϴ�. �ٽ� �ٿ�ε� �� �ּ���.");
		}
		try{
			AudioInputStream stream = AudioSystem.getAudioInputStream(f);
			Clip c = AudioSystem.getClip();
			c.open(stream);
			c.start();
		
		verse2();
				sc.nextLine();
		System.out.printf(" kakao : �뷡�� �����Ͻ÷��� \"����\"�� �Է����ּ��� ������� ������ ��� ����˴ϴ�.\n>>");
		
		while(true){
		input = sc.nextLine();
		if(input.equals("����")){
			c.close();
			stream.close();
			break;
		}
		else System.out.printf(" [�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���.]\n>>");
			}
			}catch(Exception e){
			e.printStackTrace();
		}
	}
	static void play3(){
		File f = new File("���ϸ�.wav");
		if(!f.exists()){
			System.out.printf(" �ش� ���� ������ �������� �ʽ��ϴ�. �ٽ� �ٿ�ε� �� �ּ���.");
		}
		try{
			AudioInputStream stream = AudioSystem.getAudioInputStream(f);
			Clip c = AudioSystem.getClip();
			c.open(stream);
			c.start();
		
		verse3();
				sc.nextLine();
		System.out.printf(" kakao : �뷡�� �����Ͻ÷��� \"����\"�� �Է����ּ��� ���Ḧ �Է����� ������ ��� ����˴ϴ�.\n>>");
		while(true){
		input = sc.nextLine();
		if(input.equals("����")){
			c.close();
			stream.close();
			break;
		}
		else System.out.printf(" [�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���.]\n>>");
			}
			}catch(Exception e){
			e.printStackTrace();
		}
	}
		static void play4(){
		File f = new File("��.wav");
		if(!f.exists()){
			System.out.printf(" �ش� ���� ������ �������� �ʽ��ϴ�. �ٽ� �ٿ�ε� �� �ּ���.");
		}
		try{
			AudioInputStream stream = AudioSystem.getAudioInputStream(f);
			Clip c = AudioSystem.getClip();
			c.open(stream);
			c.start();
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" [������ Ÿ�� ��ϴ� ��..(30�ʰ� ���ǰ����� �սô�)]\n\n");
		try{
		Thread.sleep(30000);
		c.close();
		stream.close();
		System.out.printf(" [���ǽ� �� ���� ����..]\n\n");
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		Late.minute -= 120;
			}catch(Exception e){
			e.printStackTrace();
		}
	}
	static void verse1(){
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" kakao : ���縦 ���� �����ø� (Y/y) ������� ������ (N/n)�� �Է����ּ���\n>>");
		while(true){
		yn = sc.next();
		if(yn.equals("y")|| yn.equals("Y")){
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
			System.out.println("\n Ŀ�Ǹ� �ʹ� ���� ���̳� ����\n ������ �� �αٴ�� ���� �� ���� �����\n ���� �ڿ� ������ ������\n �� �ٽ� ��� �� ������\n ������ ������ �� ����\n �ٽ� �� �翡 ������\n ���� ǰ�� ��� �� ��ġ\n õ�簡 �� �͸� ���ƿ�\n �� �״� ǰ�� ������ ��� ������\n ���ϼ��� ����� ���� ���ư��� �Ұž�\n Cause I��m a pilot anywhere\n Cause I��m a pilot anywhere\n lighting star shooting star �ٰ� �� Galaxy...\n\n");
			break;
		}
		else if(yn.equals("N")|| yn.equals("n")){
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
			System.out.println(" kakao : ���縦 ����� �ʽ��ϴ�.\n\n");
			break;
		}
		else
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
			System.out.printf(" [�߸��� �Է��Դϴ�. Y/y �Ǵ� N/n�� �Է����ּ���.]\n>>");
		}
	}
	static void verse2(){
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" kakao : ���縦 ���� �����ø� (Y/y) ������� ������ (N/n)�� �Է����ּ���\n>>");
		while(true){
		yn = sc.next();
		if(yn.equals("y")|| yn.equals("Y")){
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
			System.out.printf("\n ���� �Ϸ� �� ����\n ���� �Ϸ� �� ����\n ���ø�ŭ �̷��� �� �ѹ� ��ư�\n ħ�� �ؿ� ���Ƶ�\n ���� �㿡 �� ����\n ��ģ ���� ������\n ���� ���´� ������\n ������� ������ �ٸ� ��� �ӿ�\n �� Ȧ�� ����\n �ٽ� ���� ��ħ��\n ���� �߸� ��������\n ���� ���� ��\n �̴�� �ӹ����� �� ���̶��\n �ٶ� �� ���°� �ٶ� �ȴٸ�\n �η��� �ʴٸ� ��ó��\n ���� ���� ��\n ���� �� �˾Ҵ�\n ������ ������ �帣��\n ����� �ʴ� �� ���� ������\n ���� ����\n ���� ���� �� �ϴ�\n ���ư��� ��ó��\n �ڵ��� ���� ������...\n\n");
			break;
		}
		else if(yn.equals("N")|| yn.equals("n")){
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
			System.out.println(" kakao : ���縦 ����� �ʽ��ϴ�.\n\n");
			break;
		}
		else
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
			System.out.printf(" [�߸��� �Է��Դϴ�. Y/y �Ǵ� N/n�� �Է����ּ���.]\n>>");
		}
	}
	static void verse3(){
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" kakao : ���縦 ���� �����ø� (Y/y) ������� ������ (N/n)�� �Է����ּ���\n>>");
		while(true){
		yn = sc.next();
		if(yn.equals("y")|| yn.equals("Y")){
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
			System.out.println("\n �� �ϴ� ��� ���� ���µ�\n �� ������ �� ��\n �Ϸ簡 Ʋ������ ��\n ���㵵�� �̿� ��\n but I miss you\n and I need you\n �����ٵ� ��\n ���� ��⿡��\n ���� �θ����� timing\n �� ������ ���� �׸���\n �ʹ� ���� coffee��\n ���� �ǰ� ��\n ���� ���� �ʾ�\n ��ô�� �ð� �ڿ�\n �� ���� �ؿ� �� ��\n so I miss you...\n\n");
			break;
		}
		else if(yn.equals("N")|| yn.equals("n")){
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
			System.out.println(" kakao : ���縦 ����� �ʽ��ϴ�.\n\n");
			break;
		}
		else
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
			System.out.printf(" [�߸��� �Է��Դϴ�. Y/y �Ǵ� N/n�� �Է����ּ���.]\n>>");
		}
	}
	static void mother(){
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" ���� : ����� ������ ���� �Ͼ��? �İ� ��Ծ����.\n\n");
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" ���� : �� �İ� �ðԿ�.\n\n");
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" [�Ҿƾ� ĢĢ ġīġī ������]\n\n");
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		Late.late20();
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" ���� : �� �����ϴ�. ���� ���� ���� ���ϱ�?\n\n");
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" ���� : ��Ź�� �������� �԰� ����.\n\n");
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" ���� : �� �԰ڽ��ϴ�. \n\n");
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" [��ƿ�� �r�r �ȳ�����]\n\n");
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		Late.late10();
		Player.sentence_bus();
		
	}
}
class KaKao extends Envi{
	static void sentence2(){
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf("\n [%d��° ��..]\n\n",i+1);
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		
		System.out.printf("\n kakao : (�˶�) ����ð� ��ħ 7�� �Դϴ�. ��� ��� \n\n");
		while(true){
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.print(" kakao : �˶��� ���� �Ͻðڽ��ϱ�?(Y/y or N/n)\n>>");
		yn = sc.next();
		if(yn.equals("y")|| yn.equals("Y")){
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
			System.out.printf("\n\n kakao : �˶��� �����մϴ�.\n\n");
			if(cnt == 0) Player.sentence3();
			else if (cnt == 1) Player.sentence3_1();
			else if(cnt == 2) Player.sentence3_2();//�ý�
			else if(cnt>=3&&cnt<5)Late.late();
			else {
				System.out.printf(" ������ ��ü �����Դϴ�..\n\n");
				Late.numOfLate++;
				try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
						System.out.printf(" %d° ��  ���� ���� Ƚ�� : %dȸ\n\n", 1+i, Late.numOfLate);
		
			}
			break;
		}
		else if(yn.equals("N")|| yn.equals("n")){
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
			System.out.printf(" kakao : 30�е� �˶��� �ٽ� �︳�ϴ�.\n\n");
			Late.late30();
			cnt ++;
		}
		else{
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
			System.out.printf(" [�߸��� �Է��Դϴ�. Y/y �Ǵ� N/n�� �Է����ּ���.]\n>>");
		}
	}
	}
	static void sentence4_1(){
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" kakao : �÷��� ����Ʈ : ��ȿ��_��, ���ϸ�_���� �׸���, �����������_���ָ��ٰ�\n\n");
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" kakao : �÷����ϰ� ���� �뷡�� ���� �� �ּ���.(������ �̸��� �Է����ּ���)\n>>");
		Player.sentence5();
	}
}
class Player extends Envi{
	static void sentence3(){
		if(Late.minute == 120){
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
			System.out.printf(" ���� : �� �����ϴ� ������ �� ���� �ְ� �Ͼ��.\n\n 	 īī�� �뷡 �� �� ��� ����Ʈ�� ������\n\n");
			KaKao.sentence4_1();
		}
		else if(Late.minute < 120 && Late.minute >= 90)
			System.out.printf(" ���� : �� ���� �ʾ���. ���� �غ� �ؾ߰ھ�\n\n");
		else
			System.out.printf(" ���� : ū�� ����... ���� �� �� �� ������� �� �ʾ����ϱ� �ýú� �� �ֽ� �� ��������?\n\n");
	}
	static void sentence3_1(){//1�ð� 30�� ���� �Ͼ ���
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" ���� : ��.. �����ϰڳ�. ���� �غ� �ؾ߰ھ�\n\n");
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" ���� : �ʾ ������ �ϰ� ��������.\n\n");
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" [�����ϴ� �Ҹ�.. ]\n\n");
		Late.latein(20);
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" ���� : ����� ���� ��¼����? �����̶� �԰� ��������.\n\n");
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" ���� : �� ���� ì�ܼ� �����Կ� !\n\n");
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" [������� ������ġ�� ì�ܼ� ������ ������.]\n\n");
		Late.late5();
		sentence_bus();
		
	}
	static void sentence3_2(){
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" ���� : ��.. ���� �� �ǳ� ������ �߱�... ���� �İ� �����߰ڴ�.\n\n");
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" [���� �İ� ���ڸ� �������� � �غ� �Ѵ�.]\n\n");
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" ���� : ���� �� �ʾ��µ� �ýú� �� �ּ���!\n\n");
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" ���� : �׷��ϱ� ���� ���� �Ͼ���� ���� �׷��� �ʰ� ��������.\n\n");
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" [���쿡�� �ýú� �����Ͻ÷��� \"����\"�� �����Ͻ÷��� \"����\"�� �Է����ּ���]\n>>");
		sc.nextLine();
		while(true){
		yn = sc.nextLine();
		if(yn.equals("����")){
			try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" ���� : �� �ýú� �����ʰ� ���� ��� ��\n\n");
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" ���� : �б� �ٳ���ڽ��ϴ�!\n\n");
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" ���� : īī�� �ý� �ҷ���.\n\n");
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" kakao : ���� 300m ��ó�� �ý� �� 2�е� �����մϴ�.\n\n");
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" [�ýÿ� ����.. �б��� �ٷ� ���Ѵ�.]\n\n");
		Late.late30();
		if(Late.minute>0){
						
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
					System.out.printf(" ���� �ð� %d�� %d������ ���� ������ ������ ���� �ʾҽ��ϴ�!\n\n", 7+(120-Late.minute)/60, (120-Late.minute)%60);
					
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
					System.out.printf(" %d° ��  ���� ���� Ƚ�� : %dȸ\n\n", 1+i, Late.numOfLate);
					break;
					}
					else {
						
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
						System.out.printf(" ���� �ð� %d�� %d������ ���� ������ ������ �߽��ϴ�..\n\n", 7+(120-Late.minute)/60, (120-Late.minute)%60);
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
						Late.numOfLate ++;
						System.out.printf(" %d° ��  ���� ���� Ƚ�� : %dȸ\n\n", 1+i, Late.numOfLate);
						break;
					}
		}
		else if(yn.equals("����")){
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}	
			System.out.printf(" ���� : �̾� ���� �� ���� �׷��� ���� �Ͼ�� �׷���..\n\n");
			try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
			System.out.printf(" ���� : ��.. �б� �ٳ���ڽ��ϴ�..\n\n");
			try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" [�ɾ ���� ��������� ���±�..]\n\n");
		Late.latein(3);
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" [���� ������.. (������ ���������� 10���Դϴ�).]\n\n");
		if(Late.minute % 10 == 0){
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
			System.out.printf(" [����ð� %d�� %d������ �ٷ� ������ �����մϴ�.]", 7+(120-Late.minute)/60, (120-Late.minute)%60);
			Late.latein(50);
			Late.sentence_walk();
		}
		else{
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
			System.out.printf(" [����ð� %d�� %d������ %d�� �Ŀ� ������ �����մϴ�.]", 7+(120-Late.minute)/60, (120-Late.minute)%60, 10-((120-Late.minute)%10));
			Late.latein((Late.minute%10)+50);
			Late.sentence_walk();
		}
		break;
		}
		else System.out.printf(" �߸��� �Է��Դϴ�. �ٽ� �Է� �� �ּ���\n>>");
		}
	}
	static void sentence5(){
		sc.nextLine();
		String music;
		while(true){
		music = sc.nextLine();
		if(music.equals("�����������")){
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
			System.out.printf("\n\n ���� : ����������� �뷡 Ʋ����\n\n");
			System.out.printf(" kakao : �뷡�� ����մϴ�.\n\n");
			play1();
			Late.late5();
			mother();
			break;
		}
		else if(music.equals("��ȿ��")){
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
			System.out.printf("\n\n ��ȿ�� �뷡 Ʋ����\n\n");
			System.out.printf(" kakao : �뷡�� ����մϴ�.\n\n");
			play2();
			Late.late5();
			mother();
			break;
		}
		else if(music.equals("���ϸ�")){
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
			System.out.printf("\n\n ���� : ���ϸ� �뷡 Ʋ����\n\n");
			System.out.printf(" kakao : �뷡�� ����մϴ�.\n\n");
			play3();
			Late.late5();
			mother();
			break;
		}
		else
		{
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
			System.out.printf("\n\n kakao : ����Ʈ�� ���� �뷡 �Դϴ�. �ٽ� �뷡�� ���� ���ּ���.\n\n");
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
			System.out.printf("  	 �÷����ϰ� ���� �뷡�� ���� �� �ּ���.(������ �̸��� �Է����ּ���)\n>>");
		
		}
		}
	}
	static void sentence_bus(){
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" ���� : �б� �ٳ���ڽ��ϴ�!\n\n");
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" [�ɾ ���� ��������� ���±�..]\n\n");
		Late.latein(3);
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" [���� ������.. (������ ���������� 10���Դϴ�).]\n\n");
		if(Late.minute % 10 == 0){
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
			System.out.printf(" [����ð� %d�� %d������ �ٷ� ������ �����մϴ�.]", 7+(120-Late.minute)/60, (120-Late.minute)%60);
			Late.latein(50);
			Late.sentence_walk();
		}
		else{
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
			System.out.printf(" [����ð� %d�� %d������ %d�� �Ŀ� ������ �����մϴ�.]", 7+(120-Late.minute)/60, (120-Late.minute)%60, 10-((120-Late.minute)%10));
			Late.latein((Late.minute%10)+50);
			Late.sentence_walk();
		}
		
		
	}
}
class Late extends Envi{
	static int minute = 120;
	static int numOfLate = 0;
	static void late(){
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" ���� : ū�� ����.. ������ �����̴�...\n\n");
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" ���� : ������ ������ �����ְ� ����.\n\n");
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" ���� : īī�� �ų��� �뷡 �� Ʋ�� ��.\n\n");
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" kakao : ������ ������� ���ָ� �ٰԸ� ����մϴ�.\n\n ");
		minute -= 5;
		Envi.play1();
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" [�Ĵ¼Ҹ�.. �Ҿƾ� ���� ���� ġīġī..]\n\n");
		minute -= 20;
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" [�� �Դ¼Ҹ�.. �ȳ����� ��ô.. ��ƿ��]\n\n");
		minute -= 20;
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" ���� : īī�� ���� ��þ�?\n\n");
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" kakao : ����ð� %d�� %d������ ���� ������ �����̽ʴϴ�.\n\n",  7+(120-Late.minute)/60, (120-Late.minute)%60);
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" ���� : (�̹� �����ΰ� �˰� �ִµ�..) �б� �ٳ���ڽ��ϴ�.\n\n");
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" ���� : �������� ������ Ÿ�� � �� ����?\n\n");
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" [������� ���������� 3�� �ۿ� Ÿ�� ���� �����Ÿ� ������ ���� ž�ϴ�.]\n\n");
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" ���� : īī�� ���̵� �� �� ��� ���� �뷡 Ʋ���� !\n\n");
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" kakao : �����ī���� ����� ���� ����մϴ�.\n\n");
		Envi.play4();
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" ���� �ð� %d�� %d������ ���� ������ ������ �߽��ϴ�..\n\n", 7+(120-Late.minute)/60, (120-Late.minute)%60);
						
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
						numOfLate ++;
						System.out.printf(" %d° ��  ���� ���� Ƚ�� : %dȸ\n\n", 1+i, numOfLate);
					
		
	}
	static void latein(int input){
		minute -= input;
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" [���� %d���� �����Ǿ� ���� ������ %d�� �Դϴ�.]\n\n",input,Late.minute);
	}
	static void late10(){
		minute -= 10;
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" [���� 10���� �����Ǿ� ���� ������ %d�� �Դϴ�.]\n\n",Late.minute);
	}
	
	static void late30(){
		minute -= 30;
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" [���� 30���� �����Ǿ� ���� ������ %d�� �Դϴ�.]\n\n",Late.minute);
	}
	static void late5(){
		minute -= 5;
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" [���� 5���� �����Ǿ� ���� ������ %d�� �Դϴ�.]\n\n", Late.minute);
	}
	static void late20(){
		minute -= 20;
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" [���� 20���� �����Ǿ� ���� ������ %d�� �Դϴ�.]\n\n", Late.minute);
	}
	static void sentence_walk(){
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" [�������� �����Ͽ� �ɾ ���±�..������ Ȯ���� ��õ���� ���� �ɾ���ų� �ʹ� ���̸��� ���Ḧ �緯 �������� �鸳�ϴ�.]\n\n");
		double r = 0;
		r = Math.random();
		if(r<0.4){
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
			System.out.printf(" ���� ���� : �ȳ��ϼ��� �л� Ȥ�� ��� ��� �� �� �� �������?\n\n");
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
			System.out.printf(" ��ȭ�� �Ϸ��� (Y/y)�� ���Ϸ��� (N/n)�� �Է����ּ���.\n>>");
			while(true){
				yn = sc.next();
				if(yn.equals("y")|| yn.equals("Y")){
					
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
					System.out.printf(" [��ð��� ��ȭ....]\n\n");
					latein(8);
					
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
					System.out.printf(" [������ ���ǽǷ� �ɾ��.]\n\n");
					latein(9);
					if(minute>0){
						
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
					System.out.printf(" ���� �ð� %d�� %d������ ���� ������ ������ ���� �ʾҽ��ϴ�!\n\n", 7+(120-Late.minute)/60, (120-Late.minute)%60);
					
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
					System.out.printf(" %d° ��  ���� ���� Ƚ�� : %dȸ\n\n", 1+ KaKao.i, numOfLate);
					}
					else {
						
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
						System.out.printf(" ���� �ð� %d�� %d������ ���� ������ ������ �߽��ϴ�..\n\n", 7+(120-Late.minute)/60, (120-Late.minute)%60);
						
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
						numOfLate ++;
						System.out.printf(" %d° ��  ���� ���� Ƚ�� : %dȸ\n\n", 1+i, numOfLate);
					}
					
					break;
				}
				else if(yn.equals("N")|| yn.equals("n")){
					
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
					System.out.printf(" ���� : �ƴ� �����ƿ�.. �� �ұ������Դϴ�.\n\n");
					
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
					System.out.printf(" [������ ���ǽǷ� �ɾ��.]\n\n");
					latein(13);
					if(minute>0){
						
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
					System.out.printf(" ���� �ð� %d�� %d������ ���� ������ ������ ���� �ʾҽ��ϴ�!\n\n", 7+(120-Late.minute)/60, (120-Late.minute)%60);
					
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
					System.out.printf(" %d° ��  ���� ���� Ƚ�� : %dȸ\n\n", 1+i, numOfLate);
					}
					else {
						
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
						System.out.printf(" ���� �ð� %d�� %d������ ���� ������ ������ �߽��ϴ�..\n\n", 7+(120-Late.minute)/60, (120-Late.minute)%60);
						numOfLate ++;
						
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
						System.out.printf(" %d° ��  ���� ���� Ƚ�� : %dȸ\n\n", 1+i, numOfLate);
					}
					break;
				}
				else
					
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
					System.out.printf(" [�߸��� �Է��Դϴ�. Y/y �Ǵ� N/n�� �Է����ּ���.]\n>>");
				}
				}
		else if(r>=0.4&&r<0.8){
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
			System.out.printf(" ���� : ��.. �ʹ� �񸶸��� ����� �ϳ��� ���� ������\n\n");
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
			System.out.printf(" [������� �緯 �������� �鸮�ðڽ��ϱ�? �鸮�÷��� (Y/y)�� �ƴ϶�� (N/n)�� �Է����ּ���.]\n>>");
			yn = sc.next();
			if(yn.equals("y")|| yn.equals("Y")){
				
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf("\n\n [�������� �鷯 ������� ��� ��..]\n\n");
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" ���� : ���� ������ �������� �갳����.\n\n");
		Late.late10();
			}
			else if(yn.equals("N")|| yn.equals("n")){
				
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" [���� ���� �����ӵ��� �������ϴ�. �����ӵ� ���ҿ� ��� �� ������ �����˴ϴ�.]\n\n");
		Late.latein(25);
			}
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
					System.out.printf(" [������ ���ǽǷ� �ɾ��.]\n\n");
					latein(4);
					if(minute>0){
						
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
					System.out.printf(" ���� �ð� %d�� %d������ ���� ������ ������ ���� �ʾҽ��ϴ�!\n\n", 7+(120-Late.minute)/60, (120-Late.minute)%60);
					
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
					System.out.printf(" %d° ��  ���� ���� Ƚ�� : %dȸ\n\n", 1+i, numOfLate);
					}
					else {
						
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" [�ƹ� �� ���� �ٷ� ���ǽǷ� ���մϴ�.]\n\n");
						
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
						System.out.printf(" ���� �ð� %d�� %d������ ���� ������ ������ �߽��ϴ�..\n\n", 7+(120-Late.minute)/60, (120-Late.minute)%60);
						numOfLate ++;
						
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
						System.out.printf(" %d° ��  ���� ���� Ƚ�� : %dȸ\n\n", 1+i, numOfLate);
					}
		}
		else {
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
			System.out.printf(" [������ ���ǽǷ� �ɾ��.]\n\n");
					latein(13);
					if(minute>0){
						
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
					System.out.printf(" ���� �ð� %d�� %d������ ���� ������ ������ ���� �ʾҽ��ϴ�!\n\n", 7+(120-Late.minute)/60, (120-Late.minute)%60);
					
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
					System.out.printf(" %d° ��  ���� ���� Ƚ�� : %dȸ\n\n", 1+i, numOfLate);
					}
					else {
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		System.out.printf(" ���� �ð� %d�� %d������ ���� ������ ������ �߽��ϴ�..\n\n", 7+(120-Late.minute)/60, (120-Late.minute)%60);
						numOfLate ++;
						
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
						System.out.printf(" %d° ��  ���� ���� Ƚ�� : %dȸ\n\n", 1+i, numOfLate);
					}
			
		}
	}
	}

class ima extends Envi{
 static void imgg(String x){

    JFrame oJFrame        = new JFrame("�׸� ����");
    ImageIcon oImageIcon  = new ImageIcon(x+".png");
    JLabel oJLabel        = new JLabel(oImageIcon);

    oJFrame.add(oJLabel);
    oJFrame.pack();
    oJFrame.setVisible(true);
    oJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}