// Part 2: Private Methods
// Part 1 code is commented out

class John {

    // Part 1: Public Methods
    /*
     * public void MowLawn(String neighbor) {
     * System.out.println("John is mowing the lawn for " + neighbor + ".");
     * }
     * 
     * public void FixCar(String neighbor, String carModel) {
     * System.out.println("John is fixing " + neighbor + "'s " + carModel + ".");
     * }
     * 
     * public void PaintHouse(String neighbor) {
     * System.out.println("John is painting the house for " + neighbor + ".");
     * }
     */

    // Part 2: Private Methods
    private void MowLawn(String neighbor) {
        System.out.println("John is mowing the lawn for " + neighbor + ".");
    }

    private void FixCar(String neighbor, String carModel) {
        System.out.println("John is fixing " + neighbor + "'s " + carModel + ".");
    }

    private void PaintHouse(String neighbor) {
        System.out.println("John is painting the house for " + neighbor + ".");
    }
}

public class MainJohn {
    public static void main(String[] args) {
        John john = new John();

        // Part 1
        /*
         * john.MowLawn("Mr. Smith");
         * john.FixCar("Mrs. Johnson", "Toyota Camry");
         * john.PaintHouse("The Andersons");
         */
    }
}