// 전까진 값을 배열함 이번엔 주소를 배열해봄 
public class ArrayDemo1 {
	public static void main(String[] args) {
		Student[] array; // 선언 선언
		array = new Student[3];// 배열 생성 학생을 만든게 아니라 학생이 들어갈 공간을 3개 만든것.
		array[0] = new Student(); // 김해에 사는 학생의 주소를 ㅇarray에 저장 주소만 있다. 값 x
		array[0].name = "한지민";
		array[0].age = 26;

		array[1] = new Student(); // 울산에 사는 학생 주소
		array[1].name = "김철수";// 방 1
		array[1].age = 36;//방2 

		array[2] = new Student(); // 해운대에 사는 학생 주소 
		array[2].name = "이영희";
		array[2].age = 46;
		// 주소를 지정해주니까 그 주소에 값을 가져오는 것.

		for (int i = 0; i < 3; i++) {
			System.out.printf("이름 = %s, 나이 = %d\n", array[i].name,array[i].age);

		}
		//평균나이 구해보기 
						// array-0이라는 주소 가서 age라는 방에 나이가 있따.
		//int sum = array[0].age+array[1].age+array[2].age; //방많으면 못적는다 루프 돌리자 
		int sum = 0;
		for(int i=0 ; i<3; ++i) {
		sum+=array[i].age;
		}
		System.out.println("평균나이는 "+sum/3);
	}
}
