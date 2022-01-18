package domains;

public class Ciudad {

    private int idCiudad;
    private String nombreCiudad;
    private Aeropuerto aeropuerto;

    public Ciudad() {
    }

    public Ciudad(int idCiudad, String nombreCiudad, Aeropuerto aeropuerto) {
        this.idCiudad = idCiudad;
        this.nombreCiudad = nombreCiudad;
        this.aeropuerto = aeropuerto;
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public Aeropuerto getAeropuerto() {
        return aeropuerto;
    }

    public void setAeropuerto(Aeropuerto aeropuerto) {
        this.aeropuerto = aeropuerto;
    }

    @Override
    public String toString() {
        return idCiudad + " - " + nombreCiudad + "\n\tAeropuerto = " + aeropuerto.getNombreAeropuerto();
    }
}
