package chapter1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("���� ��ȣ�� �Է��Ͻÿ�");
		int problem = scan.nextInt();
		if (problem == 1) {
			float rate = 1100;
			System.out.printf("��ȭ�� �Է��ϼ���(���� ��)>>");
			int money_won = scan.nextInt();
			float money_dollor = money_won / rate;
			System.out.println(money_won + "���� $" + money_dollor + "�Դϴ�");
		} else if (problem == 2) {
			System.out.printf("2�ڸ��� ���� �Է� >>");
			int number = scan.nextInt();
			if (number / 10 == number % 10) {
				System.out.println("yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
			} else {
				System.out.println("no! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
			}
		} else if (problem == 3) {
			System.out.printf("�ݾ��� �Է��ϼ��� >>");
			int money = scan.nextInt();
			int money_left = 0;
			int money_50000, money_10000, money_1000, money_100, money_10, money_50, money_1;
			if (money / 50000 > 0) {
				money_50000 = money / 50000;
				money_left = money - 50000 * (money_50000);
				money_10000 = money_left / 10000;
				money_left = money_left - 10000 * (money_10000);
				money_1000 = money_left / 1000;
				money_left = money_left - 1000 * (money_1000);
				money_100 = money_left / 100;
				money_left = money_left - 100 * (money_100);
				money_50 = money_left / 50;
				money_left = money_left - 50 * (money_50);
				money_10 = money_left / 10;
				money_left = money_left - 10 * (money_10);
				money_1 = money_left;
				System.out.printf("�������� %d��\n ������ %d��\n õ���� %d��\n ��� %d��\n ���ʿ� %d��\n �ʿ� %d��\n �Ͽ� %d��\n", money_50000,
						money_10000, money_1000, money_100, money_50, money_10, money_1);
			} else if (money / 10000 > 0) {
				money_10000 = money / 10000;
				money_left = money - 10000 * (money_10000);
				money_1000 = money_left / 1000;
				money_left = money_left - 1000 * (money_1000);
				money_100 = money_left / 100;
				money_left = money_left - 100 * (money_100);
				money_50 = money_left / 50;
				money_left = money_left - 50 * (money_50);
				money_10 = money_left / 10;
				money_left = money_left - 10 * (money_10);
				money_1 = money_left;
				System.out.printf("������ %d��\n õ���� %d��\n ��� %d��\n ���ʿ� %d��\n �ʿ� %d��\n �Ͽ� %d��\n", money_10000, money_1000,
						money_100, money_50, money_10, money_1);
			} else if (money / 1000 > 0) {
				money_1000 = money / 1000;
				money_left = money - 1000 * (money_1000);
				money_100 = money_left / 100;
				money_left = money_left - 100 * (money_100);
				money_50 = money_left / 50;
				money_left = money_left - 50 * (money_50);
				money_10 = money_left / 10;
				money_left = money_left - 10 * (money_10);
				money_1 = money_left;
				System.out.printf("õ���� %d��\n ��� %d��\n ���ʿ� %d��\n �ʿ� %d��\n �Ͽ� %d��\n", money_1000, money_100, money_50,
						money_10, money_1);
			} else if (money / 100 > 0) {
				money_100 = money / 100;
				money_left = money - 100 * (money_100);
				money_50 = money_left / 50;
				money_left = money_left - 50 * (money_50);
				money_10 = money_left / 10;
				money_left = money_left - 10 * (money_10);
				money_1 = money_left;
				System.out.printf("��� %d��\n ���ʿ� %d��\n �ʿ� %d��\n �Ͽ� %d��\n", money_100, money_10, money_50, money_1);

			} else if (money / 50 > 0) {
				money_50 = money / 50;
				money_left = money - 50 * (money_50);
				money_10 = money_left / 10;
				money_left = money_left - 10 * (money_10);
				money_1 = money_left;
				System.out.printf("���ʿ� %d��\n �ʿ� %d��\n �Ͽ� %d��\n", money_50, money_10, money_1);

			} else if (money / 10 > 0) {
				money_10 = money / 10;
				money_left = money - 10 * (money_10);
				money_1 = money_left;
				System.out.printf("�ʿ� %d��\n �Ͽ� %d��\n", money_10, money_1);
			} else {
				System.out.printf("�Ͽ� %d��\n", money);
			}
		} else if (problem == 4) {
			System.out.printf("���� 3�� �Է� >>");
			int number1 = scan.nextInt();
			int number2 = scan.nextInt();
			int number3 = scan.nextInt();
			if (number1 > number2) {
				if (number1 < number3) {
					System.out.println(number1);
				} else if (number1 == number3) {
					System.out.println(number1);
				} else if (number1 > number3) {
					if (number3 > number2) {
						System.out.println(number3);
					} else if (number3 == number2) {
						System.out.println(number3);
					} else if (number3 < number2) {
						System.out.println(number2);
					}
				}
			} else if (number1 == number2) {
				System.out.println(number1);
			} else if (number1 < number2) {
				if (number2 < number3) {
					System.out.println(number2);
				} else if (number2 == number3) {
					System.out.println(number2);
				} else if (number2 > number3) {
					if (number1 < number3) {
						System.out.println(number3);
					} else if (number3 == number1) {
						System.out.println(number1);
					} else if (number1 > number3) {
						System.out.println(number1);
					}
				}
			}
		}

		else if (problem == 5) {
			System.out.printf("���� 3�� �Է� >>");
			int number1 = scan.nextInt();
			int number2 = scan.nextInt();
			int number3 = scan.nextInt();
			int number_max = number1;
			if (number1 + number2 > number3) {
				if (number1 + number3 > number2) {
					if (number2 + number3 > number1) {
						System.out.println("�ﰢ���� �˴ϴ�.");
					} else {
						System.out.println("�ﰢ���� �ƴմϴ�");
					}
				} else {
					System.out.println("�ﰢ���� �ƴմϴ�");
				}
			} else {
				System.out.println("�ﰢ���� �ƴմϴ�");
			}

		}

		else if (problem == 6) {
			System.out.printf("1-99 ������ ������ �Է��Ͻÿ� >>");
			int number = scan.nextInt();
			int first = number / 10;
			int second = number % 10;
			if ((first == 3) || (first == 6) || (first == 9)) {
				if ((second == 3) || (second == 6) || (second == 9)) {
					System.out.println("�ڼ�¦¦");
				} else {
					System.out.println("�ڼ�¦");
				}
			} else if ((second == 3) || (second == 6) || (second == 9)) {
				System.out.println("�ڼ�¦");
			} else {
				System.out.println("�ڼ�");
			}
		}

		else if (problem == 7) {
			System.out.printf("�� (x,y)�� ��ǥ�� �Է��Ͻÿ� >>");
			int number1 = scan.nextInt();
			int number2 = scan.nextInt();
			if ((number1 >= 100) && (number1 <= 200) && (number2 >= 100) && (number2 <= 200)) {
				System.out.printf("(%d, %d)�簢�� �ȿ� �ֽ��ϴ�", number1, number2);
			} else {
				System.out.printf("(%d, %d)�簢�� �ȿ� �����ϴ�.", number1, number2);
			}
		}

		else if (problem == 8) {
			System.out.printf("ù��° �� (x,y)�� ��ǥ�� �Է��Ͻÿ� >>");
			int coordinate1_x = scan.nextInt();
			int coordinate1_y = scan.nextInt();
			System.out.printf("�ι��� �� (x,y)�� ��ǥ�� �Է��Ͻÿ� >>");
			int coordinate2_x = scan.nextInt();
			int coordinate2_y = scan.nextInt();
			if (((coordinate1_x < 100 && coordinate2_x < 100) || (coordinate1_x > 200 && coordinate2_x > 200))
					|| ((coordinate1_y < 100 && coordinate2_y < 100) || (coordinate1_y > 200 && coordinate2_y > 200))) {
				System.out.println("�� �簢���� �浹���� �ʽ��ϴ�.");
			} else {
				System.out.println("�� �簢���� �浹�մϴ�.");
			}
		}

		else if (problem == 9) {
			System.out.printf("���� �߽ɰ� ������ �Է� >>");
			double circle_x = scan.nextDouble();
			double circle_y = scan.nextDouble();
			double radius = scan.nextDouble();
			System.out.printf("�� �Է� >>");
			double x = scan.nextDouble();
			double y = scan.nextDouble();
			double distance = Math.sqrt((x - circle_x) * (x - circle_x) + (y - circle_y) * (y - circle_y));
			if (distance <= radius) {
				System.out.printf("�� (%d,%d)�� �� �ȿ� �ִ�", x, y);
			} else {
				System.out.printf("�� (%d,%d)�� �� �ȿ� ����", x, y);
			}
		} else if (problem == 10) {
			System.out.printf("ù���� ���� �߽ɰ� ������ �Է� >>");
			double x1 = scan.nextDouble();
			double y1 = scan.nextDouble();
			double radius1 = scan.nextDouble();
			System.out.printf("�ι��� ���� �߽ɰ� ������ �Է� >>");
			double x2 = scan.nextDouble();
			double y2 = scan.nextDouble();
			double radius2 = scan.nextDouble();
			double distance = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
			if (distance > radius1 + radius2) {
				System.out.println("�� ���� ��ġ�� �ʴ´�.");
			} else {
				System.out.println("�� ���� ��ģ��.");
			}
		}

		else if (problem == 11) {
			System.out.printf("���� �Է��ϼ���(1-12) >>");
			int month = scan.nextInt();
			switch (month) {
			case 3:
			case 4:
			case 5:
				System.out.println("��");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("����");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("����");
				break;
			default:
				System.out.println("�ܿ�");
				break;
			}
		}

		else if (problem == 12) {
			System.out.printf("���� >>");
			double number1 = scan.nextDouble();
			String operator = scan.next();
			double number2 = scan.nextDouble();
			
			DecimalFormat df = new DecimalFormat("#.#####");
			if (operator.equals("+")) {
				System.out.printf("%s%s%s�� ������� %s",df.format(number1),operator,df.format(number2),df.format(number1+number2));
			} else if (operator.equals("-")) {
				System.out.printf("%s%s%s�� ������� %s",df.format(number1),operator,df.format(number2),df.format(number1-number2));

			} else if (operator.equals("*")) {
				System.out.printf("%s%s%s�� ������� %s",df.format(number1),operator,df.format(number2),df.format(number1*number2));

			} else if (operator.equals("/")) {
				if(Float.compare((float) number2, 0)==0) {
					System.out.println("0���� ������ �����ϴ�.");
				}
				else {
					System.out.printf("%s%s%s�� ������� %s",df.format(number1),operator,df.format(number2),df.format(number1/number2));
				}
			}
		}
		/*
		 * DecimalFormat Ŭ����
		 * #.##
		 * ##.##
		 * ###.##
		 * ......
		 * # ## ###�� �����κ��� Ÿ������ .##�� �Ҽ��κ��� ��Ÿ����.
		 * ���⼭ �����κ��� #�� ��̵� ������ ��� ��Ÿ���� ���ִµ� �Ҽ��κ��� #�� ������ŭ ǥ���ϰ� �ȴ�.
		 * ex) 1234.5678 �̸� #.####  ##.####  ###.#### ####.####�� 1234.5678�� ��Ÿ���� �ȴ�.
		 * #.#�� 1234.5  #.##�� 1234.56  #.###�� 1234.567�� ��Ÿ���� �ȴ�.
		 * 0.00
		 * 00.00
		 * 000.00
		 * .....
		 * 0 00 000�� ���� �κ� .00�� �Ҽ� �κ��� ��Ÿ����.
		 * ���� �ٸ��� 0�� ���ڸ��� 0���� ä��� �ȴ�.
		 * ex) 1234.5678�̸� 00000.0000�� 01234.5678 0000.00000�� 1234.56780���� ��Ÿ���� �ȴ�.
		 */

		scan.close();
	}
}