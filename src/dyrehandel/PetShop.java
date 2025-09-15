package dyrehandel;

public class PetShop {
    public static void main(String[] args) {
        // Step 1: Original basket
        Pets[] shop = new Pets[5c4]; // increase size to 4
        shop[0] = new Pets("Dog", "Woof!", "Black and Tan");
        shop[1] = new Pets("Cat", "Meow!", "Orange Tabby");
        shop[2] = new Pets("Lizard", "*lizard sounds*", "Green");
        shop[3] = new Pets("Horse", "Neigh", "Red");
        shop[4] = new Pets("Fish", "blubub", "Gold"); // added new mushroom


        // Step 2: Print all mushrooms
        System.out.println("All pets in our store:");
        for (Pets m : shop) {
            System.out.println(m);
        }
    }
}