package HomeWork1;

public class Team {

    public String name;
    private int run;
    private int jump;
    private int crowl;

    public Team(String name, int run, int jump, int crowl) {
        this.name = name;
        this.run = run;
        this.jump = jump;
        this.crowl = crowl;
    }

    String showResults() {
        return this.name + " run " + this.run + " m, jump " +  this.jump + "m, crowl" + this.crowl + " m ";

    }

    int getRun() {
        return this.run;
    }

    int getJump() {
        return this.jump;
    }

    int getCrowl() {
        return this.crowl;
    }








}
