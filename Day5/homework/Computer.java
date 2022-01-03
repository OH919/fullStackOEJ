package week2_5.homework;

public class Computer {
    public static void main(String[] args) {

        Comp[] c = new Comp[] {new Comp1(), new Comp2(), new Comp3()};

        for(Comp cmp : c) {
            cmp.start();
        }
    }
}


class Comp {
    String name;
    void start() {
        System.out.println(name + " 가동합니다");
    }
}

class Comp1 extends Comp {
    Comp1() {
        super.name = "부품1";
    }
}

class Comp2 extends Comp {
    Comp2() {
        super.name = "부품2";
    }
}

class Comp3 extends Comp {
    Comp3() {
        super.name = "부품3";
    }
}

