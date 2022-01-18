package domains;

public class Hotel {

    private int idHotel;
    private String nombreHotel;
    private int diasEstancia;
    private int numHabitacion;
    private boolean tieneDesayuno;

    public Hotel() {
    }

    public Hotel(int idHotel, String nombreHotel, int diasEstancia, int numHabitacion, boolean tieneDesayuno) {
        this.idHotel = idHotel;
        this.nombreHotel = nombreHotel;
        this.diasEstancia = diasEstancia;
        this.numHabitacion = numHabitacion;
        this.tieneDesayuno = tieneDesayuno;
    }

    public int getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public int getDiasEstancia() {
        return diasEstancia;
    }

    public void setDiasEstancia(int diasEstancia) {
        this.diasEstancia = diasEstancia;
    }

    public int getNumHabitacion() {
        return numHabitacion;
    }

    public void setNumHabitacion(int numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    public boolean isTieneDesayuno() {
        return tieneDesayuno;
    }

    public void setTieneDesayuno(boolean tieneDesayuno) {
        this.tieneDesayuno = tieneDesayuno;
    }

    @Override
    public String toString() {
        return idHotel + " - " + nombreHotel +
                "\n\tDias de estancia = " + diasEstancia +
                "\n\tNumero de la habitacion = " + numHabitacion +
                "\n\tDesayuno = " + tieneDesayuno;
    }
}
