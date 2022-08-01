import java.util.Scanner;

public class ArrayDemo6 {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//숫자 다음에 엔터 들어오는건 날려줘야함 
		Student jimin = new Student();
		System.out.print("Name : "); jimin.name=sc.nextLine();// 글자를 받을꺼다. sc.nextl 그건 이름이다. name   지민 의 'name.'
		System.out.print("StudentNO : "); jimin.std_No=sc.nextLine();
		System.out.print("Korean : "); jimin.kor=sc.nextInt();
		System.out.print("English : "); jimin.eng=sc.nextInt();
		System.out.print("Math : "); jimin.mat=sc.nextInt();
		
		jimin.calcTot();
		jimin.calcAvg();
		jimin.CalcGrade();
	
		jimin.display();
}
//		jimin.grade=(jimin.avg<=100 && jimin.avg>=90)?'A':
//							(jimin.avg<=90)?'B':
//								(jimin.avg)<=80?'C' :
//									(jimin.avg)<=70?'D' :'F';
		
		
//		System.out.printf("%s(%s)\t  %d\t  %d\t   %d\t  %d\t   %.2d\t%  c\n",
//				jimin.name,jimin.std_No,jimin.kor,jimin.eng,jimin.mat,jimin.tot,jimin.avg,jimin.grade);
									
}

