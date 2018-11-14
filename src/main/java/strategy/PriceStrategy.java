package strategy;

/**
 * 不同等级的会员采用不同的价格策略
 * Created by ysf on 2018/11/14.
 */
public interface PriceStrategy {

  public double computePrice(double price);

}
