package week2_5.homework;

public class SoccerTest {
    public static void main(String[] args) {
        Team t1 = new Team("team1");
        Team t2 = new Team("team2");

        int num = t1.getRand();
        int rand = t2.getRand();

        System.out.println("팀 " + t1.getTeamName() + "와(과) 팀 " + t2.getTeamName() + "의 경기 결과는 :");

        //이하 가위바위보 문제의 RSP.java와 동일
        if (num == rand)
            System.out.println("두 팀이 비겼습니다!");

        else {
            System.out.print(t1.getTeamName() + "(이)가 ");
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
}

class Soccer {
    void sport() {
        System.out.println("축구하는 사람입니다;");
    }
}
class Team extends Soccer {
    private String teamName;
    private int rand;

    public Team() {
        teamName = null;
        rand = 0;
    }
    public Team(String teamName) {
        this.teamName = teamName;
        rand = (int) (Math.random() * 3);
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getRand() {
        return rand;
    }
}

class Player extends Team {
    private String playerName;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}