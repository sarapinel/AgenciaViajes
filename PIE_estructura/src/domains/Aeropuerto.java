package domains;

public class Aeropuerto {

    private int idAeropuerto;
    private String nombreAeropuerto;

    public Aeropuerto() {
    }

    public Aeropuerto(int idAeropuerto, String nombreAeropuerto) {
        this.idAeropuerto = idAeropuerto;
        this.nombreAeropuerto = nombreAeropuerto;
    }

    public int getIdAeropuerto() {
        return idAeropuerto;
    }

    public void setIdAeropuerto(int idAeropuerto) {
        this.idAeropuerto = idAeropuerto;
    }

    public String getNombreAeropuerto() {
        return nombreAeropuerto;
    }

    public void setNombreAeropuerto(String nombreAeropuerto) {
        this.nombreAeropuerto = nombreAeropuerto;
    }

    @Override
    public String toString() {
        return idAeropuerto + " - " + nombreAeropuerto;
    }
}
