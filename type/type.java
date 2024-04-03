package type;

public class type {
  public static void main(String[] args) {
    /*
     * 자바에서 사용되는 데이터 타입.
     * 1. 기본 데이터 타입 ( primitive Type ) - 8가지
     * 2. 참조 데이터 타입 ( Reference Type )
     * 
     * 1-1. 기본 데이터 타입 8가지
     * ‣ 정수형 - byte short int long
     * ‣ 실수형 - float double
     * ‣ 논리형 - boolean
     * ‣ 문자형 - char
     * 
     * 2-1.
     * ‣ 기본 데이터 타입 외 모든 타입은 참조 데이터 타입으로 취급한다.
     * ‣ 대표적인 참조 데이터 타입 : String, 배열, 객체...
     * 
     * 상수 ( Constant )
     * - 변하지 않는 데이터 (항상 같은 값을 갖는 데이터 )
     * - 연산, 저장 등의 용도로 사용되는 데이터.
     */

    System.out.println(1);
    System.out.println(3.14);

    System.out.println(100L);
    System.out.println(1.5f);

    System.out.println(true);
    System.out.println(false);

    // 문자형 데이터를 사용하려면 1개의 문자를 ('') 기호로 둘러 싸 표현
    System.out.println('가');

    // 문자열 데이터를 사용하려면 0개 이상의 문자를("") 기호로 둘러 싸 표현
    System.out.println("1");
    System.out.println("가");

    /*
     * char 타입 !
     * - 1개의 문자 데이터를 표현하는 데이터 타입
     * - 반드시 작은따옴표('') 사이에 1개의 문자 데이터가 위치해야함
     * (두 개 이상의 문자, 아무것도 포함되지 않으면 안됨)
     * - 2Byte 크기의 유니코드(Unicode) 체계를 사용하여 전 세계의 모든 문자 표현 가능
     * - 2Byte 크기의 메모리에 '정수형태'로 1개의 문자를 나타냄
     * => 각 정수에 해당하는 문자가 매핑(Mapping)되어 있음
     * => 2Bye = 16bit = 2^16 = 65536개 = 0 ~ 65535 사이의 코드로 표현됨
     * (부호가 불필요하므로 정수형이지만 자신의 메모리 범위 모두 그대로 사용 가능)
     * - 유니코드 표현법으로 문자 데이터를 표현하는 방법 : '\uXXXX'형식으로 표현
     * => 이 때, XXXX부분은 16진수 4자리로 유니코드의 코드값을 표현
     * (10진수 0000 = 16진수 0000, 10진수 65535 = 16진수 FFFF)
     * 
     */
    System.out.println("--------------");
    char ch1 = 'A';
    System.out.println(ch1);

    char ch3 = '\u0041';
    System.out.println(ch3);

    // 이스케이프 문자 : 자바에서 특수한 기능을 수행하는 문자
    //                => 백슬래시(\) 기호 뒤에 1개의 문자를 사용하여 특정 기능을 수행
    //                => 이스케이프 문자로 \를 지정하면 문자 데이터로서의 \기호로 취급됨

    System.out.println('\n'); // 줄바꿈
    System.out.println('\\');
    System.out.println('\'');
  }
}