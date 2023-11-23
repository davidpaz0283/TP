import estadisticas.Match;
import estadisticas.Player;

import estadisticas.Team;

public class Main {
    public static void main(String[] args) {
        Team argentina = new Team("Argentina", 2, 3);
        Team francia = new Team("Francia", 1, 0);

         new Player("Angel Di Maria", 7, "Delantero", argentina);
         new Player("Lionel Messi", 10, "Delantero", argentina);
         new Player("Emiliano Martinez", 1, "Arquero", argentina);
         new Player("Nicolas Tagliafico", 3, "Defensor", argentina);
         new Player("Rodrigo De Paul", 8, "Medio Campista", argentina);

        new Player("Kylian Mbappe", 7, "Delantero", francia);
        new Player("Antoine Griezman", 7, "Delantero", francia);
        new Player("Hugo Lloris", 1, "Arquero", francia);

        argentina.showPlayersList();
        
        francia.showPlayersList();

        Match finalMatch = new Match(argentina, francia);

        finalMatch.incrementLocalGoals();
        finalMatch.incrementVisitantGoals();
        finalMatch.incrementLocalGoals();



    }
}
