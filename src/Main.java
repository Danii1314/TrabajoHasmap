import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //Daniel Andres Silva Lopez - por el momento lo voy a dejar asi basico pero pienso ponerle mas cosas como vender jugador , comprar jugador etc
        Scanner teclado=new Scanner(System.in);
        Jugador[] jugadores = {
                new Jugador(1, "David Ospina", "Atletico Nacional"),
                new Jugador(3, "Mario Yepes", "Atlanta"),
                new Jugador(12, "Daniel Muñoz", "Crystal Palace F. C"),
                new Jugador(22, "Johan Mojica", "Real Club Deportivo Mallorca"),
                new Jugador(10, "James Rodriguez", "Rayo Vallecano"),
                new Jugador(6, "Richard Ríos", "SE Palmeiras"),
                new Jugador(7, "Luis Dias", "Liverpool FC"),
                new Jugador(11, "Jhon Arias", "Fluminense Football Club"),
                new Jugador(9, "Miguel Borja", "CA River Plate"),
                new Jugador(88, "Mateus Uribe", "Al-Sadd SC"),
                new Jugador(19, "Rafael Borre", "Sport Club Internacional")
        };


        String[] posiciones = {
                "Portero", "Defensa", "Lateral Derecho", "Lateral Izquierdo",
                "Medio Centro Ofensivo", "Medio Centro", "Extremo Izquierdo",
                "Extremo Derecho", "Delantero Central", "Pivote", "Delantero"
        };


        Map<Integer, String> mapaEquipo = new HashMap<>();


        for (int i = 0; i < jugadores.length; i++) {
            mapaEquipo.put(i + 1, posiciones[i] + ": " + jugadores[i]);
        }


int opc=0;
boolean seguir=true;
while (seguir){

    System.out.println("----- Menú -----");
    System.out.println("1. Mostrar Plantel");
    System.out.println("2. Salir");
    System.out.print("Ingrese una opción: ");
    opc = teclado.nextInt();
    switch (opc){
            case 1:for (Map.Entry<Integer, String> entrada : mapaEquipo.entrySet()) {
                System.out.println(entrada.getKey() + ". " + entrada.getValue());
                System.out.println("-----------------------------");

            } break;
        case 2:
            System.out.println("Gracias por visitar al equipo,"+"\t (Codigo en prueba betta jajaja)");
            seguir=false;
        }
    }}
}