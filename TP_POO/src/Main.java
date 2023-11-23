import estadisticas.Match;
import estadisticas.Player;

import estadisticas.Season;
import estadisticas.Team;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static String [][] generatePlayer(){
        String[][] jugadores = new String[2][2];

        for(int i = 0; i < jugadores.length; i++){
            jugadores[i][0] = JOptionPane.showInputDialog("Por favor ingrese el nombre del jugador que usa la camiseta: " + i+1);
            jugadores[i][1] = JOptionPane.showInputDialog("Por favor ingrese la posición de: " + jugadores[i][0]);
        }
        return jugadores;
    }
    public static void main(String[] args) {
        Season faseGrupoMundial = new Season();

        faseGrupoMundial.addTeam(new Team("Argentina"));
        faseGrupoMundial.addTeam(new Team("Francia"));

        ArrayList<Team> countries = faseGrupoMundial.getTeams();


        String[][] jugadoresArgentina = generatePlayer();
        for(int i = 0; i < jugadoresArgentina.length; i++){
            new Player(jugadoresArgentina[i][0], i+1, jugadoresArgentina[i][1], countries.get(0));
        }
        String[][] jugadoresFrancia = generatePlayer();
        for(int i = 0; i < jugadoresFrancia.length; i++){
            new Player(jugadoresFrancia[i][0], i+1, jugadoresFrancia[i][1], countries.get(1));
        }
        String[][] jugadoresAlemania = generatePlayer();
        for(int i = 0; i < jugadoresAlemania.length; i++){
            new Player(jugadoresAlemania[i][0], i+1, jugadoresAlemania[i][1], countries.get(2));
        }
        countries.get(0).showPlayersList();

        Match finalMatch = new Match(countries.get(0), countries.get(1));

        finalMatch.incrementLocalGoals();
        finalMatch.incrementVisitantGoals();
        finalMatch.incrementLocalGoals();



    }
}
