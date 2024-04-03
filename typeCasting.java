public class typeCasting {
  public static void main(String[] args) {
    /*
     * [자바 기본 데이터 타입에 대한 변환] (= 타입 변환 = 형 변환)
     * 1. 묵시적 형 변환 ( 자동 형 변환 )
     * 2. 명시적 형 변환 ( 강제 형 변환 )
     * 
     * 1-1. 묵시적 형 변환
     * 
     * - 작은 데이터 타입 => 큰 데이터 타입으로 변환할 때
     * - 자바에 의해 '자동으로'' 형 변환이 일어남!
     * ( 형 변환 연산자를 생략할 수 있다.)
     * 
     * < 기본 문법 >
     * 큰 데이터 타입 변수 = 작은 데이터 타입 변수 or 리터럴;
     * ex) 정수의 예
     * byte -> short -> int -> long -> float -> double
     */
    // 묵시적 형 변환 예제
    byte a1 = 10;
    short a2 = 128;
    System.out.println("a1(byte) : " + a1 + ", a2(short) : " + a2);
    a2 = a1;
    // 이 때, 작은(byte) 데이터 a1을 큰 타입(short) 변수 a2에 전달
    // byte 타입 데이터가 short 타입으로 변환!!!
    // => 이러한 과정은 자바의 컴파일러에 의해 자동으로 변환되어짐(자동 형 변환)
    System.out.println("a1(byte) : " + a1 + ", a2(short) : " + a2);

    /*
     * 2-1 ★★★ 명시적 형 변환 ★★★
     * 
     * - 큰 데이터 타입 => 작은 데이터 타입으로 변환할 때,
     * 데이터 오버플로우가 발생할 수 있으므로
     * 자바 컴파일러에 의해 자동으로 형 변환이 일어나지 않는다!!
     * - 반드시 개발자가 형 변환 연산자를 사용하여야 함!
     * - 강제로 형 변환 한 후에도 오버플로우에 의해 기존 데이터가 아닌
     * 다른 데이터가 저장될 수 있는 위험성이 존재함!
     * 
     * ☆ 단, byte, short 타입과 char 타입의 경우,
     * 양수, 음수 표현 범위가 서로 다르므로 상호 강제 형 변환이 필수이다!
     * ( byte <-> char / short <-> byte / short <-> char )
     *
     * <기본 문법>
     * 작은 데이터 타입 변수 = (작은 데이터 타입 명)큰 데이터 타입 변수 or 리버럴;
     */
    // 명시적 형 변환 예제
    byte b1 = 10;
    short b2 = 200;
    System.out.println("b1(byte) : " + b1 + ", b2(short) : " + b2);
    // b1 = b2; // 오류! - Type mismatch: cannot convert from short to byte
    b1 = (byte) b2;
    System.out.println("b1(byte) : " + b1 + ", b2(short) : " + b2);
    // 강제 형 변환에 의해 데이터가 원래의 데이터와 다를 수 있다
    // -> Overflow에 의해
    // byte 크기 : -128 ~ 127
  }
}