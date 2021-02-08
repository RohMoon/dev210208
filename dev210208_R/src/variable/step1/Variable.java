package variable.step1;

public class Variable {
	//선언부
	
	//메소드 선언  (메소드 안에 메소드를 호출할 수는 없다.)
	void methodA(int x) {
	
	}
	
	double methodB(int x) {//x 지역변수이기 때문에 밖에서는 사용 불가 
		System.out.println("x는"+x);//1
		//return 3.14;
		return 3.14;
	}
	
	float methodC(int x) {
		return 0;
	}
	//메인메소드 - exe 파일로 만들 수 있어요.
	/***********************
	 *문제 해결 능력 키움
	 * @return void 이다. - 비어 있다. - 돌려 받을 수 있는 값이 없다. - 이것 때문에 에러가 발생할 수도 있다.
	 * @param args
	 ****************************/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//system : 너의 컴터 out 속성 : 출력장치 (하드웨어- 모니터, 프린터...), print():이건 illegal,print(int,i), print(double pi), print("안녕")
		//System.out.println(5); // 줄바꿈이 안되는 메소드. 메소드 호출할 수 있니? 너는?? 호출할줄 안다=주소번지. methodA();
		//메소드 선언할때에는 좌중괄호, 우중괄호를 사용하고.
		// 메소드 호출할때는 ; 으로 끝난다.
		// API, XXX.jar, 이 안(클래스[소스가 만들어졌으니 구체적이다] 안에, 객체[결정되지 않은것, 추상적인것sonata.java, class sonata{}]안에)의 것을 꺼내쓴다.
		// 클래스 또는 객체< 최소 단위 <안에 넣는다.
		//Print 메소드는 여러개이다. 같은 이름의 메소드를 여러개 만들 수도 있다.
		//SELECT(찾아줘라) 이름 FROM 회원 집합(여기서)
		// WHERE 아이디 ='test' = 조건문
		//  AND 비번 = '123'
		//System.out.print(); // 줄바꿈이 안되는 메소드- 반환값이 없으니까 에러인거야? 출력 결과물이 없잖아.
		Variable v = new Variable();
		System.out.println(v.methodB(1)); //3.14 
		//System.out.println(v.methodC(1));
		//System.out.print(v.methodA(1));
		//System.out.print(1+"  "+1); // 줄바꿈이 안되는 메소드
		//System.out.print(10+10); // 줄바꿈이 안되는 메소드
		//System.out.print(10+"10"); // 줄바꿈이 안되는 메소드
		//System.out.print(10+""+10); // 줄바꿈이 안되는 메소드
		//System.out.print("  "); // 줄바꿈이 안되는 메소드
		//System.out.println();//줄바꿈이 추가된 메소드
	}

}
