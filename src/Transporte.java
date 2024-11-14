public class Transporte {
    int capacidad;
    double velocidad;

    public Transporte(int capacidad, double velocidad) {
        this.capacidad = capacidad;
        this.velocidad = velocidad;
    }
    public Transporte() {

    }

    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public double getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    //Metodo personalizado
    public void mostrarDatos(){
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Velocidad: " + velocidad);
    }
}
