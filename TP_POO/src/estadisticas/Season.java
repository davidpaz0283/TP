package estadisticas;

import  java.util.ArrayList;

import  java.util.Date;
public class Season {
    private String name;
    private Date startDate;
    private Date finishDate;
    private ArrayList<Team> teams;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public void addTeam(Team team){

    }

    public void removeTeam(Team team){

    }
    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }
}
