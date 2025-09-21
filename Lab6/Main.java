class flowerBouquet {
    // Fields
    private String flowerName;
    private String flowerColor;

    // Constructor
    public flowerBouquet(String flowerName, String flowerColor) {
        this.flowerName = flowerName;
        this.flowerColor = flowerColor;
    }

    // Method: whichFlower
    public String whichFlower() {
        return "This flower is a " + flowerColor.toLowerCase() + " colored " + flowerName;
    }

    // Method: sameFlower
    public boolean sameFlower(flowerBouquet other) {
        return this.flowerName.equalsIgnoreCase(other.flowerName) &&
               this.flowerColor.equalsIgnoreCase(other.flowerColor);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating flower objects
        flowerBouquet flower1 = new flowerBouquet("Lily", "White");
        flowerBouquet flower2 = new flowerBouquet("Rose", "Red");
        flowerBouquet flower3 = new flowerBouquet("Lily", "White");

        // Call whichFlower() on flower1
        System.out.println(flower1.whichFlower());

        // Call sameFlower() for two cases
        System.out.println("flower1 and flower2 same? " + flower1.sameFlower(flower2)); // false
        System.out.println("flower1 and flower3 same? " + flower1.sameFlower(flower3)); // true
    }
}