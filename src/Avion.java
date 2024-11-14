public class Avion extends Transporte{
    String tipo;
    double altitudMaxima;

    public Avion(String tipo, double altitudMaxima, int capacidad, double velocidad) {
        super(capacidad, velocidad);
        this.tipo = tipo;
        this.altitudMaxima = altitudMaxima;
    }
    //Para iniciar objetos de la clase padre
    public Avion(int capacidad, double velocidad) {
        super(capacidad, velocidad);
    }

    //Para iniciar objetos de la clase hijo
    public Avion(String tipo, double altitudMaxima) {
        this.tipo = tipo;
        this.altitudMaxima = altitudMaxima;
    }

    public Avion() {

    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getAltitudMaxima() {
        return altitudMaxima;
    }
    public void setAltitudMaxima(double altitudMaxima) {
        this.altitudMaxima = altitudMaxima;
    }

    public void prenderLuces(){
        System.out.println("Luces encendidas");
    }
}
