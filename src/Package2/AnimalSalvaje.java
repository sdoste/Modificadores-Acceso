package Package2;

public class AnimalSalvaje extends Animales{
    private String nombreLatin;

    public AnimalSalvaje(String name, int id, String nombreLatin) {
        super(name, id);
        this.nombreLatin = nombreLatin;
    }

    public String getNombreLatin() {
        return nombreLatin;
    }

    public void setNombreLatin(String nombreLatin) {
        this.nombreLatin = nombreLatin;
    }

 
    
}
