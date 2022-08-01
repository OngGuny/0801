
public class Student {
	String name,std_No; // 멤버나 클래스변수. 클래스변수이려면 static 붙어야함. 즉 멤버, 인스턴스 변수다. 
	int kor,eng,mat,tot;
	double avg;
	char grade;
	
	void calcTot(){ // 계산 후 아무것도 안주는 것. 총ㅓㅈㅁ 계산하는 코드 
	tot = kor+eng+mat ; //member method, instance method 
	} // 끝나면 다시 자기를 호출하는 곳으로 간다. 근데 void니까 빈손으로 감 
	
	void	calcAvg(){
	avg = tot/3.;
	}
	void CalcGrade(){
		grade=(avg<=100 && avg>=90)?'A':
			(avg>=80)?'B':
				(avg)>=70?'C' :
					(avg)>=60?'D' :'F';}
	
	void display() {
		System.out.printf("%s(%s)\t%d\t%d\t%d\t%d\t%.2f\t%s\n"
				,name,std_No,kor,eng,mat,tot,avg,grade); // 문자타입 잘못쓰면 틀린다. %d는정수 %f가 실수 
	}	
	
	
	
	
	
}//메소드는 3개가 필수 이름 동사 리턴  
