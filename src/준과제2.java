/*2. 입력받은 수를 소인수분해해서 그 결과를 각 줄에 3개씩 출력하기
 * 3. 1부터 100까지 소수를 출력하기 
 * 
 */
public class 준과제2 {
	public static void main(String[] args) {
		boolean flag = true;
		int i,j,count=0;
		for (i = 2; i < 100; i++) {
			for (j = 2; j < i; j++) { // 안쪾 for를 벗어나게 하기위해, 어떤 조건이 필요한가
				if (i % j == 0) {
					flag = false;break;
				} // j로 나눠진다? = 소수가 아니다. 안나눠져서(if거짓) 빠져나오거나 break맞고 빠져나오는데 break맞고 나오면 false 값
					// 가지고나옴
			}
			flag=true;
			if (flag&&i==j)
				System.out.printf("%d\t", i);
			count++;
			if(count%5==0) System.out.println();
		} // break맞고 나오면 flag 는 flase 값. false값 갖고있으면
	}
}
