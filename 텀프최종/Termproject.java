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
		System.out.printf("\n 경북대학교를 다니는 연우는 학교에서 먼 거리에 있는 집에 거주하고 있다.\n\n 계절학기로 자바 프로그래밍 수업을 신청한 연우는 앞으로 수업 종강까지 5번의 수업이 남아있다.\n\n 자바 수업의 교수님은 지각에 매우 엄격하셔서 지각 한번을 할 때 마다 성적에 크게 영향이 있을거라고 말씀하셨다.\n\n 아직까지 운 좋게 지각을 한번도 안했지만 앞으로 남은 수업동안 지각을 하지않을지는 의문이다.\n\n(하루 중 주인공의 행동에 점수를 대응시켜 여러 행동이 이루어질 때 마다 점수를 차감하여 시간으로 환산하고\n\n 기상시간은 알람종료 여부에 의해 결정되며 기상시간에 따라 스토리가 달라집니다. \n\n 특정 점수보다 낮을 시 지각으로 체크합니다.)\n\n\n");
		System.out.print("[연우의 지각 프로그램을 보고 싶으면(Y/y)를 프로그램을 종료하려면(N/n)을 입력해주세요.]\n>>");
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
			System.out.println("오류 발생");
		}
		System.out.printf(" [몇 일 후.... 성적 발표일]\n\n");
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		if(Late.numOfLate==0 || Late.numOfLate ==1){
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
			System.out.printf(" [중간고사와 기말고사를 모두 100점을 맞은 연우의 총 지각 횟수는 %d번으로 따라서 성적은 A+입니다.]\n\n",Late.numOfLate); 
		
			ima.imgg("a");
			break;
		}
		if(Late.numOfLate==0 || Late.numOfLate ==1){
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
			System.out.printf(" [중간고사와 기말고사를 모두 100점을 맞은 연우의 총 지각 횟수는 %d번으로 따라서 성적은 a+입니다.]\n\n",Late.numOfLate); 
	
			ima.imgg("a");
			break;
		}
		
		if(Late.numOfLate==2 || Late.numOfLate ==3){
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
			System.out.printf(" [중간고사와 기말고사를 모두 100점을 맞은 연우의 총 지각 횟수는 %d번으로 따라서 성적은 b+입니다.]\n\n",Late.numOfLate); 
		
			ima.imgg("b");
			break;
		}
		if(Late.numOfLate==4){
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
			System.out.printf(" [중간고사와 기말고사를 모두 100점을 맞은 연우의 총 지각 횟수는 %d번으로 따라서 성적은 c+입니다.]\n\n",Late.numOfLate); 
		
			ima.imgg("c");
			break;
		}
		if(Late.numOfLate>=5){
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
			System.out.printf(" [중간고사와 기말고사를 모두 100점을 맞은 연우의 총 지각 횟수는 %d번으로 따라서 성적은 f입니다.]\n\n",Late.numOfLate); 
		
			ima.imgg("f");
			break;
		}
		else if(yn.equals("N")|| yn.equals("n")){
			System.out.println("[프로그램을 종료합니다.]");
			return;
		}
		else
			System.out.printf(" [잘못된 입력입니다. Y/y 또는 N/n을 입력해주세요.]\n>>");
		}
	}
	}
	static void play1(){
		File f = new File("볼.wav");
		if(!f.exists()){
			System.out.printf(" 해당 음악 파일이 존재하지 않습니다. 다시 다운로드 해 주세요.");
		}
		try{
			AudioInputStream stream = AudioSystem.getAudioInputStream(f);
			Clip c = AudioSystem.getClip();
			c.open(stream);
			c.start();
		
		verse1();
				sc.nextLine();
		System.out.printf(" kakao : 노래를 종료하시려면 \"종료\"를 입력해주세요 종료되지 않을시 계속 재생됩니다.\n>>");
		while(true){
		input = sc.nextLine();
		if(input.equals("종료")){
			c.close();
			stream.close();
			break;
		}
		else System.out.printf(" [잘못된 입력입니다. 다시 입력해주세요.]\n>>");
			}
			}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	static void play2(){
		File f = new File("숨.wav");
		if(!f.exists()){
			System.out.printf(" 해당 음악 파일이 존재하지 않습니다. 다시 다운로드 해 주세요.");
		}
		try{
			AudioInputStream stream = AudioSystem.getAudioInputStream(f);
			Clip c = AudioSystem.getClip();
			c.open(stream);
			c.start();
		
		verse2();
				sc.nextLine();
		System.out.printf(" kakao : 노래를 종료하시려면 \"종료\"를 입력해주세요 종료되지 않을시 계속 재생됩니다.\n>>");
		
		while(true){
		input = sc.nextLine();
		if(input.equals("종료")){
			c.close();
			stream.close();
			break;
		}
		else System.out.printf(" [잘못된 입력입니다. 다시 입력해주세요.]\n>>");
			}
			}catch(Exception e){
			e.printStackTrace();
		}
	}
	static void play3(){
		File f = new File("에일리.wav");
		if(!f.exists()){
			System.out.printf(" 해당 음악 파일이 존재하지 않습니다. 다시 다운로드 해 주세요.");
		}
		try{
			AudioInputStream stream = AudioSystem.getAudioInputStream(f);
			Clip c = AudioSystem.getClip();
			c.open(stream);
			c.start();
		
		verse3();
				sc.nextLine();
		System.out.printf(" kakao : 노래를 종료하시려면 \"종료\"를 입력해주세요 종료를 입력하지 않을시 계속 재생됩니다.\n>>");
		while(true){
		input = sc.nextLine();
		if(input.equals("종료")){
			c.close();
			stream.close();
			break;
		}
		else System.out.printf(" [잘못된 입력입니다. 다시 입력해주세요.]\n>>");
			}
			}catch(Exception e){
			e.printStackTrace();
		}
	}
		static void play4(){
		File f = new File("목.wav");
		if(!f.exists()){
			System.out.printf(" 해당 음악 파일이 존재하지 않습니다. 다시 다운로드 해 주세요.");
		}
		try{
			AudioInputStream stream = AudioSystem.getAudioInputStream(f);
			Clip c = AudioSystem.getClip();
			c.open(stream);
			c.start();
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" [자전거 타고 등교하는 길..(30초간 음악감상을 합시다)]\n\n");
		try{
		Thread.sleep(30000);
		c.close();
		stream.close();
		System.out.printf(" [강의실 앞 까지 도착..]\n\n");
		}catch(Exception e){
			System.out.println("오류 발생");
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
			System.out.println("오류 발생");
		}
		System.out.printf(" kakao : 가사를 보고 싶으시면 (Y/y) 보고싶지 않으면 (N/n)을 입력해주세요\n>>");
		while(true){
		yn = sc.next();
		if(yn.equals("y")|| yn.equals("Y")){
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
			System.out.println("\n 커피를 너무 많이 마셨나 봐요\n 심장이 막 두근대고 잠은 잘 수가 없어요\n 한참 뒤에 별빛이 내리면\n 난 다시 잠들 순 없겠죠\n 지나간 새벽을 다 새면\n 다시 네 곁에 잠들겠죠\n 너의 품에 잠든 난 마치\n 천사가 된 것만 같아요\n 난 그대 품에 별빛을 쏟아 내리고\n 은하수를 만들어 어디든 날아가게 할거야\n Cause I’m a pilot anywhere\n Cause I’m a pilot anywhere\n lighting star shooting star 줄게 내 Galaxy...\n\n");
			break;
		}
		else if(yn.equals("N")|| yn.equals("n")){
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
			System.out.println(" kakao : 가사를 띄우지 않습니다.\n\n");
			break;
		}
		else
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
			System.out.printf(" [잘못된 입력입니다. Y/y 또는 N/n을 입력해주세요.]\n>>");
		}
	}
	static void verse2(){
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" kakao : 가사를 보고 싶으시면 (Y/y) 보고싶지 않으면 (N/n)을 입력해주세요\n>>");
		while(true){
		yn = sc.next();
		if(yn.equals("y")|| yn.equals("Y")){
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
			System.out.printf("\n 오늘 하루 쉴 숨이\n 오늘 하루 쉴 곳이\n 오늘만큼 이렇게 또 한번 살아가\n 침대 밑에 놓아둔\n 지난 밤에 꾼 꿈이\n 지친 맘을 덮으며\n 눈을 감는다 괜찮아\n 남들과는 조금은 다른 모양 속에\n 나 홀로 잠들어\n 다시 오는 아침에\n 눈을 뜨면 웃고프다\n 오늘 같은 밤\n 이대로 머물러도 될 꿈이라면\n 바랄 수 없는걸 바라도 된다면\n 두렵지 않다면 너처럼\n 오늘 같은 날\n 마른 줄 알았던\n 오래된 눈물이 흐르면\n 잠들지 않는 내 작은 가슴이\n 숨을 쉰다\n 끝도 없이 먼 하늘\n 날아가는 새처럼\n 뒤돌아 보지 않을래...\n\n");
			break;
		}
		else if(yn.equals("N")|| yn.equals("n")){
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
			System.out.println(" kakao : 가사를 띄우지 않습니다.\n\n");
			break;
		}
		else
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
			System.out.printf(" [잘못된 입력입니다. Y/y 또는 N/n을 입력해주세요.]\n>>");
		}
	}
	static void verse3(){
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" kakao : 가사를 보고 싶으시면 (Y/y) 보고싶지 않으면 (N/n)을 입력해주세요\n>>");
		while(true){
		yn = sc.next();
		if(yn.equals("y")|| yn.equals("Y")){
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
			System.out.println("\n 늘 하던 대로 눈을 떴는데\n 니 생각이 날 때\n 하루가 틀어지곤 해\n 지겹도록 미운 너\n but I miss you\n and I need you\n 전보다도 더\n 이젠 울기에도\n 조금 민망해진 timing\n 참 뭐랄까 낡은 그리움\n 너무 많은 coffee를\n 마신 건가 봐\n 잠이 오지 않아\n 뒤척인 시간 뒤에\n 내 베개 밑엔 네 얼굴\n so I miss you...\n\n");
			break;
		}
		else if(yn.equals("N")|| yn.equals("n")){
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
			System.out.println(" kakao : 가사를 띄우지 않습니다.\n\n");
			break;
		}
		else
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
			System.out.printf(" [잘못된 입력입니다. Y/y 또는 N/n을 입력해주세요.]\n>>");
		}
	}
	static void mother(){
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" 엄마 : 연우야 오늘은 일찍 일어났네? 씻고 밥먹어야지.\n\n");
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" 연우 : 네 씻고 올게요.\n\n");
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" [촤아악 칙칙 치카치카 졸졸졸]\n\n");
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		Late.late20();
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" 연우 : 후 상쾌하다. 엄마 오늘 밥은 뭡니까?\n\n");
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" 엄마 : 식탁에 차려진거 먹고 나가.\n\n");
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" 연우 : 잘 먹겠습니다. \n\n");
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" [우걱우걱 촵촵 냠냠쩝쩝]\n\n");
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
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
			System.out.println("오류 발생");
		}
		System.out.printf("\n [%d번째 날..]\n\n",i+1);
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		
		System.out.printf("\n kakao : (알람) 현재시각 아침 7시 입니다. 기상 기상 \n\n");
		while(true){
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.print(" kakao : 알람을 종료 하시겠습니까?(Y/y or N/n)\n>>");
		yn = sc.next();
		if(yn.equals("y")|| yn.equals("Y")){
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
			System.out.printf("\n\n kakao : 알람을 종료합니다.\n\n");
			if(cnt == 0) Player.sentence3();
			else if (cnt == 1) Player.sentence3_1();
			else if(cnt == 2) Player.sentence3_2();//택시
			else if(cnt>=3&&cnt<5)Late.late();
			else {
				System.out.printf(" 오늘은 자체 공강입니다..\n\n");
				Late.numOfLate++;
				try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
						System.out.printf(" %d째 날  현재 지각 횟수 : %d회\n\n", 1+i, Late.numOfLate);
		
			}
			break;
		}
		else if(yn.equals("N")|| yn.equals("n")){
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
			System.out.printf(" kakao : 30분뒤 알람이 다시 울립니다.\n\n");
			Late.late30();
			cnt ++;
		}
		else{
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
			System.out.printf(" [잘못된 입력입니다. Y/y 또는 N/n을 입력해주세요.]\n>>");
		}
	}
	}
	static void sentence4_1(){
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" kakao : 플레이 리스트 : 박효신_숨, 에일리_낡은 그리움, 볼빨간사춘기_우주를줄게\n\n");
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" kakao : 플레이하고 싶은 노래를 말씀 해 주세요.(가수의 이름을 입력해주세요)\n>>");
		Player.sentence5();
	}
}
class Player extends Envi{
	static void sentence3(){
		if(Late.minute == 120){
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
			System.out.printf(" 연우 : 아 상쾌하다 오늘은 좀 여유 있게 일어났네.\n\n 	 카카오 노래 한 곡 듣게 리스트좀 보여줘\n\n");
			KaKao.sentence4_1();
		}
		else if(Late.minute < 120 && Late.minute >= 90)
			System.out.printf(" 연우 : 아 조금 늦었다. 빨리 준비 해야겠어\n\n");
		else
			System.out.printf(" 연우 : 큰일 났다... 엄마 왜 저 안 깨웠어요 저 늦었으니까 택시비 좀 주실 수 있으세요?\n\n");
	}
	static void sentence3_1(){//1시간 30분 전에 일어난 경우
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" 연우 : 하.. 빠듯하겠네. 빨리 준비 해야겠어\n\n");
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" 연우 : 늦어도 샤워는 하고 나가야지.\n\n");
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" [샤워하는 소리.. ]\n\n");
		Late.latein(20);
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" 엄마 : 연우야 밥은 어쩌려고? 조금이라도 먹고 나가야지.\n\n");
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" 연우 : 저 대충 챙겨서 나갈게요 !\n\n");
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" [냉장고에서 샌드위치를 챙겨서 빠르게 나간다.]\n\n");
		Late.late5();
		sentence_bus();
		
	}
	static void sentence3_2(){
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" 연우 : 하.. 나는 왜 맨날 늦잠을 잘까... 빨리 씻고 나가야겠다.\n\n");
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" [대충 씻고 모자를 눌러쓰고 등교 준비를 한다.]\n\n");
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" 연우 : 엄마 저 늦었는데 택시비 좀 주세요!\n\n");
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" 엄마 : 그러니까 일찍 일찍 일어나야지 어제 그렇게 늦게 들어오더니.\n\n");
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" [연우에게 택시비를 지급하시려면 \"지급\"을 거절하시려면 \"거절\"을 입력해주세요]\n>>");
		sc.nextLine();
		while(true){
		yn = sc.nextLine();
		if(yn.equals("지급")){
			try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" 엄마 : 자 택시비 늦지않게 빨리 출발 해\n\n");
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" 연우 : 학교 다녀오겠습니다!\n\n");
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" 연우 : 카카오 택시 불러줘.\n\n");
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" kakao : 현재 300m 근처의 택시 약 2분뒤 도착합니다.\n\n");
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" [택시에 승차.. 학교로 바로 향한다.]\n\n");
		Late.late30();
		if(Late.minute>0){
						
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
					System.out.printf(" 현재 시각 %d시 %d분으로 오늘 수업은 지각을 하지 않았습니다!\n\n", 7+(120-Late.minute)/60, (120-Late.minute)%60);
					
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
					System.out.printf(" %d째 날  현재 지각 횟수 : %d회\n\n", 1+i, Late.numOfLate);
					break;
					}
					else {
						
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
						System.out.printf(" 현재 시각 %d시 %d분으로 오늘 수업은 지각을 했습니다..\n\n", 7+(120-Late.minute)/60, (120-Late.minute)%60);
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
						Late.numOfLate ++;
						System.out.printf(" %d째 날  현재 지각 횟수 : %d회\n\n", 1+i, Late.numOfLate);
						break;
					}
		}
		else if(yn.equals("거절")){
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}	
			System.out.printf(" 엄마 : 미안 엄마 돈 없다 그러게 일찍 일어나지 그랬니..\n\n");
			try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
			System.out.printf(" 연우 : 네.. 학교 다녀오겠습니다..\n\n");
			try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" [걸어서 버스 정류장까지 가는길..]\n\n");
		Late.latein(3);
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" [현재 정류장.. (버스의 배차간격은 10분입니다).]\n\n");
		if(Late.minute % 10 == 0){
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
			System.out.printf(" [현재시각 %d시 %d분으로 바로 버스에 승차합니다.]", 7+(120-Late.minute)/60, (120-Late.minute)%60);
			Late.latein(50);
			Late.sentence_walk();
		}
		else{
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
			System.out.printf(" [현재시각 %d시 %d분으로 %d분 후에 버스에 승차합니다.]", 7+(120-Late.minute)/60, (120-Late.minute)%60, 10-((120-Late.minute)%10));
			Late.latein((Late.minute%10)+50);
			Late.sentence_walk();
		}
		break;
		}
		else System.out.printf(" 잘못된 입력입니다. 다시 입력 해 주세요\n>>");
		}
	}
	static void sentence5(){
		sc.nextLine();
		String music;
		while(true){
		music = sc.nextLine();
		if(music.equals("볼빨간사춘기")){
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
			System.out.printf("\n\n 연우 : 볼빨간사춘기 노래 틀어줘\n\n");
			System.out.printf(" kakao : 노래를 재생합니다.\n\n");
			play1();
			Late.late5();
			mother();
			break;
		}
		else if(music.equals("박효신")){
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
			System.out.printf("\n\n 박효신 노래 틀어줘\n\n");
			System.out.printf(" kakao : 노래를 재생합니다.\n\n");
			play2();
			Late.late5();
			mother();
			break;
		}
		else if(music.equals("에일리")){
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
			System.out.printf("\n\n 연우 : 에일리 노래 틀어줘\n\n");
			System.out.printf(" kakao : 노래를 재생합니다.\n\n");
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
			System.out.println("오류 발생");
		}
			System.out.printf("\n\n kakao : 리스트에 없는 노래 입니다. 다시 노래를 선택 해주세요.\n\n");
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
			System.out.printf("  	 플레이하고 싶은 노래를 말씀 해 주세요.(가수의 이름을 입력해주세요)\n>>");
		
		}
		}
	}
	static void sentence_bus(){
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" 연우 : 학교 다녀오겠습니다!\n\n");
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" [걸어서 버스 정류장까지 가는길..]\n\n");
		Late.latein(3);
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" [현재 정류장.. (버스의 배차간격은 10분입니다).]\n\n");
		if(Late.minute % 10 == 0){
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
			System.out.printf(" [현재시각 %d시 %d분으로 바로 버스에 승차합니다.]", 7+(120-Late.minute)/60, (120-Late.minute)%60);
			Late.latein(50);
			Late.sentence_walk();
		}
		else{
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
			System.out.printf(" [현재시각 %d시 %d분으로 %d분 후에 버스에 승차합니다.]", 7+(120-Late.minute)/60, (120-Late.minute)%60, 10-((120-Late.minute)%10));
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
			System.out.println("오류 발생");
		}
		System.out.printf(" 연우 : 큰일 났다.. 무조건 지각이다...\n\n");
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" 연우 : 어차피 늦은거 여유있게 가자.\n\n");
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" 연우 : 카카오 신나는 노래 좀 틀어 줘.\n\n");
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" kakao : 볼빨간 사춘기의 우주를 줄게를 재생합니다.\n\n ");
		minute -= 5;
		Envi.play1();
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" [씻는소리.. 촤아악 슈욱 졸졸 치카치카..]\n\n");
		minute -= 20;
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" [밥 먹는소리.. 냠냠쩝쩝 쿰척.. 우걱우걱]\n\n");
		minute -= 20;
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" 연우 : 카카오 지금 몇시야?\n\n");
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" kakao : 현재시각 %d시 %d분으로 오늘 수업은 지각이십니다.\n\n",  7+(120-Late.minute)/60, (120-Late.minute)%60);
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" 연우 : (이미 지각인거 알고 있는데..) 학교 다녀오겠습니다.\n\n");
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" 연우 : 오랜만에 자전거 타고 등교 해 볼까?\n\n");
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" [등교용으로 구매했으나 3번 밖에 타지 않은 자전거를 차고에서 꺼내 탑니다.]\n\n");
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" 연우 : 카카오 라이딩 할 때 듣기 좋은 노래 틀어줘 !\n\n");
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" kakao : 어반자카파의 목요일 밤을 재생합니다.\n\n");
		Envi.play4();
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" 현재 시각 %d시 %d분으로 오늘 수업은 지각을 했습니다..\n\n", 7+(120-Late.minute)/60, (120-Late.minute)%60);
						
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
						numOfLate ++;
						System.out.printf(" %d째 날  현재 지각 횟수 : %d회\n\n", 1+i, numOfLate);
					
		
	}
	static void latein(int input){
		minute -= input;
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" [점수 %d점이 차감되어 현재 점수는 %d점 입니다.]\n\n",input,Late.minute);
	}
	static void late10(){
		minute -= 10;
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" [점수 10점이 차감되어 현재 점수는 %d점 입니다.]\n\n",Late.minute);
	}
	
	static void late30(){
		minute -= 30;
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" [점수 30점이 차감되어 현재 점수는 %d점 입니다.]\n\n",Late.minute);
	}
	static void late5(){
		minute -= 5;
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" [점수 5점이 차감되어 현재 점수는 %d점 입니다.]\n\n", Late.minute);
	}
	static void late20(){
		minute -= 20;
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" [점수 20점이 차감되어 현재 점수는 %d점 입니다.]\n\n", Late.minute);
	}
	static void sentence_walk(){
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" [버스에서 하차하여 걸어서 가는길..일정한 확률로 신천지가 말을 걸어오거나 너무 목이말라 음료를 사러 편의점에 들립니다.]\n\n");
		double r = 0;
		r = Math.random();
		if(r<0.4){
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
			System.out.printf(" 낯선 행인 : 안녕하세요 학생 혹시 잠깐 얘기 좀 할 수 있을까요?\n\n");
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
			System.out.printf(" 대화를 하려면 (Y/y)를 피하려면 (N/n)을 입력해주세요.\n>>");
			while(true){
				yn = sc.next();
				if(yn.equals("y")|| yn.equals("Y")){
					
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
					System.out.printf(" [장시간의 대화....]\n\n");
					latein(8);
					
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
					System.out.printf(" [빠르게 강의실로 걸어간다.]\n\n");
					latein(9);
					if(minute>0){
						
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
					System.out.printf(" 현재 시각 %d시 %d분으로 오늘 수업은 지각을 하지 않았습니다!\n\n", 7+(120-Late.minute)/60, (120-Late.minute)%60);
					
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
					System.out.printf(" %d째 날  현재 지각 횟수 : %d회\n\n", 1+ KaKao.i, numOfLate);
					}
					else {
						
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
						System.out.printf(" 현재 시각 %d시 %d분으로 오늘 수업은 지각을 했습니다..\n\n", 7+(120-Late.minute)/60, (120-Late.minute)%60);
						
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
						numOfLate ++;
						System.out.printf(" %d째 날  현재 지각 횟수 : %d회\n\n", 1+i, numOfLate);
					}
					
					break;
				}
				else if(yn.equals("N")|| yn.equals("n")){
					
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
					System.out.printf(" 연우 : 아니 괜찮아요.. 저 불교신자입니다.\n\n");
					
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
					System.out.printf(" [빠르게 강의실로 걸어간다.]\n\n");
					latein(13);
					if(minute>0){
						
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
					System.out.printf(" 현재 시각 %d시 %d분으로 오늘 수업은 지각을 하지 않았습니다!\n\n", 7+(120-Late.minute)/60, (120-Late.minute)%60);
					
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
					System.out.printf(" %d째 날  현재 지각 횟수 : %d회\n\n", 1+i, numOfLate);
					}
					else {
						
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
						System.out.printf(" 현재 시각 %d시 %d분으로 오늘 수업은 지각을 했습니다..\n\n", 7+(120-Late.minute)/60, (120-Late.minute)%60);
						numOfLate ++;
						
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
						System.out.printf(" %d째 날  현재 지각 횟수 : %d회\n\n", 1+i, numOfLate);
					}
					break;
				}
				else
					
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
					System.out.printf(" [잘못된 입력입니다. Y/y 또는 N/n을 입력해주세요.]\n>>");
				}
				}
		else if(r>=0.4&&r<0.8){
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
			System.out.printf(" 연우 : 하.. 너무 목마르다 음료수 하나만 사들고 가야지\n\n");
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
			System.out.printf(" [음료수를 사러 편의점에 들리시겠습니까? 들리시려면 (Y/y)를 아니라면 (N/n)을 입력해주세요.]\n>>");
			yn = sc.next();
			if(yn.equals("y")|| yn.equals("Y")){
				
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf("\n\n [편의점에 들러 음료수를 사는 중..]\n\n");
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" 연우 : 역시 술마신 다음날엔 헛개수지.\n\n");
		Late.late10();
			}
			else if(yn.equals("N")|| yn.equals("n")){
				
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" [목이 말라 걸음속도가 느려집니다. 걸음속도 감소에 비례 해 점수가 차감됩니다.]\n\n");
		Late.latein(25);
			}
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
					System.out.printf(" [빠르게 강의실로 걸어간다.]\n\n");
					latein(4);
					if(minute>0){
						
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
					System.out.printf(" 현재 시각 %d시 %d분으로 오늘 수업은 지각을 하지 않았습니다!\n\n", 7+(120-Late.minute)/60, (120-Late.minute)%60);
					
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
					System.out.printf(" %d째 날  현재 지각 횟수 : %d회\n\n", 1+i, numOfLate);
					}
					else {
						
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" [아무 일 없이 바로 강의실로 향합니다.]\n\n");
						
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
						System.out.printf(" 현재 시각 %d시 %d분으로 오늘 수업은 지각을 했습니다..\n\n", 7+(120-Late.minute)/60, (120-Late.minute)%60);
						numOfLate ++;
						
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
						System.out.printf(" %d째 날  현재 지각 횟수 : %d회\n\n", 1+i, numOfLate);
					}
		}
		else {
			
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
			System.out.printf(" [빠르게 강의실로 걸어간다.]\n\n");
					latein(13);
					if(minute>0){
						
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
					System.out.printf(" 현재 시각 %d시 %d분으로 오늘 수업은 지각을 하지 않았습니다!\n\n", 7+(120-Late.minute)/60, (120-Late.minute)%60);
					
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
					System.out.printf(" %d째 날  현재 지각 횟수 : %d회\n\n", 1+i, numOfLate);
					}
					else {
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
		System.out.printf(" 현재 시각 %d시 %d분으로 오늘 수업은 지각을 했습니다..\n\n", 7+(120-Late.minute)/60, (120-Late.minute)%60);
						numOfLate ++;
						
		try{
		Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("오류 발생");
		}
						System.out.printf(" %d째 날  현재 지각 횟수 : %d회\n\n", 1+i, numOfLate);
					}
			
		}
	}
	}

class ima extends Envi{
 static void imgg(String x){

    JFrame oJFrame        = new JFrame("그림 보기");
    ImageIcon oImageIcon  = new ImageIcon(x+".png");
    JLabel oJLabel        = new JLabel(oImageIcon);

    oJFrame.add(oJLabel);
    oJFrame.pack();
    oJFrame.setVisible(true);
    oJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}