
public class Student {
	String name,std_No; // 멤버나 클래스변수. 클래스변수이려면 static 붙어야함. 즉 멤버, 인스턴스 변수다. 
	int kor,eng,mat,tot,age;// 멤버 변수는 주소가 있어야한다.  ~~~.name, ~~.std_no 등 
	double avg;
	char grade;
	
	void calcTot(){ // 계산 후 아무것도 안주는 것. 총ㅓㅈㅁ 계산하는 코드 
	tot = kor+eng+mat ; //member method, instance method 
	} // 끝나면 다시 자기를 호출하는 곳으로 간다. 근데 void니까 빈손으로 감 
	
	void	calcAvg(){
	avg = tot/3.;
	}
	void CalcGrade(){ // 학점 정할때 ~ 이상으로 커트 해야함 ~이하로 하면 1번쨰에서 멈춰버림 
		grade=(avg<=100 && avg>=90)?'A':
			(avg<90 && avg>=80)?'B':
				(avg<80 && avg>=70)?'C':
					(avg<70 && avg>=60)?'D':'F';}
	
	void display() {
		System.out.printf("%s(%s)\t%d\t%d\t%d\t%d\t%.2f\t%s\n"
				,name,std_No,kor,eng,mat,tot,avg,grade); // 문자타입 잘못쓰면 틀린다. %d는정수 %f가 실수 
	}	
	
	
	
	
	
}//메소드는 3개가 필수 이름 동사 리턴 
// 메소드의 이름 calcTot 등,   동사  {} 안에 행동들 ,  리턴 return 을 써주던가.
// 메소드 이름 앞에 void로 행동다하고 원래 불렀던 곳으로 돌아갈때 아무것도 안들고간다고 지정해줄수있다. 

