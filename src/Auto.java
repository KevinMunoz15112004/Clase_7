public class Auto extends Transporte{
    String tipo;
    int cilindraje;

    public Auto(String tipo, int cilindraje, int capacidad, double velocidad) {
        super(capacidad, velocidad);
        this.tipo = tipo;
        this.cilindraje = cilindraje;
    }
    //Para iniciar objetos de la clase padre
    public Auto(int capacidad, double velocidad) {
        super(capacidad, velocidad);
    }
    //Para iniciar objetos de la clase hijo
    public Auto(String tipo, int cilindraje) {
        this.tipo = tipo;
        this.cilindraje = cilindraje;
    }

    public Auto(){

    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getCilindraje() {
        return cilindraje;
    }
    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public void prenderRadio(){
        System.out.println("Radio encendida");
    }
}
