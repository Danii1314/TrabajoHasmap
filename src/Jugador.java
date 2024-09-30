public class Jugador {
    int numero;
    String nombre;
    String equipo;

    public Jugador() {
    }

    public Jugador(int numero, String nombre, String equipo) {
        this.numero = numero;
        this.nombre = nombre;
        this.equipo = equipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "numero=" + numero +
                ", Nombre='" + nombre + '\'' +
                ", equipo='" + equipo + '\'' +
                '}';
    }
}
