package TicTacGame_New;

public abstract class Player {
    private final Cell team;
    private final String name;
    private final int sum;

    public Player(Cell team, String name, int sum) {
        this.team = team;
        this.name = name;
        this.sum = sum;
    }

    public Cell getTeam() {
        return team;
    }

    public String getName() {
        return name;
    }

    public int getSum() {
        return sum;
    }

    abstract void move();
}
