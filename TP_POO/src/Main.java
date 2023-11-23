import estadisticas.Player;

import estadisticas.Team;

public class Main {
    public static void main(String[] args) {
        Team argentina = new Team("Argentina", 2, 3);

        Player fideo = new Player("Angel Di Maria", 7, "Delantero", argentina);
        Player pulga = new Player("Lionel Messi", 10, "Delantero", argentina);
        Player dibu = new Player("Emiliano Martinez", 1, "Arquero", argentina);
        Player taglia = new Player("Nicolas Tagliafico", 3, "Defensor", argentina);
        Player dePaul = new Player("Rodrigo De Paul", 8, "Medio Campista", argentina);

        System.out.println(pulga.getTeam().getName());

        argentina.showPlayersList();
    }
}
