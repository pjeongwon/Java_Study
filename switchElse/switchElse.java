package switchElse;

public class switchElse {
  public static void main(String[] args) {
    /*
     * switch문 (switch ~ case )
     * - if문과 유사하게 조건에 따른 실행 문장을 달리하는 조건문
     * - case문의 값은 중복될 수 없으며, 순서는 상관없음
     * - case문 실행 중 'break문'을 만나면 현재 switch문을 빠져나감(종료)
     * - default문은 일치하는 case문이 없을 경우 default문을 실행함
     * => 생략 가능!
     * ★ if문은 실행 시점에서 조건식을 판별하여 실행할 문장을 결정하지만,
     * switch문은 컴파일(번역)시점에 미리 실행할 문장이 결정되므로
     * if문보다 실행 속도가 빠르다!
     * 
     * < 기본 문법 >
     * switch(조건식){
     * case 값1 :
     * // 조건식의 결과가 값1과 일치할 경우 실행
     * [break;]
     * case 값2 :
     * // 조건식의 결과가 값2과 일치할 경우 실행
     * [break;]
     * case 값n :
     * // 조건식의 결과가 값n과 일치할 경우 실행
     * [break;]
     * 
     * [default :] // 일치하는 case문이 없을 경우 실행
     */

    int num = 3;

    switch (num) { // 조건식(결과가 정수, 문자열 중 하나)
      // 조건으로 제시된 num에 해당하는 값을 case문으로 하나씩 비교(범위 지정 불가)

      case 1: // 조건식 결과가 1일 경우 실행할 문장들 기술
        System.out.println("num = 1");

      case 2: // 조건식 결과가 2일 경우 실행할 문장들 기술
        System.out.println("num = 2");

      case 3: // 조건식 결과가 3일 경우 실행할 문장들 기술
        System.out.println("num = 3");

      case 4: // 조건식 결과가 4일 경우 실행할 문장들 기술
        System.out.println("num = 4");

      default: // 조건식 결과가 1, 2, 3, 4 중 일피하는 경우가 없을 경우 실행할 문장들 기술
        System.out.println("num = 1 ~ 4가 아닌 나머지");
    }
    // 결과 값
    // num = 3
    // num = 4
    // num = 1 ~ 4가 아닌 나머지

    // break; 가 없을 경우 해당하는 case문 아래 모든 case를 실행하기 때문에
    // 사용 시 이를 유의해야함!!!!!
  }
}
