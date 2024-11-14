public class Bicicleta extends Transporte{
    String tipo;
    int marcha;

    public Bicicleta(String tipo, int marcha, int capacidad, double velocidad) {
        super(capacidad, velocidad);
        this.tipo = tipo;
        this.marcha = marcha;
    }
    public Bicicleta() {

    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getMarcha() {
        return marcha;
    }
    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public void darAviso(){
        System.out.println("Baje del avion");
    }

}
