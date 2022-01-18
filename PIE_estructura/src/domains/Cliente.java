package domains;

public class Cliente {

    private int id;
    private String nombre;
    private Vuelo vuelo;

    public Cliente() {
    }

    public Cliente(int id, String nombre, Vuelo vuelo) {
        this.id = id;
        this.nombre = nombre;
        this.vuelo = vuelo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    @Override
    public String toString() {
        return id + " - " + nombre + "\n\tVuelo = " + vuelo.getNombreVuelo();
    }
}
