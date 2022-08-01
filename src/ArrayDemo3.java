
public class ArrayDemo3 {
	public static void main(String[] args) {
		// 값 변수 배열의 초기값 4가지밖에없다.  
		//정수형  0으로 초기화
//		int [] array = new int[4]; // 방이 4개 필요해 4개주세요 4비트 4개 16비트 초기값은 0000 들어가있음 
//		for(int i=0; i<array.length ; i++) {
//			System.out.print("array["+i+"]="+array[i]+"\t"); //heap에 들어갈 값을 초기화. 
//		}
//			
//		//실수형  0.0으로 초기화
		//		double [] array = new double[4]; // 방이 4개 필요해 4개주세요 4비트 4개 16비트 초기값은 0000 들어가있음 
//		for(int i=0; i<array.length ; i++) {
//			System.out.print("array["+i+"]="+array[i]+"\t"); //heap에 들어갈 값을 초기화. 
		//double, 실수형 이니까 0.0으로 초기화 된다.  float로 하면 f; 
	// 문자형 -> \0 으로 초기화
//		char[] array = new char[4]; 
//		for(int i=0; i<array.length ; i++) {
//			System.out.print("array["+i+"]="+array[i]+"\t");
//	
//	}// null 값을 표현하는 ascii \0   ->> 이게 char배열의 초기값. \0  
		// unicode 는 \u0000
	
	// 불린 형   -> false로 초기화 
//		boolean [] array = new boolean[4];
//		for(int i =0; i<array.length;i++) {
//			System.out.print("array["+i+"]="+array[i]+"\t");
//		}//처음 만들면 전기가 안들어와서 false 
		// 학생을 메모리 heap 에 초기화 했을 때 초기화는 이런 형태다. 값변수들. 
	
		
		// 참조형 :
		String [] array = new String[4];
		for(int i= 0; i<array.length;i++) {
			System.out.print("array["+i+"]="+array[i]+"\t");
		}
		
} // 초기화값은 이 5개 값으로만 된다. 
}
