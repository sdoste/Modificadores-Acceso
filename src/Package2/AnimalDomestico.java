package Package2;

public class AnimalDomestico extends Animales {
    private String raza;

    public AnimalDomestico(String name, int id, String raza) {
        super(name, id);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    
    
}
