import java.util.Scanner;

public class AnimalFarm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Animal[] animals = new Animal[4]; // array of references
        int anmlIdx = 0;

        while (true) {

            System.out.println(
                    "Press 1 to view the animals" +
                    "\nPress 2 to add animals" +
                    "\nPress any other key to exit");

            String userAction = sc.nextLine();

            if (userAction.equals("1")) {

                for (int i = 0; i < animals.length; i++) {
                    if (animals[i] != null) {
                        System.out.println(animals[i]);
                    }
                }

            } else if (userAction.equals("2")) {

                if (anmlIdx == animals.length) {
                    System.out.println("4 animals added already, cannot add more animals.");
                    continue;
                }

                System.out.println(
                        "Which animal do you want to create?" +
                        "\nPress 1 for Dog" +
                        "\nPress 2 for Cat" +
                        "\nPress 3 for Cow");

                String animalChoice = sc.nextLine();

                if (animalChoice.equals("1")) {

                    System.out.println("Enter the name of the dog");
                    String dogName = sc.nextLine();

                    Animal anmlTmp = new Dog(dogName);

                    System.out.println("Enter what the dog eats");
                    String dogFood = sc.nextLine();

                    anmlTmp.setFood(dogFood);

                    animals[anmlIdx++] = anmlTmp;

                } else if (animalChoice.equals("2")) {

                    System.out.println("Enter the name of the cat");
                    String catName = sc.nextLine();

                    Animal anmlTmp = new Cat(catName);

                    System.out.println("Enter what the cat eats");
                    String catFood = sc.nextLine();

                    anmlTmp.setFood(catFood);

                    animals[anmlIdx++] = anmlTmp;

                } else if (animalChoice.equals("3")) {

                    System.out.println("Enter the name of the cow");
                    String cowName = sc.nextLine();

                    Animal anmlTmp = new Cow(cowName);

                    System.out.println("What does the cow eat");
                    String cowFood = sc.nextLine();

                    anmlTmp.setFood(cowFood);

                    animals[anmlIdx++] = anmlTmp;

                } else {
                    System.out.println("Invalid animal choice.");
                }

            } else {
                System.out.println("Exiting program...");
                break; // Exit the while loop
            }
        }

        // Scanner is closed only after the loop finishes
        sc.close();
    }
}