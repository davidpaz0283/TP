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
        Llave cuartosDeFinalMundial = new Llave(); //

        cuartosDeFinalMundial.addTeam(new Team("Paises Bajos"));
        cuartosDeFinalMundial.addTeam(new Team("Argentina"));

        cuartosDeFinalMundial.addTeam(new Team("Inglaterra"));
        cuartosDeFinalMundial.addTeam(new Team("Francia"));

        cuartosDeFinalMundial.addTeam(new Team("Marruecos"));
        cuartosDeFinalMundial.addTeam(new Team("Portugal"));

        cuartosDeFinalMundial.addTeam(new Team("Brail"));
        cuartosDeFinalMundial.addTeam(new Team("Croacia"));


        ArrayList<Team> countries = cuartosDeFinalMundial.getTeams();
        for (int j = 0; j < countries.size(); j++) {
            JOptionPane.showMessageDialog(null, "Vamos a cargar los jugadores de : " + countries.get(j).getName());
            String[][] jugadores = generatePlayer();
            for (int i = 0; i < jugadores.length; i++) {
                new Player(jugadores[i][0], i + 1, jugadores[i][1], countries.get(j));
            }
        }

        cuartosDeFinalMundial.addMatch(new Match(
                countries.get(0),
                countries.get(1))
        );
        cuartosDeFinalMundial.addMatch(new Match(
                countries.get(2),
                countries.get(3))
        );
        cuartosDeFinalMundial.addMatch(new Match(
                countries.get(4),
                countries.get(5))
        );
        cuartosDeFinalMundial.addMatch(new Match(
                countries.get(6),
                countries.get(7)
        ));

        Match cuartos1 = cuartosDeFinalMundial.getMatches().get(0);
        cuartos1.incrementLocalGoals();
        cuartos1.incrementVisitantGoals();
        cuartos1.incrementVisitantGoals();

        Match cuartos2 = cuartosDeFinalMundial.getMatches().get(1);
        cuartos2.incrementLocalGoals();
        cuartos2.incrementVisitantGoals();
        cuartos2.incrementVisitantGoals();

        Match cuartos3 = cuartosDeFinalMundial.getMatches().get(2);
        cuartos3.incrementLocalGoals();

        Match cuartos4 = cuartosDeFinalMundial.getMatches().get(2);
        cuartos4.incrementLocalGoals();
        cuartos4.incrementLocalGoals();
        cuartos3.incrementVisitantGoals();

        cuartosDeFinalMundial.getNextStepTeams().forEach(team -> {
            team.showPlayersList();
        });
    }
}