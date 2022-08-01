import java.util.Scanner;

// 학생이 여러명일때 demo6을 적용해보자 
public class ArrayDemo7 {
	public static void main(String[] args) {
		System.out.print("학생은 몇 명? : ");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();// 몇 명
		sc.nextLine();
		Student[] array = new Student[count];
		for(Student std : array ) { //처음부터 끝까지 할꺼니까 강화 for 
			std = new Student(); // 방에 들어갈 학생을 만든다. 
			System.out.print("Name : "); std.name=sc.nextLine();
			System.out.print("StudentNO : "); std.std_No=sc.nextLine();
			System.out.print("Korean : "); std.kor=sc.nextInt();
			System.out.print("English : "); std.eng=sc.nextInt();
			System.out.print("Math : "); std.mat=sc.nextInt(); // 몇번쨰 안따진다  다넣을꺼니까. 
			sc.nextLine();

			std.calcTot(); std.calcAvg();std.CalcGrade(); 
			std.display();
		}
}
}