public class Perro {
    private String nombre;
    private boolean salvaje;
    private String raza;
    private int edad;

    public Perro(String nombre, boolean salvaje, String raza, int edad) {
        if (salvaje) {
            this.salvaje = salvaje;
        } else {
            this.nombre = nombre;
            this.raza = raza;
            this.edad = edad;
        }
    }

    private void anadirAño() {
        this.edad = this.edad + 1;
    }
}