package Package1;

public class Planta {
    public String nombre;
    private int id;
    String tipo;
    
    public Planta(String nombre, int id, String tipo) {
        this.nombre = nombre;
        this.id = id;
        this.tipo = tipo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
}
