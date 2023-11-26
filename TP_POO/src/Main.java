import estadisticas.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static String[][] generatePlayer() {
        String[][] jugadores = new String[2][2];

        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i][0] = JOptionPane.showInputDialog("por favor el nombre del jugador que usa la camiseta: " + (i+1));
            jugadores[i][1] = JOptionPane.showInputDialog("por favor ingrese la posición de: " + jugadores[i][0]);
        }

        return jugadores;
    }
    public static void main(String[] args) {
        Llave octavosDeFinalMundial = new Llave(); //

        octavosDeFinalMundial.addTeam(new Team("Paises Bajos"));
        octavosDeFinalMundial.addTeam(new Team("EEUU"));

        octavosDeFinalMundial.addTeam(new Team("Argentina"));
        octavosDeFinalMundial.addTeam(new Team("Australia"));

        octavosDeFinalMundial.addTeam(new Team("Japon"));
        octavosDeFinalMundial.addTeam(new Team("Croacia"));

        octavosDeFinalMundial.addTeam(new Team("Brasil"));
        octavosDeFinalMundial.addTeam(new Team("Corea del Sur"));

        octavosDeFinalMundial.addTeam(new Team("Inglaterra"));
        octavosDeFinalMundial.addTeam(new Team("Senegal"));

        octavosDeFinalMundial.addTeam(new Team("Francia"));
        octavosDeFinalMundial.addTeam(new Team("Polonia"));

        octavosDeFinalMundial.addTeam(new Team("Marruecos"));
        octavosDeFinalMundial.addTeam(new Team("España"));

        octavosDeFinalMundial.addTeam(new Team("Portugal"));
        octavosDeFinalMundial.addTeam(new Team("Suiza"));

        ArrayList<Team> countries = octavosDeFinalMundial.getTeams();
        for (int j = 0; j < countries.size(); j++) {
            JOptionPane.showMessageDialog(null, "Vamos a cargar los jugadores de : " + countries.get(j).getName());
            String[][] jugadores = generatePlayer();
            for (int i = 0; i < jugadores.length; i++) {
                new Player(jugadores[i][0], i + 1, jugadores[i][1], countries.get(j));
            }
        }

        octavosDeFinalMundial.addMatch(new Match(
                countries.get(0),
                countries.get(1))
        );
        octavosDeFinalMundial.addMatch(new Match(
                countries.get(2),
                countries.get(3))
        );
        octavosDeFinalMundial.addMatch(new Match(
                countries.get(4),
                countries.get(5))
        );
        octavosDeFinalMundial.addMatch(new Match(
                countries.get(6),
                countries.get(7))
        );
        octavosDeFinalMundial.addMatch(new Match(
                countries.get(8),
                countries.get(9))
        );
        octavosDeFinalMundial.addMatch(new Match(
                countries.get(10),
                countries.get(11))
        );
        octavosDeFinalMundial.addMatch(new Match(
                countries.get(12),
                countries.get(13))
        );
        octavosDeFinalMundial.addMatch(new Match(
                countries.get(14),
                countries.get(15)
        ));

        Match octavos1 = octavosDeFinalMundial.getMatches().get(0);
        octavos1.incrementLocalGoals();
        octavos1.incrementLocalGoals();
        octavos1.incrementLocalGoals();
        octavos1.incrementVisitantGoals();

        Match octavos2 = octavosDeFinalMundial.getMatches().get(1);
        octavos2.incrementLocalGoals();
        octavos2.incrementLocalGoals();
        octavos2.incrementVisitantGoals();

        Match octavos3 = octavosDeFinalMundial.getMatches().get(2);
        octavos3.incrementLocalGoals();
        octavos3.incrementLocalGoals();
        octavos3.incrementVisitantGoals();

        Match octavos4 = octavosDeFinalMundial.getMatches().get(3);
        octavos4.incrementLocalGoals();
        octavos4.incrementLocalGoals();
        octavos4.incrementLocalGoals();
        octavos4.incrementLocalGoals();
        octavos4.incrementVisitantGoals();

        Match octavos5 = octavosDeFinalMundial.getMatches().get(4);
        octavos5.incrementVisitantGoals();
        octavos5.incrementVisitantGoals();
        octavos5.incrementVisitantGoals();

        Match octavos6 = octavosDeFinalMundial.getMatches().get(5);
        octavos6.incrementLocalGoals();
        octavos6.incrementLocalGoals();
        octavos6.incrementLocalGoals();
        octavos6.incrementVisitantGoals();

        Match octavos7 = octavosDeFinalMundial.getMatches().get(6);
        octavos7.incrementLocalGoals();
        octavos7.incrementLocalGoals();
        octavos7.incrementVisitantGoals();

        Match octavos8 = octavosDeFinalMundial.getMatches().get(7);
        octavos8.incrementLocalGoals();
        octavos8.incrementLocalGoals();
        octavos8.incrementLocalGoals();
        octavos8.incrementLocalGoals();
        octavos8.incrementLocalGoals();
        octavos8.incrementLocalGoals();
        octavos8.incrementVisitantGoals();


        octavosDeFinalMundial.getNextStepTeams().forEach(team -> {
            team.showPlayersList();
        });
    }
}