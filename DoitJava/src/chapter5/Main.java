


package chapter5;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������ �����ϼ���");
		Scanner scan = new Scanner(System.in);
		String problem = scan.nextLine();
		if(problem.equals("��������")) {
			String a1 = Integer.valueOf(20).toString();
			double a2 = Double.valueOf("35.9");
			boolean a3 = Boolean.valueOf("true");
			String a4 = Integer.valueOf(30).toString();
			String a5 = Character.valueOf('c').toString();
			System.out.println(a1);
			System.out.println(a2);
			System.out.println(a3);
			System.out.println(a4);
			System.out.println(a5);
			
			//��Ʈ�� ���ͷ��� ������ ���ڿ��� ��Ʈ�� ���ͷ� ���̺��� ������ , ���� new �� �����ϴ� ���ڿ��� ���� ���� ���޸𸮾ȿ��� ��ü�� �����Ǿ� ������
			String b1 ="�����ٶ�";
			//a �� "�����ٶ�"�� ���� �ּҸ� ������.
			System.out.println(b1 == "�����ٶ�");
			String b2 = new String(b1);
			System.out.println(b2 == b2);
			
			String c1 = new String(" Oh, Happy  ");
			String c2 = c1.trim();
			String c3 = c2.concat(" Day.");
			System.out.println(c3);

			//100���� 255���� ���� ����
			for(int i=0;i<10;i++) {
				System.out.print((int)(Math.random()*157) + 99);
				System.out.print(" ");
			}
			System.out.println();
			for(int i=0;i<10;i++) {
				Random random = new Random();
				System.out.print(random.nextInt(156) + 100);
				System.out.print(" ");
			}
			System.out.println();
			Calendar date = Calendar.getInstance();;
			date.clear();
			date.set(Calendar.YEAR, 2020);
			date.set(Calendar.MONTH, 11);
			date.set(Calendar.DAY_OF_MONTH, 25);
			System.out.println("��� ��¥�� "+date.get(Calendar.YEAR)+"�� "+(date.get(Calendar.MONTH)+1)+"�� "+date.get(Calendar.DAY_OF_MONTH)+"��");
		}
		//equal override
		else if(problem.equals("1")) {
			MyPoint p = new MyPoint(3,50);
			MyPoint q = new MyPoint(4,50);
			System.out.println(p);
			if(p.equals(q)) {
				System.out.println("���� ��");
			}
			else
				System.out.println("�ٸ� ��");
		}
		else if(problem.equals("2")) {
			Circle a = new Circle(2,3,5);
			Circle b = new Circle(2,3,30);
			System.out.println("�� a :"+a);
			System.out.println("�� b :"+b);
			if(a.equals(b)) {
				System.out.println("���� ��");
			}
			else {
				System.out.println("���� �ٸ� ��");
			}
		}
		//Calendar
		else if(problem.equals("3")) {
			Calendar cal = Calendar.getInstance();
			int hour = cal.get(Calendar.HOUR_OF_DAY);
			System.out.println(hour);
			if(hour>=4 && hour < 12 ) {
				System.out.println("Good Morning");
			}
			else if(hour >= 12 && hour < 18) {
				System.out.println("Good Afternoon");
			}
			else if(hour >= 18 && hour < 22) {
				System.out.println("Good Evening");
			}
			else if(hour >= 22|| hour <4) {
				System.out.println("Good Night");
			}
		}
		//10�ʿ� �� ����� ����� �̱�� ����
		else if(problem.equals("4")) {
			Calendar cal = Calendar.getInstance();
			System.out.println("10�ʿ� ����� ����� �̱�� �����Դϴ�.");
			int person1;
			int person2;
			System.out.print("Ȳ���� ���� <Enter Ű>   >> ");
			System.out.println(cal.get(Calendar.SECOND));
			System.out.print("10�� ���� �� <Enter Ű>   >> ");
			scan.nextLine();
			cal = Calendar.getInstance();
			person1 = cal.get(Calendar.SECOND);
			System.out.println(person1);
			System.out.print("���繮 ���� <Enter Ű>   >> ");
			System.out.println(cal.get(Calendar.SECOND));
			System.out.print("10�� ���� �� <Enter Ű>   >> ");
			scan.nextLine();
			cal = Calendar.getInstance();
			person2 = cal.get(Calendar.SECOND);
			System.out.println(person2);
			System.out.println("Ȳ���� ��� "+person1+" , ���繮�� ��� "+person2+", ���ڴ� "+(Math.abs(person1-10)<Math.abs(person2-10)?"Ȳ����":"���繮"));
		}
		//���� ����
		else if(problem.equals("5")) {
			String text = "";
			while(true) {
				System.out.print(">>  ");
				text = scan.nextLine();
				if(text.equals("�׸�")) {
					System.out.println("�����մϴ�..");
					break;
				}
				StringTokenizer st = new StringTokenizer(text, " ");
				System.out.println("���� ������ "+st.countTokens());
			}
			
			while(true) {
				System.out.print(">>  ");
				text = scan.nextLine();
				if(text.equals("�׸�")) {
					System.out.println("�����մϴ�..");
					break;
				}
				String list[] = text.split("\\s+");	
				System.out.println("���� ������ "+list.length);
			}
		}
		//���� ȸ����Ű��
		else if(problem.equals("6")) {
			System.out.println("���ڿ��� �Է��ϼ���. ��ĭ�� �־ �ǰ� ���� �ѱ� ��� �˴ϴ�.");
			String text = scan.nextLine();
			String list[] = text.split("\\s+");
			if(list.length == 0) {
				System.out.println("�ƹ��͵� �Է����� �ʾҽ��ϴ�.");
			}
			else {
				String subText = text;
				for(int i =0;i<text.length();i++) {
					subText = subText.substring(1)+subText.charAt(0);
					System.out.println(subText);
				}
			}
		}
		//���� ������ ����
		else if(problem.equals("7")) {
			while(true) {
				System.out.println("user [����(1), ����(2), ��(3), ������(4)] >>  ");
				String a = scan.nextLine();
				if(a.equals("4")) {
					break;
				}
				String b = Integer.valueOf((int) Math.random() * 3 + 1).toString();
				System.out.println("��ǻ��   >> "+b);
				if(a.equals("1")) {
					if(b.equals("1")) {
						System.out.println("�����ϴ�.");
					}
					else if(b.equals("2")) {
						System.out.println("�����ϴ�.");
					}
					else if(b.equals("3")) {
						System.out.println("�̰���ϴ�.");
					}
				}
				else if(a.equals("2")) {
					if(b.equals("1")) {
						System.out.println("�̰���ϴ�.");
					}
					else if(b.equals("2")) {
						System.out.println("�����ϴ�.");
					}
					else if(b.equals("3")) {
						System.out.println("�����ϴ�.");
					}
				}
				else if(a.equals("3")) {
					if(b.equals("1")) {
						System.out.println("�����ϴ�.");
					}
					else if(b.equals("2")) {
						System.out.println("�̰���ϴ�.");
					}
					else if(b.equals("3")) {
						System.out.println("�����ϴ�.");
					}
				}
			}
		}
		//�׺� ����
		else if(problem.equals("8")) {
			System.out.print("1��° ���� �̸� >> ");
			Person person1 = new Person(scan.nextLine());
			System.out.print("2��° ���� �̸� >> ");
			Person person2 = new Person(scan.nextLine());
			int a,b,c;
			while(true) {
				System.out.print("["+person1.getName()+"]"+" : <Enter> ");
				scan.nextLine();
				a = (int)(Math.random()*3) + 1;
				b =(int)(Math.random()*3) + 1;
				c = (int)(Math.random()*3) + 1;
				if(a == b && a == c && b == c) {
					System.out.println(a+"   "+b+"   "+c+"   "+person1.getName()+"���� �̰���ϴ�!.");
					break;
				}
				else {
					System.out.println(a+"   "+b+"   "+c+"   "+"�ƽ�����!");
				}
				
				System.out.print("["+person2.getName()+"]"+" : <Enter> ");
				scan.nextLine();
				a = (int)(Math.random()*3) + 1;
				b = (int)(Math.random()*3) + 1;
				c = (int)(Math.random()*3) + 1;
				if(a == b && a == c && b == c) {
					System.out.println(a+"   "+b+"   "+c+"   "+person2.getName()+"���� �̰���ϴ�!.");
					break;
				}
				else {
					System.out.println(a+"   "+b+"   "+c+"   "+"�ƽ�����!");
				}
				
			}
		}
		//���ڿ� �����ϱ�
		else if(problem.equals("9")) {
			System.out.print(">>  ");
			StringBuffer text = new StringBuffer(scan.nextLine());
			while(true) {
				System.out.print("��� : ");
				String list[] = scan.nextLine().split("!");
				if(list[0].equals("�׸�")) {
					break;
				}
				String temp = "";
				int index = -1;
				for(int i=0;i<text.length();i++) {
					if(i == text.length()-1 && text.charAt(i) != ' ') {
						temp += text.charAt(i);
						if(temp.equals(list[0])) {
							index = i - temp.length() + 1;
							text.replace(index, i+1, list[1]);
							System.out.println(text);
							break;
						}
						else {
							break;
						}
					}
					else if(text.charAt(i) != ' ') {
						temp += text.charAt(i);
					}
					else {
						if(temp.equals(list[0])) {
							index = i - temp.length();
							text.replace(index, i, list[1]);
							System.out.println(text);
							break;
						}
						else {
							temp = "";
						}
					}
				}
				if(index == -1) {
					System.out.println("ã�� �� �����ϴ�!");
				}
			}
		}
		
		//�׺� ����
		else if(problem.equals("10")) {
			System.out.print("�׺� ���ӿ� ������ ���� ���� >> ");
			int number = scan.nextInt();
			int a,b,c;
			scan.nextLine();
			Person[] list = new Person[number];
			for(int i=0;i<number;i++) {
				System.out.print((i+1)+"��? ���� �̸� >>");
				list[i] = new Person(scan.nextLine());
			}
			while(true) {
				boolean end = false;
				for(int i=0;i<number;i++) {
					System.out.print(list[i].getName()+" : <Enter>");
					scan.nextLine();
					a = (int)(Math.random()*3) + 1;
					b = (int)(Math.random()*3) + 1;
					c = (int)(Math.random()*3) + 1;
					if(a == b && a == c && b == c) {
						System.out.println(a+"   "+b+"   "+c+"   "+list[i].getName()+"���� �̰���ϴ�!.");
						end = true;
						break;
					}
					else {
						System.out.println(a+"   "+b+"   "+c+"   "+"�ƽ�����!");
					}
				}
				if(end == true) {
					break;
				}
			}
		}
		scan.close();
		 
	}

}
