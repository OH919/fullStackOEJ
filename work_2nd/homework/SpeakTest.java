package week3_4.homework;

//3번
interface Speak {
    void silent();
    void loud();
}

// 이전 과제의 Human 클래스와 충돌하여 Human2 로 변경했습니다.
class Human2 implements Speak {
    boolean speakLoud;

    @Override
    public void silent() {
        speakLoud = false;
        System.out.println("그의 목소리는 큰가요 : " + speakLoud);
    }

    @Override
    public void loud() {
        speakLoud = true;
        System.out.println("그의 목소리는 큰가요 : " + speakLoud);
    }

}

class Tiger extends Animal {
    Tiger() {
        super("Tiger");
    }
    void crying() {
        System.out.println("어흥");
    }
}

public class SpeakTest {
    public static void main(String[] args) {
        Human2 h = new Human2();
        Speak sp = h;
        sp.loud();
        sp.silent();

        Animal a = new Tiger();
        System.out.println("동물 이름 : " + a.getName());
    }    
}
