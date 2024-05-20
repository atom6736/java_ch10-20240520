package com.chihwancompany.exer;

public class ExceptionTest01 {
	public static void main(String[] args) {
		
//	try {
//		int a = 10;
//		int sum = a/0; //0 나누기 에러 발생!
//		System.out.println(sum);
//	} catch (ArithmeticException e) {
//		// TODO: handle exception
//		System.out.println("0나누기 에러 발생! 다시 확인하세요!");
//	}  catch(NullPointerException e) {
//		System.out.println("null값을 가리키고 있습니다.!! 다시 확인하세요!");
//		
//	}
	
		try {
			int a = 10;
			int sum = a/0; //0 나누기 에러 발생!
			System.out.println(sum);
		} catch (Exception e) { // e는 error의 의미.
			// TODO: handle exception
			System.out.println("0나누기 에러 발생! 다시 확인하세요!");
			e.printStackTrace();  // 이것을 삽입해주면 몇번째 줄에 무슨 에러가 발생했는지를 알려줌.
			// 그러므로 개발할 때 이 e.printStackTrace는 매우 자주 활용하게 됨.
			// 에러코드를 콘솔창에 출력해줌. 사실 나중에는 e.printStackTrace();만 쓰고 System.out.println은 사용하지도 않음.
		} finally {
			System.out.println("에러의 발생 여부와 상관 없이 실행됨.!");
		} // 자바의 예외처리. try - catch - finally  이상과 같이 하면 1차 예외처리는 끝임.(딱 10줄임)
		
	}
}
		
	


