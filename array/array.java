package array;

public class array {
  public static void main(String[] args) {
    /*
     * 배열 (Array)
     * - 같은 타입 데이터 여러개를 하나의 변수명을 사용하여 연속된 공간으로 다루는 것
     * 
     * < 특징 >
     * 1. 같은 타입의 데이터만 가능
     * 2. 배열 내 자동으로 부여되는 인덱스를 사용 하여 각 요소에 접근 가능 => 인덱스는 0부터 ~ 배열 크기 -1 까지 자동으로 부여
     * 3. 배열의 크기는 배열명.length으로 얻을 수 있음.
     * 4. 사용시 / 선언 -> 생성 -> 초기화 과정을 거쳐야함
     * 5. ★ 한 번 생성된 배열은 크기 변경 불가능
     * 
     * < 기본 문법 >
     * 데이터 타입[] 변수명;
     * - 데이터 타입에 해당하는 배열 타입으로 변수를 선언
     * - 스택영역에 배열 공간의 주소를 저장하는 참조변수만 생성됨!!
     * 아직 데이터를 저장할 수 있는 공간은 생성되기 전, 데이터 저장 불가
     * 
     * < 배열 생성 기본 문법 >
     * 변수명 = new 데이터타입[배열 크기];
     * => new 연산자에 의해 힙(heap)영역에 배열 크기만큼의 메모리 공간이 생성됨!!
     * 해당 배열에 저장되는 데이터의 타입은 지정한 데이터타입으로 정해지며, 생성된 배열 공간의 주소값을 좌변의 참조타입 변수에 저장
     * => 배열 크기만큼의 공간이 생성된 후 배열 공간에 자동으로 인덱스 부여
     * => 생성된 배열 공간은 해당 데이터타입의 기본 값으로 자동 초기화
     */

    int[] score;
    score = new int[5];
    System.out.println("score 배열의 0번 인덱스 : " + score[0]);
    System.out.println("score 배열의 1번 인덱스 : " + score[1]);
    System.out.println("score 배열의 2번 인덱스 : " + score[2]);
    System.out.println("score 배열의 3번 인덱스 : " + score[3]);
    System.out.println("score 배열의 4번 인덱스 : " + score[4]);
    // System.out.println("score 배열의 5번 인덱스 : " + score[5]);
    // 오류 - ArrayIndexOutOfBoundsException: 5

    System.out.println("score 배열의 크기 : " + score.length);

    // 배열 초기화
    score[0] = 80;
    score[1] = 85;
    score[2] = 90;
    score[3] = 95;
    score[4] = 100;

    System.out.println("score 배열의 0번 인덱스 : " + score[0]);
    System.out.println("score 배열의 1번 인덱스 : " + score[1]);
    System.out.println("score 배열의 2번 인덱스 : " + score[2]);
    System.out.println("score 배열의 3번 인덱스 : " + score[3]);
    System.out.println("score 배열의 4번 인덱스 : " + score[4]);

    for (int i = 0; i < score.length; i++) {
      System.out.println(score[i]);
    }

    // --------------------------------

    // < 선언 및 생성 >
    int[] arr = new int[3];

    int[] arr2 = { 10, 20, 30 };

    // int[] arr3 = new int[3] { 10, 20, 30 };
    // => 배열 생성 및 초기화 시 배열 크기 지정 불가능!!

    int[] arr4 = new int[] { 10, 20, 30 };
  }
}
