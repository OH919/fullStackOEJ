package week3_4.homework;

//4번, 5번, 6번
import java.util.Calendar;

abstract class Airplane {
    String date_A;
    String date_B;

    String arr_A;
    String arr_B;
    boolean isDomestic;
    public abstract void setDate_A(int year, int month, int day);
    public abstract void setDate_B(int year, int month, int day);
    public abstract String arrv();
    public abstract String setDate_C();
    public abstract String flight();
}

class AirplaneDate extends Airplane {
    Calendar now = Calendar.getInstance();
    String[] arrKor = new String[] {"김포", "인천", "김해", "제주", "울산"};
    String[] arrEx = new String[] {"도쿄", "상하이", "홍콩", "싱가폴", "쿠알라룸푸르"};

    public void setDate_A(int y, int m, int d) {
        now.set(y, m, d);
        super.date_A = now.get(Calendar.YEAR) + "년 " + now.get(Calendar.MONTH) + "월 " + now.get(Calendar.DAY_OF_MONTH) + "일";
    }
    public void setDate_B(int y, int m, int d) {
        now.set(y, m, d);
        super.date_B = now.get(Calendar.YEAR) + "년 " + now.get(Calendar.MONTH) + "월 " + now.get(Calendar.DAY_OF_MONTH) + "일";
    }
    public String getDate_A() {
        return super.date_A;
    }
    public String getDate_B() {
        return super.date_B;
    }
    public void setArrvA(String arr) {
        arr_A = arr;
    }
    public void setArrvB(String arr) {
        arr_B = arr;
    }
    public String arrv() {
        for(String k : arrKor) {
            for(String x : arrEx) {
                if(arr_A.equals(k) && arr_B.equals(x)) return "국제선";
            }
        }
        for(String k : arrKor) {
            for(String x : arrKor) {
                if(arr_A.equals(k) && arr_B.equals(x)) return "국내선";
            }
        }
        return "도착지 설정 오류";
    }
    public String setDate_C() {
        return now.get(Calendar.DAY_OF_MONTH) + "-" + now.get(Calendar.MONTH) + "-" + now.get(Calendar.YEAR);
    }

    public String flight() {
        if(this.arrv().equals("국내선")) isDomestic = true;
        else if(this.arrv().equals("국제선")) isDomestic = false;

        return "isDomestic : " + isDomestic;
        
    }
}

public class AirplaneTest {
    public static void main(String[] args) {
        AirplaneDate ad = new AirplaneDate();

        ad.setArrvA("김포");
        ad.setArrvB("도쿄");
        ad.setDate_A(2022, 2, 1);
        System.out.println("출발날짜 : " + ad.getDate_A());
        System.out.println(ad.setDate_C());

        ad.setDate_B(2022, 2, 2);
        System.out.println("도착날짜 : " + ad.getDate_B());
        System.out.println(ad.setDate_C());

        System.out.println(ad.arrv());
        System.out.println(ad.flight());
        
        
    }
}
