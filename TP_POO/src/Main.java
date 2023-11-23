import estadisticas.Match;
import estadisticas.Player;

import estadisticas.Season;
import estadisticas.Team;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static String[][] generateArgPlayer() {
        String[][] jugadoresArgentina = new String[11][2];

        for (int i = 0; i < jugadoresArgentina.length; i++) {
            jugadoresArgentina[i][0] = JOptionPane.showInputDialog("Por favor ingrese el nombre del jugador que usa la camiseta: " + (i + 1));
            jugadoresArgentina[i][1] = JOptionPane.showInputDialog("Por favor ingrese la posición de: " + jugadoresArgentina[i][0]);
        }
        return jugadoresArgentina;
    }

    public static void main(String[] args) {
        Season faseGrupoMundial = new Season();
        Team argentina = new Team("Argentina", 4, 3);
        Team francia = new Team("Francia", 0, 0);

        faseGrupoMundial.addTeam(argentina);
        faseGrupoMundial.addTeam(francia);

        String[][] jugadoresArgentina = generateArgPlayer();

        for (int i = 0; i < jugadoresArgentina.length; i++) {
            new Player(jugadoresArgentina[i][0], i + 1, jugadoresArgentina[i][1], argentina);
        }
        argentina.showPlayersList();
    }
}