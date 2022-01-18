package domains;

public class Paquete {

    private int idPaquete;
    private String nombrePaquete;
    private Experiencia experiencia;

    public Paquete() {
    }

    public Paquete(int idPaquete, String nombrePaquete, Experiencia experiencia) {
        this.idPaquete = idPaquete;
        this.nombrePaquete = nombrePaquete;
        this.experiencia = experiencia;
    }

    public int getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(int idPaquete) {
        this.idPaquete = idPaquete;
    }

    public String getNombrePaquete() {
        return nombrePaquete;
    }

    public void setNombrePaquete(String nombrePaquete) {
        this.nombrePaquete = nombrePaquete;
    }

    public Experiencia getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(Experiencia experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return idPaquete + " - " + nombrePaquete + "\n\tExperiencia = " + experiencia.getNombreExperiencia();
    }
}
