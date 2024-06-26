package doWhile;

public class doWhile {
  public static void main(String[] args) {
    /*
     * do ~ while 문
     * - while문과 달리 조건을 먼저 판별하지 않고 일단 블럭문을
     * 실행한 뒤 반복이 끝날 때 조건을 판별하여 다음 반복 여부 결정
     * => while문은 조건에 따라 반복문이 단 한 번도 실행되지 않을 수 있지만,
     * do ~ while 문은 조건과 관계없이 '무조건'!! 한 번의 실행은 보장
     * 
     * < 기본 문법 >
     * do{
     * // 반복 실행할 문장
     * } while(조건식);
     * ★ 주의! while문 뒤에는 반드시!! 세미콜론으로 문장을 마무리!
     */

    int i = 11;

    do {
      System.out.println(i + " : Hello, World!");
      i++;
    } while (i <= 10);
    // => i값이 10보다 크더라도 조건식이 첫 문장에 없으므로 블록문 내의 문장을 먼저 실행한 후
    // 차후에 while문을 통해 조건식을 판별하여 반복여부 결정하므로
    // 블록문 내의 문장이 최소한 한 번은 실행됨
    System.out.println("while문 종료");

  }
}
