import estadisticas.Player;

import estadisticas.Team;

public class Main {
    public static void main(String[] args) {
        Team argentina = new Team("Argentina", 2, 3);

        Player messi = new Player("Lionel Messi", 10, "Delantero", argentina);

        messi.getTeam().getPlayers().add(messi);

        System.out.println(messi.getTeam().getName());

    }
}