package domains;

public class Experiencia {

    private int idExperiencia;
    private String nombreExperiencia;

    public Experiencia() {
    }

    public Experiencia(int idExperiencia, String nombreExperiencia) {
        this.idExperiencia = idExperiencia;
        this.nombreExperiencia = nombreExperiencia;
    }

    public int getIdExperiencia() {
        return idExperiencia;
    }

    public void setIdExperiencia(int idExperiencia) {
        this.idExperiencia = idExperiencia;
    }

    public String getNombreExperiencia() {
        return nombreExperiencia;
    }

    public void setNombreExperiencia(String nombreExperiencia) {
        this.nombreExperiencia = nombreExperiencia;
    }

    @Override
    public String toString() {
        return idExperiencia + " - " + nombreExperiencia;
    }
}
