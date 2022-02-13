package HomeWork1;

public class Main {

    public static void main(String[] args) {

        Team[] team = {
                new Team("Artem", 200, 1, 10 ),
                new Team("Boris", 300, 2, 20),
                new Team("Vladimir", 400, 1, 30)
        };

        Course course = new Course(250, 2, 20);

        doIt(team, course);
        showResults(team);

    }

    private static void doIt(Team[] team, Course course) {
        System.out.println("Champions: ");
        for (int i = 0; i< team.length; i++)
            if (team[i].getRun() >= course.getRunDist() &&
                team[i].getJump() >= course.getJumpHeight() &&
                team[i].getCrowl() >= course.getCrowlDist()) {
                System.out.println(team[i].name);
            }

    }

    private static void showResults(Team[] team) {
        System.out.println("All team: ");
        for (int i = 0; i< team.length; i++)
            System.out.println(team[i].showResults());
    }

}
