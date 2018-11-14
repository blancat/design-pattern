package strategy;

/**
 * Created by ysf on 2018/11/14.
 */
public class Main {

  public static void main(String [] args) {
    double originPrice = 100;
    new Buy(MemberType.PRIMARY).buy(originPrice);
    new Buy(MemberType.MIDDLE).buy(originPrice);
    new Buy(MemberType.ADVANCED).buy(originPrice);
  }
}
