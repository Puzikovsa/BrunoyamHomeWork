package TicTacGame_New;

public abstract class Player {
    private Cell team;
    private String name;

    public Player(Cell team, String name) {
        this.team = team;
        this.name = name;
    }

    public Cell getTeam() {
        return team;
    }

    public String getName() {
        return name;
    }

    abstract void move();
}
