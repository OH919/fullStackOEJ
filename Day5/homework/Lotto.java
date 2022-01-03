package week2_5.homework;

public class Lotto {
    public static void main(String[] args) {
        int lot[] = new int[7];
        int k = 0;
        boolean chk = false;

        System.out.println("<<오늘의 로또 번호 추천>>");
        while(k < lot.length) {
            int r = (int) (Math.random()*45 + 1);
            for(int l : lot) {
                if(l == r) {
                    chk = false;
                    break;
                }
                chk = true;
            }
            if(chk) {
                lot[k] = r;
                if(k == 6) System.out.print("+ 보너스번호 ");
                System.out.print(lot[k++] + " ");
            }
        }
    }
}
