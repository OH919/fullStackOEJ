package week3_4.homework;

//1번
interface Runnable {
    public void run();
}

class Human implements Runnable {
    String name;
    Human() {
        this("none");
    }
    Human(String n) {
        this.name = n;
    }
    public void run() {
        System.out.println(name + "은 달릴 수 있습니다");
    }
}

//만들어진 인터페이스와 Human 클래스를 test하는 HumanTest 클래스
public class HumanTest {
    public static void main(String[] args) {
        Human h = new Human("Kim");
        Runnable r = h;
        r.run();
        h.run();
    }
}
