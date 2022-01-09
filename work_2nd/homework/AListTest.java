package week3_4.homework;

//7번, 8번, 9번
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class AListTest {
    public static void main(String[] args) {
        ArrayList li = new ArrayList();
        Date d = new Date();
        Date d2 = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        
        li.add(sdf.format(d));
        //7
        long[] l = new long[3];
        l[0] = d.getTime() - d2.getTime();

        d.setDate(d.getDate() + 1);
        li.add(sdf.format(d));
        //8
        l[1] = d.getTime() - d2.getTime();

        d.setMonth((int)(Math.random() * 12) + 1);
        d.setDate((int)(Math.random() * 30) + 1);
        li.add(sdf.format(d));
        l[2] = d.getTime() - d2.getTime();

        
        
        System.out.println("==첫번째 값은 현재, 두번째 값은 내일==");
        for(int i = 0; i < li.size(); i++) {
            System.out.println(li.get(i));
            System.out.println("현재 시간과의 차이 : " + l[i]/1000 + "초");
        }
        
    }
}
