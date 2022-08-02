// sorting 해야함 4개는 알고 있어야함 .bubble  /  /  / quick
public class ArrayDemo9 {
	public static void main(String[] args) {
//		double [] original = {78.2,56.9,43.5};
//		double [] target = {172.8,185.4,162.9,152.1};
//		
//		target[0]=original[1]; // 값 복사. 몇번쨰 방인지까지 나옴
//		target=original; // 주소 복사. 오리지날의 주소를 타겟으로 덮어버림  왼쪽 먼저 . 배열복사는 주소 복사 
//	
	
		//5와 9가 들어가있는 위치를 바꿔보자 
//		int original = 5; 
//	int target = 9 ;
//	System.out.println("Before Swapping");
//	System.out.printf("original = %d, target =%d\n",original,target );
//	// 새로운 변수를 만든다 . 새 접시를 만듦 
//	int trap = original; original = target ; target=trap; 
//
//	System.out.println("After Swapping");
//	System.out.printf("original = %d, target =%d\n",original,target );
	
	//같은 타입의 변수가 하나 있으면 된다. 정수-정수에는 정수가. 학생-학생에는 새 학생이. char-char에는 char 이 

	//이젠 배열을 스왑해보자 
//		Product pencil = new Product();
//		pencil.name="연필";pencil.price=200;pencil.color="black";
//		Product mouse= new Product();
//		mouse.name="마우스"; mouse.price=50000; mouse.color="black";
//	
//		System.out.println("Before Swapping");
//		pencil.display(); mouse.display();
//		
//		Product temp = pencil;
//		pencil =mouse ;
//		mouse = temp; 
//	
//		System.out.println("After Swapping");
//	pencil.display(); mouse.display();

	// 이런걸 왜했냐 sorting 배우려고  
	//bubble sorting : 가장쉬운거 거품이 나와서 바깥으로 가는거 처럼 단, 개수가 많을 수록 불리함 
	//최대 갯수 -1번 소팅해야함 
	// 옆으로 비교하러 가는걸 j 
	// 세로의 범위는 개수-1, 가로도 똑같다. 
	
	//하드코딩도 해ㅑ보고 api도 해보기 
	int [] original = {4,6,2,3,5,1,6,8,9,3,2};
System.out.println("Before Sorting");
	for (int su : original) {
		System.out.printf("%d\t",su);
	}
	for(int i = 0; i < original.length-1 ; i++) {
		for(int j= 0; j<original.length-1;j++) {
			if(original[j]>original[j+1]) {
				int temp = original[j];
				original[j]=original[j+1];
				original[j+1]=temp;
						
			}
	}
	}
	System.out.println();
	System.out.println("After Sorting");
	for (int su : original) {
		System.out.printf("%d\t",su);
	}
	
	
	
	} 
	
	

}
