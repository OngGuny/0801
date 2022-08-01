import java.util.Scanner;

public class Practice3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("얼마? : ");
	int d= sc.nextInt();
	int [] array= {50000,10000,5000,1000,500,100,50,10,5,1};
	System.out.println("방 갯수 : "+array.length);
		for(int m=0;m<10;m++) {
			int o=d/array[m]; 
			int p=d%array[m];
			System.out.printf(array[m]+"원 권 "+"%d장 과 나머지 "+"%d \t\n",o,p);
			//d-=o*array[m]; // 이거말고 나머지인 p를 d로 재정의해주면 된다. 그러면 나머지가 다시 산식에 들어간다. d=p; 넣어주면된다.. 
			d=p; //증감 대신에 변수를 재정의. 목적은 입력받은  나머지를 다시 루프에 넣는 것. 
		}
	
//	int f = d/50000;
//	int g = (d%50000)/10000;
//	int h = 	(g%10000)/5000;
//	int j = h%5000/1000;
//	int k = j%1000/500;
//	int l = k%500/100;
//	
//	System.out.printf("입력 : %d",d);
//	
//	
//	
}
}
