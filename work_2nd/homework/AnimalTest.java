package week3_4.homework;

//2번
import java.util.Scanner;

class Animal {
    private String name;
    private String location;
    
    Animal() {
        this("N_none");
    }
    Animal(String n) {
        name = n;
        location = "L_none";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    
}

public class AnimalTest {
    public static void main(String[] args) {
        Animal ani = new Animal();

        Scanner s = new Scanner(System.in);
        System.out.print("input name : ");
        String n = s.next();
        ani.setName(n);

        
        while(true) {
            System.out.print("input location : ");
            String loc = s.next();
            if(loc.equals("land")
                || loc.equals("sea")
                || loc.equals("air")) {
                ani.setLocation(loc);
                break;
            }
            else
                System.out.println("Location input ERROR - RETRY\n");
        }

        System.out.println("name : " + ani.getName() + ", location : " + ani.getLocation());
        s.close();
    }
}
