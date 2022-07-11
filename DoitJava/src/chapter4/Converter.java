package chapter4;

import java.text.DecimalFormat;
import java.util.Scanner;

public abstract class Converter {
	
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;
	
	public void run() {
		Scanner scan = new Scanner(System.in);
		System.out.println(getSrcString()+"을 "+getDestString()+"로 바꿉니다.");
		System.out.print(getSrcString()+"을 입력하세요 >>");
		double val = scan.nextDouble();
		double res = convert(val);
		DecimalFormat f = new DecimalFormat("#.##");
		System.out.println("변환 결과 : "+f.format(res)+getDestString()+"입니다.");
		scan.close();
	}

}
