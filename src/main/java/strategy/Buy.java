package strategy;

import sun.misc.BASE64Decoder;

/**
 * Created by ysf on 2018/11/14.
 */
public class Buy {
  private MemberType type;

  public Buy(MemberType type) {
    this.type = type;
  }

  public void buy(double price) {
    StrategyFactory.getStrategy(type).computePrice(price);
  }

}
