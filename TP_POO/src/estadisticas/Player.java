package estadisticas;

public class Player {
    private String name;
    private int number;
    private String position;
    private int goalCounter;
    private Team team;

    public Player() {

    }

    public Player(String name, int number, String position, Team team) {
        this.setName(name);
        this.setNumber(number);
        this.setPosition(position);
        this.setTeam(team);
        this.addToTeamList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getGoalCounter() {
        return goalCounter;
    }

    public void setGoalCounter(int goalCounter) {
        this.goalCounter = goalCounter;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public void addToTeamList(Team team) {
        if (this.getTeam() == null) {
            team.addPlayer(this);
        } else {
            this
                    .getTeam()
                    .getPlayers()
                    .add(this);
        }
    }
        public void addToTeamList() {
            if (this.getTeam() == null) return;

            this
                    .getTeam().
                    getPlayers().
                    add(this);
        }
    }

