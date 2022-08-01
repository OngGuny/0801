import java.util.Scanner;

public class ArrayDemo8 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.print("제품 몇 개? : ");
	int count = sc.nextInt(); // 정수를 읽어들이는 기능의 메소드 
	sc.nextLine(); // 숫자다음 글자.  버퍼 비우기 
	Product [] array = new Product[count];
	
	for(Product p: array) { //p는 각 제품의 주소 
		p= new Product();
		System.out.print("Name : "); p.name=sc.nextLine();
		System.out.print("Price : ");		p.price=sc.nextInt();
		sc.nextLine();//숫자다음에 글자 나올때 버퍼 비우기 필수 
		System.out.print("Color : ");p.color=sc.nextLine();
		p.display();
	}
	
}
}
