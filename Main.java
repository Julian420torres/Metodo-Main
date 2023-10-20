public class Main {
    public static void main(String[] args) {
        Animal[] animales = new Animal[]{
            new Felinos("Felis silvestris catus", "Maullido", "Ratones", "Doméstico"),
            new Caninos("Canis lupus familiaris", "Ladrido", "Carnívoro", "Doméstico"),
            new Caninos("Canis lupus", "Aullido", "Carnívoro", "Bosque"),
            new Felinos("Panthera leo", "Rugido", "Carnívoro", "Praderas")
        };

        for (Animal animal : animales) {
            System.out.println(animal.getNombreCientifico());
            System.out.println("Sonido: " + animal.getSonido());
            System.out.println("Alimentos: " + animal.getAlimentos());
            System.out.println("Hábitat: " + animal.getHabitat());
            System.out.println();
        }
    }
}
