package sec06.exam01;

public class FromIntToFloat {
	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		// float num3 = num2; 정밀도 손실이 생긴다, 23비트로 표현 가능한 값이어야 한다.
		double num3= num2;
		num2 = (int) num3;
		
		int result = num1 - num2;
		System.out.println(result);
	}
}
