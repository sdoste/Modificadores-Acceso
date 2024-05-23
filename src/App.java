import Package1.Arbol;
import Package1.Planta;
import Package2.AnimalDomestico;
import Package2.AnimalSalvaje;

public class App {
    public static void main(String[] args) throws Exception {

        Planta planta = new Planta("Rosa", 1, "Flor");
        Arbol arbol = new Arbol("Pino", 2, "Conífera");

       
        AnimalSalvaje animalSalvaje = new AnimalSalvaje("León", 3, "Panthera leo");
        AnimalDomestico animalDomestico = new AnimalDomestico("Perro", 4, "Labrador");
        
        System.out.println("Planta:");
        System.out.println("Nombre: " + planta.nombre);
        System.out.println("ID: " + planta.getId());
        System.out.println("Tipo: " + planta.getTipo());

        System.out.println("\nArbol:");
        System.out.println("Nombre: " + arbol.getNombre());
        System.out.println("ID: " + arbol.getId());
        System.out.println("Tipo: " + arbol.getTipo());

        System.out.println("\nAnimal Salvaje:");
        System.out.println("Nombre: " + animalSalvaje.getName());
        System.out.println("ID: " + animalSalvaje.getId());
        System.out.println("Nombre Latin: " + animalSalvaje.getNombreLatin());

        System.out.println("\nAnimal Domestico:");
        System.out.println("Nombre: " + animalDomestico.getName());
        System.out.println("ID: " + animalDomestico.getId());
        System.out.println("Raza: " + animalDomestico.getRaza());

    }
}
