public class Main {
    public static void main (String[] args) {
        flowerBouquet flower1 = new flowerBouquet("Lily","White");
        flowerBouquet flower2 = new flowerBouquet("Rose","Red");
        flowerBouquet flower3 = new flowerBouquet("Lily","White");

        System.out.println(flower1.whichFlower());

        System.out.println("Flower 1 and Flower 2 same? " + flower1.sameFlower(flower2));
        System.out.println("Flower 1 and Flower 3 same? " + flower1.sameFlower(flower3));
    }
}