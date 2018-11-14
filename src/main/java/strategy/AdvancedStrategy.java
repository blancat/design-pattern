package strategy;

/**
 * Created by ysf on 2018/11/14.
 */
public class AdvancedStrategy implements PriceStrategy {
  public double computePrice(double price) {
    double currentPrice = price * 0.7;
    System.out.println("使用高级会员,原价为:" + price + ", 优惠后价格:" + currentPrice);
    return currentPrice;
  }
}
