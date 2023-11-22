import estadisticas.Player;

import estadisticas.Team;

public class Main {
    public static void main(String[] args) {
        Team argentina = new Team("Argentina", 2, 3);

        Player dimaria = new Player("Angel Di Maria", 7, "Delantero", argentina);
        Player messi = new Player("Lionel Messi", 10, "Delantero", argentina);
        Player dibu = new Player("Emiliano Martinez", 1, "Arquero", argentina);

        messi.getTeam().getPlayers().add(messi);
        dimaria.getTeam().getPlayers().add(dimaria);
        dibu.getTeam().getPlayers().add(dibu);

        
        argentina.showPlayersList();
    }
}