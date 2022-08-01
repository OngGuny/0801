
public class ArrayDemo {
public static void main(String[] args) {
//	int []array;	// 선언   어딘가에 배열, 집을 만들꺼야  
//	array = new int[4]; // 배열의 생성  heap에 집만들고 주소를 넘겨줌.  시작 주소로부터 16비트까지  ->더 늘어나지 않는다. 
//	array[0]=6;
//	array[1]=9;
//	array[2]=12;
//	array[3]=15; // 할당 
//	
//	for (int i=0;i<4;i++) {
//		System.out.print("array["+i+"]="+array[i]+"\t");
//	}//하나의 이름으로 4개의 공간을 핸들링하는 것  
	
	//System.out.println(array[0]); // heap에 집을 지을 떄는 데이터 타입에 따라 자동으로 초기화가 되서 나옴 정수타입은 0으로 초기화되어있음 0으로 4칸 채워져있는거ㅣ 
	//근데 방 여러개 만드는건 똑같이 힘듦 
	
	//2번째 방법은 생성과 선언을 합침 
//	double [] weights; // 여러 명의 몸무게를 받기 위한 배열을 '선언'한것.
//	weights = new double[] {67.3, 78.9, 52.3}; // 중요한건 방 개수를 안쓰는것. 프리하게 둠 
//	for(int i=0;i<3;i++) {
//		System.out.printf("weight[%d]=%.1f\t",i,weights[i]);
//	} // 하나의 이름으로 3개의 변수를 핸들링하자
//	
     //한번에 하자 위의 3단계를 
	char [] grades = {'A','C','C','B','B'}; // 복수형, 괄호넣어주기로 배열 만들어줌  char니까 2비트  
	int i = 0; 
	while(i<5) {
		System.out.print("grades["+i+"]="+grades[i]+"\t");
		i++; // while 문은 증감 까먹지말자. 일단 틀을 만들고 시작해  변수선언 조건 증감 
	}

}
}
