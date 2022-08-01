import java.util.Scanner;

public class Practice {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("<입력>\n계산하실 초 : ");
	int s =sc.nextInt();
	System.out.println(s);
	
	System.out.println("<출력>");
	int h = s/3600;
	int m = (s%3600)/60;
	int ss = s-3600*h-m*60;
	
	System.out.print(s+" 초는 "+h+"시간 "+m+"분 "+ss+"초 입니다.\n");
	System.out.printf("%d초는 %d시간 %d분 %d초입니다.",s,h,m,ss);
	
	
	
	
	
}
}
