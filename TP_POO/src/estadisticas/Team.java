package estadisticas;

import  java.util.ArrayList;
public class Team {
    private String name;
    private ArrayList<Player> players;
    private int tableScore;
    private int goalCounter;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player player) {

    }
    public void removePlayer (Player player){

    }
}
