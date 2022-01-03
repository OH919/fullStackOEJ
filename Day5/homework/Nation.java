package week2_5.homework;

public class Nation {
    static String planet;   //행성이름 - static

    private String name;//나라이름  -private
    public int size;    //면적      -public
    public int num;     //인구수    -public

    public String getName() {
        return name;
    }
    public void setName(String name) {  //나라이름변경
        this.name = name;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {     //면적변경
        this.size = size;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {       //인구수변경
        this.num = num;
    }
}

class Korea extends Nation {
    int aa;         //특수 멤버변수
    void kor() {    //특수 메소드
        System.out.println("한국입니다");
    }
}   //Nation을 상속한 나라 1번째

class Japan extends Nation {
    int bb;         //특수 멤버변수
    void jap() {    //특수 메소드
        System.out.println("일본입니다");
    }
}   //Nation을 상속한 나라 2번째

class China extends Nation {
    int cc;         //특수 멤버변수
    void chi() {    //특수 메소드
        System.out.println("중국입니다");
    }
}   //Nation을 상속한 나라 3번째
