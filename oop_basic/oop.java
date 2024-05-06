package oop_basic;

public class oop {
  public static void main(String[] args) {

    /*
     * oop?
     * - object-oriented programming
     * - 프로그램을 수 많은 '객체(object)'라는 기본 단위로 나누고 이들의 상호작용으로 서술하는 방식
     * 
     * 객체 구현 단계 - 정의된 클래스에 대한 인스턴스(객체) 생성
     * - 힙 메모리 공간에 인스턴스를 생성하면 '주소값'이 부여된다
     * 해당 인스턴스의 주소값을 '참조변수'에 저장
     * 참조변수를 통해 인스턴스에 접근하도록 하는 단계
     * 
     * < 기본 문법 >
     * 클래스명 참조변수명;
     * 참조변수명 = new 클래스명();
     * => 클래스명 참조변수명 = new 클래스명();
     * 
     * < 인스턴스 멤버에 접근하는 기본 문법 >
     * 참조 변수명.멤버변수명 or 참조 변수명.메서드명()
     */
    Student student = new Student();

    // 참조변수를 사용하여 생성된 인스턴스에 접근
    // 인스턴스 내의 멤버변수 값을 변경
    System.out.println("학번 : " + student.id);
    System.out.println("학번 : " + student.name);
    System.out.println("학과 명 : " + student.className);

    student.id = 20202222;
    student.name = "홍길동";
    student.className = "컴퓨터";

    System.out.println("학번 : " + student.id);
    System.out.println("학번 : " + student.name);
    System.out.println("학번 : " + student.className);
  }
}
