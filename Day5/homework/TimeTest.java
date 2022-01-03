package week2_5.homework;

class Time {
    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23)
            return;
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59)
            return;
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 23)
            return;
        this.second = second;
    }
}

public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time();

        t.setHour(5);
        t.setMinute(30);
        t.setSecond(44);    //0-23초 이외는 if문으로 막혀있기 때문에 0초로 저장된다

        System.out.println(t);  //toString()이 지정되어있지 않기 때문에 원하는 모양의 출력값이 나오지 않는다
        System.out.printf("설정된 시각 : %d시 %d분 %d초", t.getHour(), t.getMinute(), t.getSecond());
    }
}
