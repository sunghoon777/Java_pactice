package chapter1;
import java.util.Scanner;

public class OpenChallenge {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���������� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���");
		System.out.printf("ö�� >> ");
		String user1 = scan.nextLine();
		System.out.printf("���� >> ");
		String user2 = scan.nextLine();
		if (user1.equals("����")) {
			if (user2.equals("����")) {
				System.out.println("�����ϴ�");
			}
			if (user2.equals("����")) {
				System.out.println("���� �̰���ϴ�");
			}
			if (user2.equals("��")) {
				System.out.println("ö���� �̰���ϴ�");
			}
		}
		if (user1.equals("����")) {
			if (user2.equals("����")) {
				System.out.println("ö���� �̰���ϴ�");
			}
			if (user2.equals("����")) {
				System.out.println("�����ϴ�");
			}
			if (user2.equals("��")) {
				System.out.println("���� �̰���ϴ�");
			}
		}
		if (user1.equals("��")) {
			if (user2.equals("����")) {
				System.out.println("���� �̰���ϴ�");
			}
			if (user2.equals("����")) {
				System.out.println("ö���� �̰���ϴ�");
			}
			if (user2.equals("��")) {
				System.out.println("�����ϴ�");
			}
		}
	
		scan.close();
	}
}