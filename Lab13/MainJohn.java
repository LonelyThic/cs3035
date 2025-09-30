public class MainJohn {
    public static void main(String[] args) {
        John helpfulJohn = new John();

        System.out.println();
        System.out.println("This output of Public:");
        System.out.println();

        helpfulJohn.MowLawn("Alice");
        helpfulJohn.FixCar("Bob", "Toyota");
        helpfulJohn.PaintHouse("Charlie");

        John busyJohn = new John();

        System.out.println();
        System.out.println("This output of Private:");
        System.out.println();

        busyJohn.PrivateTasks();
    }
}