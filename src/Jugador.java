public class Jugador {
    int numero;
    String posicion;
    String equipo;

    public Jugador() {
    }

    public Jugador(int numero, String posicion, String equipo) {
        this.numero = numero;
        this.posicion = posicion;
        this.equipo = equipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
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
                ", posicion='" + posicion + '\'' +
                ", equipo='" + equipo + '\'' +
                '}';
    }
}
