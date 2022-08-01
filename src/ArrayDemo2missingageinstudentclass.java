import java.util.Scanner;

public class ArrayDemo2missingageinstudentclass {
	public static void main(String[] args) {
//		int []array = new int[4]; // 힙에 방 4개 주소를 스택에있는 array에 넣음 
//		Scanner sc = new Scanner(System.in);
//		
////		System.out.print("첫번째 숫자 : "); sc.nextInt(); 이걸 4번반복하느니 배열-반복을 쓰는 것 
//		for(int i=0; i<4;i++) { // 방 4개 
//			System.out.print(i+"번째 방의 값 : ");
//			//int temp = sc.nextInt(); // 값을 받은 것을 일단 temp에 넣자.   그리고 방에 넣기 
//			//직접 넣을 수도 있다;; 
//			array[i]=sc.nextInt();
//		}
//		//System.out.println(array); // 입력한 값이 들어있는게 아니라 값이 들어있는 주소가 저장되는 것. 
//		for(int i=0;i<4 ; i++) {
//			System.out.printf("array[%d]=%d\t",i,array[i]);
//		}
//		
		
		//이젠 입력받아보자 
		Student [] array = new Student[2]; // 어떤 학생이 2명이 있다. 방2개인 집의 주소를 array사 받은 것. / 주소초기화값은 null 이다 
		
		for(int i =0; i<2; i++) {
			System.out.printf("array[ "+i+"]"+array[i]+"\t\t"); // null 번지  학생 주소만 넣어야 한다. 학생이 한명도 없어서 칸이 비어있는 것. 
		}
		System.out.println();
		
		array[0]=new Student();
		array[1]=new Student(); //메모리 어딘가의 학생을 만들어서 그 주소를 array0번지 ,1번지에 넣었다. 
		
		for(int i =0; i<2; i++) {
			System.out.printf("array[ "+i+"]"+array[i]+"\t\t"); // null 번지  학생 주소만 넣어야 한다. 학생이 한명도 없어서 칸이 비어있는 것. 

	}
		System.out.println();
		Scanner sc = new Scanner(System.in);
		for(int i =0; i<2; i++) {
			System.out.print(i+"번째 학생의 이름 : "); array[i].name=sc.nextLine();//키보드로부터 1줄 입력받아서 이름에 넣고 
			System.out.print(i+"번째 학생의 나이 : "); array[i].age=sc.nextInt(); // 주소를 array로 바꿔준것 뿐 array의 각 방이 주소 
			sc.nextLine();
		}
	for(int j=0 ; j<2;j++) {
		System.out.print("array["+j+"]의 이름 : "+array[j].name+"\t");
		System.out.println("array["+j+"]의 나이 : "+array[j].age);
	
	} // 반복문을 통해서 한번에 받아들이고 반복ㅁ문으로 출력가능 , 변수를 많이 만들 필요가 없다. 
	}

}