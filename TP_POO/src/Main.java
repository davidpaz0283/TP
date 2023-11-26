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
        Llave semiFinalMundial = new Llave();

        semiFinalMundial.addTeam(new Team("Argentina"));
        semiFinalMundial.addTeam(new Team("Croacia"));
        semiFinalMundial.addTeam(new Team("Francia"));
        semiFinalMundial.addTeam(new Team("Marruecos"));


        ArrayList<Team> countries = semiFinalMundial.getTeams();
        for (int j = 0; j < countries.size(); j++) {
            JOptionPane.showMessageDialog(null, "Vamos a cargar los jugadores de : " + countries.get(j).getName());
            String[][] jugadores = generatePlayer();
            for (int i = 0; i < jugadores.length; i++) {
                new Player(jugadores[i][0], i + 1, jugadores[i][1], countries.get(j));
            }
        }

        semiFinalMundial.addMatch(new Match(
                countries.get(0),
                countries.get(1))
        );
        semiFinalMundial.addMatch(new Match(
                countries.get(2),
                countries.get(3)
        ));

        Match semi1 = semiFinalMundial.getMatches().get(0);
        semi1.incrementLocalGoals();
        semi1.incrementLocalGoals();
        semi1.incrementLocalGoals();

        Match semi2 = semiFinalMundial.getMatches().get(1);
        semi2.incrementLocalGoals();
        semi2.incrementLocalGoals();


        Llave fasefinalMundial = new Llave();

        fasefinalMundial.setTeams(semiFinalMundial.getNextStepTeams());


        fasefinalMundial.addMatch(new Match(
                fasefinalMundial.getTeams().get(0),
                fasefinalMundial.getTeams().get(1))
        );


        Match finalMatch = fasefinalMundial.getMatches().get(0);
        finalMatch.incrementLocalGoals();


        fasefinalMundial.getNextStepTeams().forEach(team -> {
            team.showPlayersList();
        });


    }
}