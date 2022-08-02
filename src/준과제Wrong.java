import java.util.Scanner;

/*2. 입력받은 수를 소인수분해해서 그 결과를 각 줄에 3개씩 출력하기
 * 3. 1부터 100까지 소수를 출력하기 
 * 
 */
public class 준과제Wrong {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.print("수를 입력하세요 : ");
	int su =sc.nextInt();
	int count = 0;
//	while (su>=i)
//	{
//		if(su%i==0) {
//			System.out.printf("%d\t",i);
//			su/=i;
//			count++;
//			if (count%3==0) System.out.println();
//	}else {
//		i++;
//	}
//	
//	
//}
//	
	System.out.print("1\t");
	count++;
	for(int i =2;i<su;i++) {
	if(su%i==0) {
		System.out.print(i+"\t");
		count++;
		if (count%3==0) System.out.println();
	}
	
	}
	System.out.println(su);
}
}
