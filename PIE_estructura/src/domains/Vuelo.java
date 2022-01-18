package domains;

public class Vuelo {

    private int idVuelo;
    private String nombreVuelo;
    private String fechaComienzo;
    private String fechaFin;
    private Ciudad ciudad;
    private Hotel hotel;
    private Paquete paquete;

    public Vuelo() {
    }

    public Vuelo(int idVuelo, String nombreVuelo, String fechaComienzo, String fechaFin, Ciudad ciudad, Hotel hotel, Paquete paquete) {
        this.idVuelo = idVuelo;
        this.nombreVuelo = nombreVuelo;
        this.fechaComienzo = fechaComienzo;
        this.fechaFin = fechaFin;
        this.ciudad = ciudad;
        this.hotel = hotel;
        this.paquete = paquete;
    }

    public int getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }

    public String getNombreVuelo() {
        return nombreVuelo;
    }

    public void setNombreVuelo(String nombreVuelo) {
        this.nombreVuelo = nombreVuelo;
    }

    public String getFechaComienzo() {
        return fechaComienzo;
    }

    public void setFechaComienzo(String fechaComienzo) {
        this.fechaComienzo = fechaComienzo;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }

    @Override
    public String toString() {
        return idVuelo + " - " + nombreVuelo +
                "\n\tFecha de comienzo = " + fechaComienzo +
                "\n\tFecha de fin = " + fechaFin +
                "\n\tCiudad = " + ciudad.getNombreCiudad() +
                "\n\tHotel = " + hotel.getNombreHotel() +
                "\n\tPaquete = " + paquete.getNombrePaquete();
    }
}
