public class flowerBouquet {
    private String flowerName;
    private String flowerColor;

    public flowerBouquet(String flowerName, String flowerColor) {
        this.flowerName = flowerName;
        this.flowerColor = flowerColor;
    }

    public String whichFlower(){
        return "This flower is a " + flowerColor.toLowerCase() + " colored " + flowerName;
    }

    public boolean sameFlower(flowerBouquet other) {
        return this.flowerName.equalsIgnoreCase(other.flowerName) &&
        this.flowerColor.equalsIgnoreCase(other.flowerColor);
    }
}