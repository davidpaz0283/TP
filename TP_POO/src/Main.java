import estadisticas.Player;

import estadisticas.Team;

public class Main {
    public static void main(String[] args) {
        Team argentina = new Team("Argentina", 2, 3);

        Player messi = new Player();
        messi.setName("Lionel Messi");
        messi.setNumber(10);
        messi.setPosition("Delantero");
        messi.setGoalCounter(0);
    }
}