public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        auto1.prenderRadio();
        auto1.mostrarDatos();

        Auto auto2 = new Auto("Deportivo", 80,5,60.0);
        auto2.prenderRadio();
        auto2.mostrarDatos();

        Auto auto3 = new Auto(6, 100);
        auto3.prenderRadio();
        auto3.mostrarDatos();

        Auto auto4 = new Auto("Comercial", 2000);
        auto4.prenderRadio();
        auto4.mostrarDatos();

        Bicicleta bicicleta = new Bicicleta("Carrera", 10, 1,10.0);
        Bicicleta bicicleta2 = new Bicicleta();
        Avion avion = new Avion("Comercial", 1200,150,800.0);
        Avion avion2 = new Avion();

        auto2.mostrarDatos();
        bicicleta2.mostrarDatos();
        avion2.mostrarDatos();
    }
}