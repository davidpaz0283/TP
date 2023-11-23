import estadisticas.Match;
import estadisticas.Player;
import estadisticas.Season;
import estadisticas.Team;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static String[][] generatePlayer() {
        String[][] jugadores = new String[3][3];

        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i][0] = JOptionPane.showInputDialog("por favor el nombre del jugador que usa la camiseta: " + (i+1));
            jugadores[i][1] = JOptionPane.showInputDialog("por favor ingrese la posición de: " + jugadores[i][0]);
        }

        return jugadores;
    }
    public static void main(String[] args) {
        Season faseGrupoMundial = new Season();

        faseGrupoMundial.addTeam(new Team("Qatar"));
        faseGrupoMundial.addTeam(new Team("Ecuador"));
        faseGrupoMundial.addTeam(new Team("Senegal"));
        faseGrupoMundial.addTeam(new Team("Paises Bajos"));
        faseGrupoMundial.addTeam(new Team("Inglaterra"));
        faseGrupoMundial.addTeam(new Team("Iran"));
        faseGrupoMundial.addTeam(new Team("EEUU"));
        faseGrupoMundial.addTeam(new Team("Gales"));
        faseGrupoMundial.addTeam(new Team("Argentina"));
        faseGrupoMundial.addTeam(new Team("Arabia Saudita"));
        faseGrupoMundial.addTeam(new Team("México"));
        faseGrupoMundial.addTeam(new Team("Polonia"));
        faseGrupoMundial.addTeam(new Team("Francia"));
        faseGrupoMundial.addTeam(new Team("Australia"));
        faseGrupoMundial.addTeam(new Team("Dinamarca"));
        faseGrupoMundial.addTeam(new Team("Tunez"));
        faseGrupoMundial.addTeam(new Team("España"));
        faseGrupoMundial.addTeam(new Team("Costa Rica"));
        faseGrupoMundial.addTeam(new Team("Alemania"));
        faseGrupoMundial.addTeam(new Team("Japon"));
        faseGrupoMundial.addTeam(new Team("Belgica"));
        faseGrupoMundial.addTeam(new Team("Canada"));
        faseGrupoMundial.addTeam(new Team("Marruecos"));
        faseGrupoMundial.addTeam(new Team("Croacia"));
        faseGrupoMundial.addTeam(new Team("Brasil"));
        faseGrupoMundial.addTeam(new Team("Serbia"));
        faseGrupoMundial.addTeam(new Team("Suiza"));
        faseGrupoMundial.addTeam(new Team("Camerun"));
        faseGrupoMundial.addTeam(new Team("Portugal"));
        faseGrupoMundial.addTeam(new Team("Ghana"));
        faseGrupoMundial.addTeam(new Team("Uruguay"));
        faseGrupoMundial.addTeam(new Team("Corea Del Sur"));



        ArrayList<Team> countries = faseGrupoMundial.getTeams();

        for (int j = 0; j < countries.size(); j++) {
            JOptionPane.showMessageDialog(null, "Vamos a cargar los jugadores de : " + countries.get(j).getName());
            String[][] jugadores = generatePlayer();
            for (int i = 0; i < jugadores.length; i++) {
                new Player(jugadores[i][0], i + 1, jugadores[i][1], countries.get(j));
            }
        }

        for (int i = 0; i < countries.size(); i++) {
            countries.get(i).showPlayersList();
        }

        countries.forEach(country -> country.showPlayersList());

        Match finalMatch = new Match(countries.get(0), countries.get(1));

        finalMatch.incrementLocalGoals();
        finalMatch.incrementVisitantGoals();
        finalMatch.incrementLocalGoals();

    }
}