package estadisticas;

import java.util.Date;

public class Match {
    private Date date;
    private int visitantGoals;
    private int localGoals;
    private Team visitantTeam;
    private Team localTeam;

    public Match(Team localTeam, Team visitantTeam) {
        setLocalTeam(localTeam);
        setVisitantTeam(visitantTeam);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getVisitantGoals() {
        return visitantGoals;
    }

    public void setVisitantGoals(int visitantGoals) {
        this.visitantGoals = visitantGoals;
    }

    public void incrementVisitantGoals(){
        setVisitantGoals(getVisitantGoals() + 1);
    }

    public int getLocalGoals() {
        return localGoals;
    }

    public void setLocalGoals(int localGoals) {
        this.localGoals = localGoals;
    }

    public void incrementLocalGoals() {
        setLocalGoals(getLocalGoals() + 1); //this.localGoals ++;
    }

    public Team getVisitantTeam() {
        return visitantTeam;
    }

    public void setVisitantTeam(Team visitantTeam) {
        this.visitantTeam = visitantTeam;
    }

    public Team getLocalTeam() {
        return localTeam;
    }

    public void setLocalTeam(Team localTeam) {
        this.localTeam = localTeam;
    }

    public boolean isLocalWinner() {
        return getLocalGoals() > getVisitantGoals();
    }
    public boolean isVisitantWinner() {
        return getLocalGoals() < getVisitantGoals();
    }

    public boolean tieMatch() {
        return getVisitantGoals() == getVisitantGoals();
    }

}