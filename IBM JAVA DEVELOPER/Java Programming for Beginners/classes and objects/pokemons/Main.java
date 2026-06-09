package pokemons;

public class Main {
    public static void main(String[] args) {
        Pokemon p1 = new Pokemon();
        p1.name = "Pikachu";
        p1.level = 10;

        System.out.println(p1.name + " " + p1.level);
        p1.attack();
    }
}

