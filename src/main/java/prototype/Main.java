package prototype;

/**
 * Created by ysf on 2018/11/9.
 */
public class Main {

    public static void main(String [] args) {
        Sheep originSheep = new Sheep("duoduo", 2);
        Sheep cloneSheep = originSheep.clone();
        cloneSheep.setName("huahua");
        System.out.println(originSheep);
        System.out.println(cloneSheep);
    }
}
