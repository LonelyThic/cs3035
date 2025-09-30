class John {

    // Part 1
    // Public methods
    public void MowLawn(String neighbor) {
        System.out.println("John is mowing the lawn for " + neighbor + ".");
    }

    public void FixCar(String neighbor, String carModel) {
        System.out.println("John is fixing " + neighbor + "'s " + carModel + ".");
    }

    public void PaintHouse(String neighbor) {
        System.out.println("John is painting the house for " + neighbor + ".");
    }

    // Part 2
    // Private methods
    private void Laundry() {
        System.out.println("John is doing laundry.");
    }

    private void Cook(String food) {
        System.out.println("John is cooking " + food + ".");
    }

    private void Research() {
        System.out.println("John is doing research.");
    }

    public void PrivateTasks() {
        Laundry();
        Cook("pasta");
        Research();
    }
}