
public class Product {
	int price;
	String name, color;
	
	//남의 손 빌리지 않고 출력하는 기능을 만들어줌  변수들을 출력하는 기능의 메소드 
	void display() {
		System.out.printf("이름 = %s, 가격 = %d, 색상 = %s\n",name,price,color);
		
	}// 멤버변수와 멤버 메소드는 반드시 주소로 접근한다 
	// 주소는 new할때 생긴다. 
}
