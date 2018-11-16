package template;

/**
 * Created by ysf on 2018/11/16.
 */
public abstract class GoToWork {

  final void process() {
    wakeUp();
    way();
    readyWork();
  }

  private void wakeUp() {
    System.out.println("i'm wake up");
  }

  abstract public void way();

  private void readyWork() {
    System.out.println("ready work");
  }
}
