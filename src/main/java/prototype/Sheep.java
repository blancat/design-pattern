package prototype;

/**
 * Created by ysf on 2018/11/16.
 */
public class Sheep implements Cloneable {
  private String name;
  private int age;

  public Sheep(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Sheep{" +
      "name='" + name + '\'' +
      ", age=" + age +
      '}';
  }

  public Sheep clone() {
    Sheep sheep = null;
    try {
      sheep = (Sheep) super.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return sheep;
  }
}
