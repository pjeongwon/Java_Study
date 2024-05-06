package array;

public class array2 {
  public static void main(String[] args) {

    /*
     * [2차원 배열]
     * - 행, 열 구조로 아루어진 배열
     * 
     * < 기본 문법 >
     * 데이터타입[][] 변수명;
     * 
     * 변수명 = new 데이터타입[행크기][열크기];
     * 
     * < 선언 및 생성 >
     * 데이터타입[][] 변수명 = new 데이터타입[행크기][열크기];
     * 
     * < 접근 기본 문법 >
     * 변수명[행index][열index];
     * 
     * < 2차원 배열 크기 >
     * - 행 크기 : 변수명.length
     * - 특정 열의 크기 : 변수명[행index].length
     */

    int[][] arr = new int[2][3];
    arr[0][0] = 1;
    arr[0][1] = 2;
    arr[0][2] = 3;
    arr[1][0] = 4;
    arr[1][1] = 5;
    arr[1][2] = 6;

    System.out.println("행 크기 : " + arr.length);
    System.out.println("0번 행의 열 크기 : " + arr[0].length);

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.println(arr[i][j]);
      }
    }

    System.out.println("=================");
    // 2차원 배열 선언, 생성, 초기화
    int[][] arr2 = { { 1, 2, 3 }, { 4, 5, 6 } };
    for (int i = 0; i < arr2.length; i++) {
      for (int j = 0; j < arr2[i].length; j++) {
        System.out.println(arr2[i][j]);
      }
    }

    /*
     * 2차원 배열의 동적 크기 할당 !
     * - 2차원 배열은 행을 먼저 생성! 후 별도의 공간에 열이 생성되는 구조이다
     * 따라서, 행을 만든 후 열 생성 시 항상 같은 크기일 필요 없음
     * 
     * < 생성 문법 >
     * 데이터타입[][] 변수명 = new 데이터타입[행크기][];
     * 변수명[행번호] = new 데이터타입[열크기];
     */

    System.out.println("=================");

    int[][] arr3 = new int[2][];
    arr3[0] = new int[3];
    arr3[1] = new int[5];

    for (int i = 0; i < arr3.length; i++) {
      for (int j = 0; j < arr3[i].length; j++) {
        System.out.println(arr3[i][j] + " ");
      }
      System.out.println();
    }
  }
}
