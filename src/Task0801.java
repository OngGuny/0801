/*1. 전달받은 int형 배열에 대해 출력, 합계, 평균, 최대값, 최소값을 구하는 프로그램 작성
 * 배열 {10,50,44,56,29,30,9,48,84,92}
 * <출력 >
 * 배열원본{10,50,44,56,29,30,9,48,84,92}
 * 내림차순 
 * 오름차순 
 * 합계   452
 * 평균  45.2
 * 최대값  92
 * 최소값   9
 * 
 * 
 */
public class Task0801 {
public static void main(String[] args) {
	int [] array = {10,50,44,56,29,30,9,48,84,92};
	System.out.println("<출력>");
	System.out.print("배열 원본 = ");
	for (int s : array) {
		System.out.printf("%d\t",s);
	}// 그냥 하나씩 넣어서 출력해. 
	
	
	for ( int i = 0; i<array.length-1; i++) {
		for(int j=0 ; j<array.length-1; j++) {
			if (array[j]>array[j+1]) {// 앞에께 크면, 바꾼다. j는 빈칸 으로 간다. 빈 j에는 j+1이 들어간다. j+1에는 빈칸(j로 채워진)이 들어간다. 그래서 자리가 j+1이 앞, j가 뒤로 바뀐다. 
				int sort=array[j];
				array[j]=array[j+1];
				array[j+1]=sort;
			}
		}
	}
	//----------------------------------------------------
	System.out.println();
	System.out.print("오름차순 = ");
	for(int s : array) {
		System.out.printf("%d\t",s);
	}
	//System.out.printf("최소값 : %d\n",array[0]); 최대값 최소값을 논리적으로 구해..
	for ( int i = 0; i<array.length-1; i++) {
		for(int j=0 ; j<array.length-1; j++) {
			if (array[j]<array[j+1]) { // 내림차순으로 바꿀때. 
				int sort=array[j];
				array[j]=array[j+1];
				array[j+1]=sort;
			}
		}
	}
	//-------------------------------------------
	System.out.println();
	System.out.print("내림차순 = ");
	for(int s : array) {
		System.out.printf("%d\t",s);
	}
	
	//----------------------------------------
	
	System.out.println();
	System.out.print("합계 : ");
	double sum=0;
	for(int i = 0;i<array.length;i++) {
	sum+=array[i];
	}
System.out.println(sum);

//-------------------------------------------------


System.out.printf("평균 : %.1f\n",sum/array.length);
System.out.println();
int max = array[0], min=array[0];
for(int i = 0 ; i<array.length;i++) {
	if(min>array[i]) min=array[i];
if(max<array[i]) max=array[i];

}
System.out.printf("최소값 : %d\n",min);
System.out.printf("최대값 : %d",max);
}// 목적에 맞는 변수를 생각하기. 최대값, 개수, 최소값, 평균, 합계 등 

	

	

}

