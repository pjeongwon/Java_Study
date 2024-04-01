public class identifier {
  public static void main(String[] args) {
    /*
     * 식별자 ( Identifier ) - 자바에서 특정 대상을 구별하는 이름
     * - 식별자는 중복될 수 없다. < '유일한' 이름이어야 함! >
     * => 중복 시 오류
     * - 식별자는 반드시 작성 규칙에 따라 작성해야함.
     * 
     * < 식별자 작성 규칙 >
     * 1. 영문자, 숫자, 특수문자($, _) 사용 가능
     * 2. 첫 글자에 숫자 사용 금지!
     * 3. 대소문자를 구별함 ( aaa != AAA )
     * 4. 공백 사용 불가
     * 5. 예약어 사용 불가
     * => 자바에서 미리 예약해둔 이름 ( ex: int, static, public, ... )
     * < 권장사항 >
     * 6. 길이 제한이 없음
     * 7. 단어 조합일 경우 Camel-case 표기법 사용
     * 8. 의미 있는 단어 사용 권장
     * 9. 한글은 사용 가능하나 지양
     */

    int myAge;
    // int 7Eleven;
    int aaa;
    int AAA;

    int max_score;

    // int public;
    int 나이;
  }
}
