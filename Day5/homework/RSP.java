package week2_5.homework;

public class RSP {
    public static void main(String[] args) {

        int rand = (int) (Math.random() * 3);
        int num = (int) (Math.random() * 3);

        System.out.println("A가 낸 것 : (" + rst(num) + ")");
        System.out.println("B가 낸 것 : (" + rst(rand) + ") ");

        if (num == rand)
            System.out.println("비겼습니다!");

        else {
            System.out.print("A가 ");
            switch (num) {
                case 0:
                    if (rand == 1)
                        System.out.println("졌습니다..");
                    else
                        System.out.println("이겼습니다!");
                    break;
                case 1:
                    if (rand == 0)
                        System.out.println("이겼습니다!");
                    else
                        System.out.println("졌습니다..");
                    break;
                case 2:
                    if (rand == 0)
                        System.out.println("졌습니다..");
                    else
                        System.out.println("이겼습니다!");
                    break;
                default:
                    System.out.println("Default");
            }
        }
    }

    static String rst(int n) {
        String s = "error";
        if(n == 0) s = "가위";
        else if(n == 1) s = "바위";
        else if(n == 2) s = "보";

        return s;
    }
}