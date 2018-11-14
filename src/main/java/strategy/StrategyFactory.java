package strategy;

/**
 * Created by ysf on 2018/11/14.
 */
public class StrategyFactory {
  public static PriceStrategy getStrategy(MemberType type) {
    if (type == MemberType.PRIMARY) {
      return new PrimaryStrategy();
    } else if (type == MemberType.MIDDLE) {
      return new MiddleStrategy();
    } else {
      return new AdvancedStrategy();
    }
  }
}
